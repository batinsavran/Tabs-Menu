plugins {
    id("com.android.application")
    id("kotlin-android")
}

android {
    compileSdkVersion(34)

    defaultConfig {
        applicationId = "com.example.myapplication"
        minSdkVersion(29)
        targetSdkVersion(34)
        versionCode = 1
        versionName = "1.0"
        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    buildTypes {
        getByName("release") {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
    }

    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }

    kotlinOptions {
        jvmTarget = "1.8"
    }

    buildFeatures {
        dataBinding = true
    }
    namespace = "com.example.myapplication"
}

dependencies {
    implementation(libs.androidx.core.ktx.vlatestversion)
    implementation(libs.androidx.appcompat.vlatestversion)
    implementation(libs.material)
    implementation(libs.androidx.activity.ktx)
    implementation(libs.androidx.constraintlayout.vlatestversion)
    implementation(libs.androidx.fragment.ktx)
    testImplementation(libs.junit.vlatestversion)
    androidTestImplementation(libs.androidx.junit.vlatestversion)
    androidTestImplementation(libs.androidx.espresso.core.vlatestversion)
}
