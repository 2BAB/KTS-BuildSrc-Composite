buildscript {

    project.extra["kotlinVersion"] = "1.4.31"
    project.extra["agpVersion"] = "4.1.1"

    repositories {
        google()
        mavenCentral()
        mavenLocal()
    }

    dependencies {
        classpath("org.jetbrains.kotlin:kotlin-gradle-plugin:${project.extra["kotlinVersion"]}")
        classpath("com.android.tools.build:gradle:${project.extra["agpVersion"]}")
        classpath("me.2bab.buildinaction:buildEnv:+")
    }

}

allprojects {
    repositories {
        google()
        mavenCentral()
        mavenLocal()
    }
}


task("clean") {
    delete(rootProject.buildDir)
}
