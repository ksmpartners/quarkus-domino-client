<div align="center">

<img src="https://github.com/ksmpartners/quarkus-domino-client/blob/main/integration-tests/src/main/resources/quarkus.svg" height="70" width="67">
<img src="https://github.com/ksmpartners/quarkus-domino-client/blob/main/integration-tests/src/main/resources/plus-sign.svg" height="70" >
<a href="https://www.dominodatalab.com/" alt="Domino Data Lab">
   <img class="spinner" loading="lazy" height="70" width="116" src="https://www.dominodatalab.com/hubfs/NBM/domino-logo-spinner.webp" alt="Domino Data Logo - Graphic part">
   <img loading="lazy" height="70" src="https://www.dominodatalab.com/hubfs/NBM/domino-logo-text.webp" alt="Domino Data Logo - Text part">
</a>

# Quarkus Domino Data Lab Client
</div>
<br>

[![Maven](https://img.shields.io/maven-central/v/com.ksmpartners/quarkus-domino-client.svg?style=for-the-badge)](https://repo1.maven.org/maven2/com/ksmpartners/quarkus-domino-client/)
[![License](https://img.shields.io/github/license/ksmpartners/quarkus-domino-client?logo=mit&style=for-the-badge)](https://opensource.org/licenses/MIT)
[![Java CI with Maven](https://img.shields.io/github/actions/workflow/status/ksmpartners/quarkus-domino-client/build.yml?branch=main&logo=GitHub&style=for-the-badge)](https://github.com/ksmpartners/quarkus-domino-client/actions/workflows/build.yml)
[![Quarkus](https://img.shields.io/badge/quarkus-power-blue?logo=quarkus&style=for-the-badge)](https://github.com/quarkusio/quarkus)

[Domino Data Lab](https://www.dominodatalab.com/) Quarkus extension is a library that wraps the [Domino Java Client](https://github.com/ksmpartners/domino-java-client) for interacting with Domino.
This extension allows for GraalVM native compilation of the required code to build native applications.

# Usage

The library is available on Maven Central for use in Maven/Gradle/Ivy etc.

**Apache Maven:**
```xml
<dependency>
    <groupId>com.ksmpartners</groupId>
    <artifactId>quarkus-domino-client</artifactId>
    <version>${domino.version}</version>
</dependency>
```

**Gradle:**
```groovy
implementation group: 'com.ksmpartners', name: 'quarkus-domino-client', version: '${domino.version}'
```

For more information see: [Domino Java Client](https://github.com/ksmpartners/domino-java-client)

# Release

- Run `mvn versions:set -DgenerateBackupPoms=false -DnewVersion=5.5.1` to update all modules versions
- Commit and push the changes to GitHub
- In GitHub create a new release titled `5.5.1` to tag this release
- Run `mvn clean deploy -Prelease` to push to Maven Central

(Replace `5.5.1` in the steps above with the actual SEMVER release number.)

# License

Licensed under the [MIT](https://en.wikipedia.org/wiki/MIT_License) license.

`SPDX-License-Identifier: MIT`

# Copyright

Domino and Domino Data Lab are © 2023 Domino Data Lab, Inc. Made in San Francisco. 
