<div align="center">
<img src="https://github.com/quarkiverse/quarkus-antivirus/blob/main/docs/modules/ROOT/assets/images/quarkus.svg" width="67" height="70" ><img src="https://github.com/quarkiverse/quarkus-antivirus/blob/main/docs/modules/ROOT/assets/images/plus-sign.svg" height="70" ><img src="https://github.com/ksmpartners/quarkus-domino-client/blob/main/domino-logo.svg" height="70" >

# Quarkus Domino Data Lab Client
</div>


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

Run in `GitHub Actions` the `Release` workflow and enter version number and next SNAPSHOT number.

# License

Licensed under the [MIT](https://en.wikipedia.org/wiki/MIT_License) license.

`SPDX-License-Identifier: MIT`

# Copyright

Domino and Domino Data Lab are © 2023 Domino Data Lab, Inc. Made in San Francisco. 
