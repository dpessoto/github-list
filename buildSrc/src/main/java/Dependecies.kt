package br.com.pessoto

object Libs {

    object Kotlin {
        private const val version = "1.5.21"
        const val stdlib = "org.jetbrains.kotlin:kotlin-stdlib-jdk8:$version"
    }

    object Firebase {
        const val remoteConfig = "com.google.firebase:firebase-config-ktx"
        const val bom = "com.google.firebase:firebase-bom:29.0.3"
    }

    object Coroutines {
        private const val version = "1.5.1"
        const val core = "org.jetbrains.kotlinx:kotlinx-coroutines-core:$version"
        const val android = "org.jetbrains.kotlinx:kotlinx-coroutines-android:$version"
        const val test = "org.jetbrains.kotlinx:kotlinx-coroutines-test:$version"
    }

    object AndroidX {
        const val coreKtx = "androidx.core:core-ktx:1.6.0"
        const val appCompat = "androidx.appcompat:appcompat:1.3.1"
        const val workManager = "androidx.work:work-runtime-ktx:2.7.0"

        object Lifecycle {
            const val lifecycle = "androidx.lifecycle:lifecycle-runtime-ktx:2.4.0"
        }

        object Room {
            private const val version = "2.3.0"

            const val runtime = "androidx.room:room-runtime:$version"
            const val compiler = "androidx.room:room-compiler:$version"
            const val ktx = "androidx.room:room-ktx:$version"
        }
    }

    object Material {
        const val material = "com.google.android.material:material:1.6.0-alpha01"
    }

    object Koin {
        private const val version = "3.1.2"

        const val android = "io.insert-koin:koin-android:$version"
        const val koinWorkManager = "io.insert-koin:koin-android:$version"
        const val androidCompat = "io.insert-koin:koin-android-compat:$version"
        const val test = "io.insert-koin:koin-test-junit4:$version"
    }

    object Network {
        private const val retrofitVersion = "2.8.1"
        private const val okHttpVersion = "4.9.1"

        const val retrofit = "com.squareup.retrofit2:retrofit:$retrofitVersion"
        const val okHttp = "com.squareup.okhttp3:okhttp:$okHttpVersion"
        const val kotlinSerializationConverter =
            "com.jakewharton.retrofit:retrofit2-kotlinx-serialization-converter:0.8.0"
    }

    object Serialization {
        const val kotlinSerialization = "org.jetbrains.kotlinx:kotlinx-serialization-json:1.2.1"
    }

    object Test {
        private const val version = "1.4.0"
        private const val junitVersion = "4.13"
        private const val mockkVersion = "1.11.0"

        const val junit = "junit:junit:$junitVersion"
        const val core = "androidx.arch.core:core-testing:2.1.0"
        const val runner = "androidx.test:runner:$version"
        const val rules = "androidx.test:rules:$version"
        const val androidJunit = "androidx.test.ext:junit:1.1.3"

        const val mockk = "io.mockk:mockk:$mockkVersion"

        object Ext {
            private const val version = "1.1.2"
            const val junit = "androidx.test.ext:junit-ktx:$version"
        }

        const val espressoCore = "androidx.test.espresso:espresso-core:3.2.0"
        const val turbine = "app.cash.turbine:turbine:0.7.0"
    }

}