buildscript {

    repositories {
        google()
        mavenCentral()
        maven { url= uri("https://www.jitpack.io") }
    }
    dependencies {
        classpath("com.google.gms:google-services:4.4.0")
        classpath("com.android.tools.build:gradle:8.1.2")
        classpath("org.jetbrains.kotlin:kotlin-gradle-plugin:1.8.10")
        //classpath("com.github.lukelorusso:VerticalSeekBar:1.2.7")
    }
}
// Top-level build file where you can add configuration options common to all sub-projects/modules.
plugins {
    id("com.android.application") version "8.1.2" apply false
    id("org.jetbrains.kotlin.android") version "1.9.0" apply false
}