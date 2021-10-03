plugins {
    `kotlin-dsl`
    `java-gradle-plugin`
}

group = "me.2bab.buildinaction"
version = "SNAPSHOT"

repositories {
    google()
    maven {
        setUrl("https://plugins.gradle.org/m2/")
    }
    mavenCentral()
}

dependencies {
    implementation(gradleApi())
    implementation(kotlin("stdlib-jdk8"))
    implementation("com.android.tools.build:gradle:4.1.1")
    implementation("com.squareup.okhttp3:okhttp:4.9.0")
}

gradlePlugin {
    plugins.register("slack") {
        id = "me.2bab.buildinaction.slack"
        implementationClass = "me.xx2bab.buildinaction.slack.SlackNotifyPlugin"
    }
}