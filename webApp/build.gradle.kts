plugins {
    kotlin("multiplatform")
    id("org.jetbrains.compose")
}

group = "com.hyeonseo"
version = "1.0-SNAPSHOT"

kotlin {
    js(IR) {
        browser {
            useCommonJs()
        }
        binaries.executable()
    }

    sourceSets {
        val jsMain by getting {
            dependencies {
                implementation(compose.runtime)
                implementation(compose.ui)
                implementation(compose.foundation)
                implementation(compose.material)
            }
        }
    }
}

compose.experimental {
    web.application {}
}
