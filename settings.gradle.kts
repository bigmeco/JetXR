pluginManagement {
    repositories {
        gradlePluginPortal()
        google()
        mavenCentral()
        maven("https://maven.pkg.jetbrains.space/public/p/compose/dev")
    }
    plugins {
        id("org.jetbrains.compose") version "1.5.10"
        id("com.android.library") version "8.3.0"
        id("com.android.application") version "8.3.0"
        kotlin("android") version "1.9.0"
        kotlin("multiplatform") version "1.9.0"
    }
}


dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        google()
        mavenCentral()
    }
}

rootProject.name = "JetXR"
include(
    ":common",
    ":androidxr",
    ":metaxr",
    ":samples:androidxr-sample"
)
