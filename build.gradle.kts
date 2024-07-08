plugins {
    kotlin("jvm")
}

allprojects {
    group = "recursion-optimization-kt"
    version = extra["recursion-optimization-kt.version"] as String
}

subprojects {
    repositories {
        mavenCentral()
    }
}
