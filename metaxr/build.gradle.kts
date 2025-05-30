plugins {
    id("com.android.library")
    kotlin("android")
    id("org.jetbrains.compose")
}

android {
    compileSdk = 34
    defaultConfig {
        minSdk = 26
    }
}

dependencies {
    implementation(project(":common"))
    // TODO: Add Meta Spatial SDK dependency
}
