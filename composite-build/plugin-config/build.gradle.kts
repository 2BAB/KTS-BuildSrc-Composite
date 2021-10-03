plugins {
    `kotlin-dsl`
    `java-gradle-plugin`
}

// To make it available as direct dependency
group = "me.2bab.buildinaction"
version = "SNAPSHOT"

dependencies {
    implementation(gradleApi())
    implementation(kotlin("stdlib-jdk8"))
    implementation("com.android.tools.build:gradle:4.1.1")
    implementation("me.2bab.buildinaction:slack:+")
}

repositories {
    google()
    mavenCentral()
}
