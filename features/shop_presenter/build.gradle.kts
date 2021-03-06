plugins {
    id("java-library")
    id("kotlin")
}

dependencies {
    implementation(project(Modules.Data.shop))
    implementation(Deps.kotlin)
    implementation(Deps.koin)
    testImplementation(Deps.junit)
}
sourceSets {
    getByName("main").java.setSrcDirs(listOf("src/main/kotlin"))
    getByName("test").java.setSrcDirs(listOf("src/test/kotlin"))
}
