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
    implementation("androidx.compose.runtime:runtime:1.6.0")
    // TODO: Add Jetpack XR SDK dependency when available
}
