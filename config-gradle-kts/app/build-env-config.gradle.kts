import me.xx2bab.buildinaction.prebuilt.BuildEnvStubExtension

buildscript {
    repositories {
        google()
        mavenCentral()
        mavenLocal()
    }
    dependencies {
        classpath("org.jetbrains.kotlin:kotlin-gradle-plugin:1.4.31")
        classpath("com.android.tools.build:gradle:4.1.1")
        classpath("me.2bab.buildinaction:buildEnv:+")
    }
}

apply(plugin = "me.2bab.buildenvstub")
configure<BuildEnvStubExtension> {
    textSize = 14
}