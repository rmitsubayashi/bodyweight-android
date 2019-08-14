buildscript {
    repositories {
        google()
        jcenter()
        
    }

    dependencies {
        classpath("com.android.tools.build:gradle:3.4.2")
        classpath("org.jetbrains.kotlin:kotlin-gradle-plugin:1.3.41")
        // helps keep gradle dependencies updated
        classpath("com.github.ben-manes:gradle-versions-plugin:0.21.0")
    }
}

plugins {
    id("io.gitlab.arturbosch.detekt") version "1.0.0-RC16"
    id("com.github.ben-manes.versions") version "0.21.0"
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
