include(":app")

includeBuild("build-env"){
    dependencySubstitution {
        substitute(module("me.2bab.buildinaction:buildEnv"))
            .with(project(":plugin-config"))
    }
}

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