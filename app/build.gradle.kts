plugins {
    alias(libs.plugins.android.application)
}

android {
    namespace = "com.mu.mealcardauthentication"
    compileSdk = 34

    defaultConfig {
        applicationId = "com.mu.mealcardauthentication"
        minSdk = 30
        targetSdk = 34
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    buildTypes {
        release {
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
}

dependencies {

    implementation(libs.appcompat)
    implementation(libs.material)
    implementation(libs.activity)
    implementation(libs.constraintlayout)
    testImplementation(libs.junit)
    androidTestImplementation(libs.ext.junit)
    androidTestImplementation(libs.espresso.core)
    implementation ("com.google.mlkit:barcode-scanning:17.0.3")
    implementation ("androidx.camera:camera-core:1.2.1")
    implementation ("androidx.camera:camera-camera2:1.2.1")
    implementation ("androidx.camera:camera-lifecycle:1.2.1")
    implementation ("androidx.camera:camera-view:1.2.1")
    implementation ("androidx.appcompat:appcompat:1.6.1")
    implementation ("com.google.android.material:material:1.9.0")
    implementation ("androidx.constraintlayout:constraintlayout:2.1.4")
}