import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
    id("com.android.library")
    kotlin("android")
    kotlin("android.extensions")
    kotlin("kapt")
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

    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
}

dependencies {
    implementation(project(Modules.Data.shop))
    implementation(Deps.kotlin)
    implementation(Deps.koin)
    implementation(Deps.moshi)
    implementation(Deps.retrofit)
    implementation(Deps.room)
    implementation(Deps.roomCoroutinesAndKtx)
    implementation(Deps.workManager)
    kapt(Deps.roomAnnotations)
}

// 1.8 needed for WorkManager
tasks.withType<KotlinCompile> {
    kotlinOptions {
        jvmTarget = "1.8"
    }
}