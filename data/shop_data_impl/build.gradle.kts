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
    }
}

dependencies {
    implementation(project(Modules.Data.shop))
    implementation(Deps.kotlin)
    implementation(Deps.koin)
    implementation(Deps.moshi)
    implementation(Deps.retrofit)
}