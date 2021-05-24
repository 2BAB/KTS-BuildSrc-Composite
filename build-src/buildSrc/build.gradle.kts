plugins {
    id("org.gradle.kotlin.kotlin-dsl")
}

repositories {
    maven {
        setUrl("https://plugins.gradle.org/m2/")
    }
    google()
    mavenCentral()
}

dependencies {
    implementation(kotlin("stdlib"))
    implementation(project(":slack"))
}