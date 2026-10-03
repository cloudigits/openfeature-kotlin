pluginManagement {
    repositories {
        google()
        mavenCentral()
        gradlePluginPortal()
        mavenLocal()
    }
}

dependencyResolutionManagement {
    repositories {
        google()
        mavenCentral()
        maven("https://raw.githubusercontent.com/cloudigits/kotlin-sdk/mvn-repo")
        mavenLocal()
    }
}

rootProject.name = "configcat-openfeature-provider"
