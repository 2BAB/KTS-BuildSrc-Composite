pluginManagement {
    plugins {
        id("com.android.application") version "4.2.2"
        kotlin("android") version "1.5.21"
        `kotlin-dsl` apply false
    }
    repositories {
        mavenCentral()
        google()
        gradlePluginPortal()
    }
}

include(":app")
includeBuild("plugin-config")

rootProject.children.forEach {
    it.buildFileName = "${it.name}.gradle.kts"
}
