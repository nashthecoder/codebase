plugins {
    alias(libs.plugins.androidApplication)
    alias(libs.plugins.jetbrainsKotlinAndroid)
    alias(libs.plugins.compose.compiler)
    id("com.google.android.libraries.mapsplatform.secrets-gradle-plugin")
    id("org.jetbrains.kotlin.plugin.serialization")
}

secrets {
    propertiesFileName = "secrets.properties"
}

android {
    namespace = "com.masilotti.hikingjournal"
    compileSdk = 35

    defaultConfig {
        applicationId = "com.masilotti.hikingjournal"
        minSdk = 28
        targetSdk = 35
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner =
            "androidx.test.runner.AndroidJUnitRunner"
    }

    buildTypes {
        debug {
            buildConfigField(
                type ="String",
                name = "BASE_URL",
                value = "\"http://10.0.2.2:3000\""
            )
        }

        release {
            buildConfigField(
                type ="String",
                name = "BASE_URL",
                // NOTE: Your IP address will be different.
                value = "\"http://192.168.50.139:3000\""
            )
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
    }

    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_11
        targetCompatibility = JavaVersion.VERSION_11
    }

    kotlinOptions {
        jvmTarget = "11"
    }

    buildFeatures {
        compose = true
        buildConfig = true
    }
}

dependencies {

    implementation(libs.androidx.core.ktx)
    implementation(libs.androidx.appcompat)
    implementation(libs.material)
    implementation(libs.androidx.activity)
    implementation(libs.androidx.constraintlayout)
    implementation("dev.hotwire:core:1.1.3")
    implementation("dev.hotwire:navigation-fragments:1.1.3")
    implementation(platform("androidx.compose:compose-bom:2024.12.01"))
    implementation("androidx.compose.material3:material3")
    implementation("androidx.compose.ui:ui-tooling-preview")
    implementation("com.google.maps.android:maps-compose:6.1.0")
    implementation("org.jetbrains.kotlinx:kotlinx-serialization-json:1.8.0")
    debugImplementation("androidx.compose.ui:ui-tooling")
    testImplementation(libs.junit)
    androidTestImplementation(libs.androidx.junit)
    androidTestImplementation(libs.androidx.espresso.core)
}
