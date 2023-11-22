plugins {
    kotlin("jvm") version libs.versions.kotlin.version apply false
    kotlin("multiplatform") version libs.versions.kotlin.version apply false
    id("org.jetbrains.compose") version libs.versions.compose.version apply false
}

allprojects {
    repositories {
        google()
        mavenCentral()
        maven("https://maven.pkg.jetbrains.space/public/p/compose/dev")
    }
}
