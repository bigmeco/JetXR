plugins {
    id("com.android.application")
    kotlin("android")
    id("org.jetbrains.compose")
}

android {
    namespace = "com.jetxr.androidsample"
    compileSdk = 34
    defaultConfig {
        applicationId = "com.jetxr.androidsample"
        minSdk = 26
        targetSdk = 34
    }
}


dependencies {
    implementation(project(":common"))
    implementation(project(":androidxr"))
}
