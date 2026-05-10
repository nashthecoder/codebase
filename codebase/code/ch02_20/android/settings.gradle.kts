pluginManagement {
    repositories {
        google {
            content {
                includeGroupByRegex("com\\.android.*")
                includeGroupByRegex("com\\.google.*")
                includeGroupByRegex("androidx.*")
            }
        }
        mavenCentral()
        gradlePluginPortal()
    }
}
dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        google()
        mavenCentral()
        maven {
            name = "GitHubPackages"
            url = uri("https://maven.pkg.github.com/hotwired/hotwire-native-android")

            credentials {
                username = System.getenv("GITHUB_USER")
                password = System.getenv("GITHUB_ACCESS_TOKEN")
            }
        }
    }
}

rootProject.name = "Hiking Journal"
include(":app")
