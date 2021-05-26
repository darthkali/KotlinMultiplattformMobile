object Build {
    private const val gradleBuildTools = "7.0.0-alpha09"
//    private const val gradleBuildTools = "7.0.0-beta02"
    const val buildTools = "com.android.tools.build:gradle:${gradleBuildTools}"
    const val kotlinGradlePlugin = "org.jetbrains.kotlin:kotlin-gradle-plugin:${Kotlin.version}"
}