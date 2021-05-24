include(":plugin-config")
includeBuild("../slack") {
    dependencySubstitution {
        substitute(module("me.2bab.buildinaction:slack"))
            .with(project(":"))
    }
}

pluginManagement {
    plugins {
        id("org.gradle.kotlin.kotlin-dsl") version "2.1.4"
    }
    repositories {
        gradlePluginPortal()
        mavenCentral()
        google()
    }
}