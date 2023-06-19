package com.ksmpartners.quarkus.domino.client.deployment;

import com.dominodatalab.api.model.DominoVersion;
import io.quarkus.deployment.IsDevelopment;
import io.quarkus.deployment.annotations.BuildProducer;
import io.quarkus.deployment.annotations.BuildStep;
import io.quarkus.devui.spi.page.CardPageBuildItem;
import io.quarkus.devui.spi.page.ExternalPageBuilder;
import io.quarkus.devui.spi.page.Page;
import io.quarkus.devui.spi.page.PageBuilder;

/**
 * Dev UI card for displaying important details such as the library version.
 */
public class DominoClientDevUIProcessor {

    @BuildStep(onlyIf = IsDevelopment.class)
    void createCard(BuildProducer<CardPageBuildItem> cardPageBuildItemBuildProducer) {
        final CardPageBuildItem card = new CardPageBuildItem();

        final PageBuilder<ExternalPageBuilder> versionPage = Page.externalPageBuilder("Version")
                .icon("font-awesome-solid:book")
                .url("https://github.com/ksmpartners/domino-java-client")
                .doNotEmbed()
                .staticLabel(DominoVersion.class.getPackage().getImplementationVersion());
        card.addPage(versionPage);

        card.setCustomCard("qwc-domino-card.js");

        cardPageBuildItemBuildProducer.produce(card);
    }
}