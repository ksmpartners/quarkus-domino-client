package com.ksmpartners.quarkus.domino.client.deployment;

import com.dominodatalab.api.model.DominoVersion;
import io.quarkus.deployment.annotations.BuildProducer;
import io.quarkus.deployment.annotations.BuildStep;
import io.quarkus.deployment.builditem.CombinedIndexBuildItem;
import io.quarkus.deployment.builditem.FeatureBuildItem;
import io.quarkus.deployment.builditem.IndexDependencyBuildItem;
import io.quarkus.deployment.builditem.nativeimage.ReflectiveClassBuildItem;
import org.jboss.jandex.ClassInfo;
import org.jboss.jandex.DotName;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

class QuarkusDominoClientProcessor {

    private static final String FEATURE = "domino";

    @BuildStep
    FeatureBuildItem feature() {
        return new FeatureBuildItem(FEATURE);
    }

    @BuildStep
    void indexTransitiveDependencies(BuildProducer<IndexDependencyBuildItem> index) {
        index.produce(new IndexDependencyBuildItem("com.ksmpartners", "domino-java-client"));
        index.produce(new IndexDependencyBuildItem("org.openapitools", "jackson-databind-nullable"));
        index.produce(new IndexDependencyBuildItem("org.apache.httpcomponents", "httpmime"));
    }

    @BuildStep
    void registerForReflection(BuildProducer<ReflectiveClassBuildItem> reflectiveClass,
                               CombinedIndexBuildItem combinedIndex) {
        // All Model Objects
        final List<String> classNames = new ArrayList<>(collectClassesInPackage(combinedIndex, DominoVersion.class.getPackageName()));

        reflectiveClass.produce(ReflectiveClassBuildItem.builder(classNames.toArray(new String[0])).methods(true).build());
    }

    public List<String> collectClassesInPackage(CombinedIndexBuildItem combinedIndex, String packageName) {
        final List<String> classes = new ArrayList<>();
        final List<DotName> packages = new ArrayList<>(combinedIndex.getIndex().getSubpackages(packageName));
        packages.add(DotName.createSimple(packageName));
        for (DotName aPackage : packages) {
            final List<String> packageClasses = combinedIndex.getIndex()
                    .getClassesInPackage(aPackage)
                    .stream()
                    .map(ClassInfo::toString)
                    .collect(Collectors.toList());
            classes.addAll(packageClasses);
        }
        return classes;
    }
}