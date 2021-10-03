plugins {
    id("com.android.application")
    kotlin("android")
    id("me.xx2bab.buildinaction.prebuilt.slack-config")
}

android {
    compileSdkVersion(30)
    buildToolsVersion("30.0.3")
    defaultConfig {
        applicationId = "me.xx2bab.buildinaction.app"
        minSdkVersion(21)
        targetSdkVersion(30)
        versionCode = 1
        versionName = "1.0"
    }
    buildTypes {
        getByName("debug") {
            isMinifyEnabled = false
        }
    }

    lintOptions {
        isAbortOnError = false
    }

    setOf("main", "test", "androidTest").forEach {
        sourceSets[it].java.srcDir("src/$it/kotlin")
    }
}

dependencies {
    implementation("org.jetbrains.kotlin:kotlin-stdlib:1.5.31")
}
