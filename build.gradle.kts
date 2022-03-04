plugins {
    java
    id("com.palantir.graal") version "0.9.0"
}

graal {
    mainClass("SearchForMe")
    outputName("search-for-me")

    option("-H:EnableURLProtocols=http,https")
    option("-H:+AddAllCharsets")

    option("--enable-all-security-services")
    option("--allow-incomplete-classpath")
    option("--no-fallback")
}

repositories {
    mavenCentral()
}

dependencies {
    annotationProcessor("info.picocli:picocli-codegen:4.6.3")

    implementation("com.codeborne:selenide:6.3.3",)
    implementation("info.picocli:picocli:4.6.3")
}
