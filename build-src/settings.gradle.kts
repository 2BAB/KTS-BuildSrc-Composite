include(":app")

rootProject.children.forEach {
    it.buildFileName = "${it.name}.gradle.kts"
}

pluginManagement {
    repositories {
        mavenCentral()
        google()
        gradlePluginPortal()
    }
}