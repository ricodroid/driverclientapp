plugins {
    alias(libs.plugins.kotlinMultiplatform)
    alias(libs.plugins.androidLibrary)
    id("co.touchlab.skie") version "0.4.19"
    kotlin("plugin.serialization") version "1.9.20"
}

kotlin {
    androidTarget {
        compilations.all {
            kotlinOptions {
                jvmTarget = "1.8"
            }
        }
    }
    
    listOf(
        iosX64(),
        iosArm64(),
        iosSimulatorArm64()
    ).forEach {
        it.binaries.framework {
            baseName = "shared"
            isStatic = true
        }
    }

    sourceSets {
        commonMain.dependencies {
        // android・iOS共通ライブラリ
            implementation(libs.kotlinx.coroutines.core)
        }
        androidMain.dependencies {
        // android用ライブラリ
            implementation(libs.androidx.lifecycle.viewmodel.ktx)
        }
        iosMain.dependencies {
        // iOS用ライブラリ
        }
        commonTest.dependencies {
            implementation(libs.kotlin.test)
        }
    }

    task("testClasses")
}

android {
    namespace = "com.example.driver_client_app"
    compileSdk = 34
    defaultConfig {
        minSdk = 24
    }
}
