object Configs {
    /*
    * motivation: because Android resource directories tend to grow large and unorganized,
    * wanted to be able to add subdirectories for better organization
    * */
    fun generateResourcePaths(vararg rawDirectories: String): List<String> = rawDirectories.map { "src/main/res/$it" }
    const val minSdkVersion = 21
    const val targetSdkVersion = 28
    //Robolectric doesn't support latest SDK version (29) ...
    const val compileSDKVersion = targetSdkVersion
    const val versionCode = 1
    const val versionName = "1.0.0"
    const val applicationID = "com.github.rmitsubayashi.bodyweight"
}