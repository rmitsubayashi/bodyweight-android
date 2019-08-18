plugins {
    id("com.android.library")
    id("kotlin-android")
    id("kotlin-android-extensions")
}

android {
    compileSdkVersion(Configs.compileSDKVersion)
    defaultConfig {
        minSdkVersion(Configs.minSdkVersion)
        targetSdkVersion(Configs.targetSdkVersion)
        versionCode = Configs.versionCode
        versionName = Configs.versionName
        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    sourceSets {
        getByName("main").java.setSrcDirs(listOf("src/main/kotlin"))
        getByName("test").java.setSrcDirs(listOf("src/unitTest/kotlin", "src/androidTest/kotlin"))
        getByName("androidTest").java.setSrcDirs(listOf("src/androidTest/kotlin"))
        getByName("main").res.setSrcDirs(Configs.generateResourcePaths("common", "list"))
    }

    testOptions {
        unitTests.isIncludeAndroidResources = true
    }
}

dependencies {
    implementation(project(":data:shop_data_impl"))
    implementation(project(":data:shop_data"))
    implementation(Deps.navigationUI)
    implementation(Deps.fragmentNavigation)
    implementation(Deps.liveData)

    testImplementation(Deps.mockk)
    testImplementation (Deps.architectureComponentsCoreTesting)
    testImplementation (Deps.coroutineTesting)

    implementation(Deps.kotlin)
    implementation(Deps.appCompat)
    implementation(Deps.androidX)
    implementation(Deps.koin)
    implementation(Deps.koinViewModel)

    testImplementation(Deps.junit)
    testImplementation(Deps.robolectric)
    testImplementation(Deps.androidTestRunner)
    testImplementation(Deps.espresso)
    testImplementation(Deps.truth)
    testImplementation(Deps.koinTest)
    testImplementation(Deps.fragmentTesting)


    androidTestImplementation(Deps.junit)
    androidTestImplementation(Deps.androidTestRunner)
    androidTestImplementation(Deps.espresso)
    androidTestImplementation(Deps.truth)
    androidTestImplementation(Deps.koinTest)
    androidTestImplementation(Deps.fragmentTesting)
}