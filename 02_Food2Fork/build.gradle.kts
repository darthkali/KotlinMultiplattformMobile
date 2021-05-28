buildscript {
    repositories {
        mavenCentral()
        gradlePluginPortal()
//        jcenter()
        google()
    }
    dependencies {
        classpath(Build.kotlinGradlePlugin)
        classpath(Build.buildTools)
        classpath(Build.hiltGradlePlugin)
    }
}

allprojects {
    repositories {
        mavenCentral()
        google()
//        jcenter()
    }
}

tasks.register("clean", Delete::class) {
    delete(rootProject.buildDir)
}