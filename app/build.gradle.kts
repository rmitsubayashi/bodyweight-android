plugins {
    id("com.android.application")
    id("kotlin-android")
    id("kotlin-android-extensions")
}

android {
    compileSdkVersion(Configs.compileSDKVersion)
    defaultConfig {
        applicationId = Configs.applicationID
        minSdkVersion(Configs.minSdkVersion)
        targetSdkVersion(Configs.targetSdkVersion)
        versionCode = Configs.versionCode
        versionName = Configs.versionName
        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    buildTypes {
        getByName("release") {
            isMinifyEnabled = false
            //proguard settings only needed in base module
            proguardFiles(getDefaultProguardFile("proguard-android-optimize.txt"), "proguard-rules.pro", "retrofit.pro")
        }
    }
    //some internal libraries use Java 8
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
}


dependencies {
    implementation(Deps.kotlin)
    implementation(Deps.appCompat)
    implementation(Deps.androidX)
    implementation(Deps.koin)
    implementation(Deps.design)
    implementation(Deps.constraintLayout)
    implementation(Deps.navigationUI)
    implementation(Deps.fragmentNavigation)
    testImplementation(Deps.junit)
    androidTestImplementation(Deps.androidTestRunner)
    implementation(project(Modules.Features.shop))
    implementation(project(Modules.Features.exerciselist))
}