plugins {
    id("com.android.library")
    id("org.jetbrains.kotlin.android")
    `maven-publish`
}

publishing {
    publications {
        create<MavenPublication>("release") {

            afterEvaluate {
                from(components["release"])
            }

            groupId = "com.github.root-service"
            artifactId = "fragnavlibrary"
            version = "1.1.0"

            pom {
                name.set("FragNavLibrary")
                description.set("A library for managing fragment navigation.")
                url.set("https://github.com/root-service/fragnav")
            }

            // artifact("$buildDir/outputs/aar/fragnavlibrary-release.aar")
        }
    }
    repositories {
        mavenLocal()
    }
}

tasks.named("publishReleasePublicationToMavenLocal") {
    dependsOn(tasks.named("bundleReleaseAar"))
}

android {
    namespace = "ch.rootserviceag.fragnavlibrary"
    compileSdk = 34

    defaultConfig {
        minSdk = 26

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
        consumerProguardFiles("consumer-rules.pro")
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_17
        targetCompatibility = JavaVersion.VERSION_17
    }
    kotlinOptions {
        jvmTarget = "17"
    }
}

java {
    toolchain {
        languageVersion = JavaLanguageVersion.of(17)
    }
}
java {
    sourceCompatibility = JavaVersion.VERSION_17
    targetCompatibility = JavaVersion.VERSION_17
}

dependencies {

    implementation("androidx.core:core-ktx:1.13.1")
    implementation("androidx.appcompat:appcompat:1.7.0")
    implementation("com.google.android.material:material:1.12.0")
    testImplementation("junit:junit:4.13.2")
    androidTestImplementation("androidx.test.ext:junit:1.2.1")
    androidTestImplementation("androidx.test.espresso:espresso-core:3.6.1")
}