include(":slack")
project(":slack").projectDir = file("../slack")

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