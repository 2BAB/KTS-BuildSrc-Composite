//include(":plugin-config")
includeBuild("../plugins/slack") {
    dependencySubstitution {
        substitute(module("me.2bab.buildinaction:slack"))
            .with(project(":"))
    }
}

pluginManagement {
    plugins {
        `kotlin-dsl`
    }
    repositories {
        gradlePluginPortal()
        mavenCentral()
        google()
    }
}