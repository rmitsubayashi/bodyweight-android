plugins {
    id("java-library")
    id("kotlin")
}

dependencies {
    implementation(Deps.kotlin)
}
sourceSets {
    getByName("main").java.setSrcDirs(listOf("src/main/kotlin"))
}
