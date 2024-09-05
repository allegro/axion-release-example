plugins {
    java
    id("pl.allegro.tech.build.axion-release") version "skip-release-tasks-SNAPSHOT"
    application
    `maven-publish`
}

scmVersion{
    scmVersion {
        unshallowRepoOnCI.set(true)
        releaseOnlyOnReleaseBranches.set(true)
    }
}

repositories {
    mavenCentral()
}

application {
    mainClass.set("axion.release.example.App")
}

dependencies {
    testImplementation("org.junit.jupiter:junit-jupiter-api:5.8.1")
    testRuntimeOnly("org.junit.jupiter:junit-jupiter-engine:5.8.1")
}

tasks.test {
    useJUnitPlatform()
}
