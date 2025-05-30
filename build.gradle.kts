plugins {
    kotlin("multiplatform") version "1.9.0" apply false
    id("org.jetbrains.compose") version "1.5.0" apply false
}

allprojects {
    repositories {
        google()
        mavenCentral()
    }
}
