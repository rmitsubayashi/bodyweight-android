buildscript {
    repositories {
        google()
        jcenter()
        
    }

    dependencies {
        classpath("com.android.tools.build:gradle:3.5.0")
        classpath("org.jetbrains.kotlin:kotlin-gradle-plugin:1.3.50")
        // helps keep gradle dependencies updated
        classpath("com.github.ben-manes:gradle-versions-plugin:0.22.0")
    }
}

plugins {
    id("io.gitlab.arturbosch.detekt") version "1.0.1"
    id("com.github.ben-manes.versions") version "0.22.0"
}

allprojects {
    apply {
        from("$rootDir/gradlescripts/detekt.gradle")
    }
        // apply from: "$rootDir/gradlescripts/jacoco.gradle"
    repositories {
        google()
        jcenter()

    }
}

tasks.register("clean").configure {
    delete("build")
}
