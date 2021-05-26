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
}
gradlePlugin {
    plugins {
        create("buildenv") {
            id = "me.2bab.buildenvstub"
            implementationClass = "me.xx2bab.buildinaction.prebuilt.BuildEnvStubPlugin"
        }
    }
}