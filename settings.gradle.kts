rootProject.buildFileName = "build.gradle.kts"

include(":sample", ":library")

pluginManagement {
    repositories {
        google()
        jcenter()
        gradlePluginPortal()
    }
    resolutionStrategy {
        eachPlugin {
            if (requested.id.namespace == "com.android") {
                useModule("com.android.tools.build:gradle:3.2.1")
            }
            if (requested.id.namespace == "com.github.dcendents") {
                useModule("com.github.dcendents:android-maven-gradle-plugin:2.1")
            }
        }
    }
}
