plugins {
    id("com.android.application")
    id("org.jetbrains.kotlin.android")
    id ("kotlin-kapt")
}

android {
    namespace = "com.zuper.learningdemokoltin"
    compileSdk = 34

    defaultConfig {
        applicationId = "com.zuper.learningdemokoltin"
        minSdk = 24
        targetSdk = 33
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }
    buildFeatures{
        dataBinding=true
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
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
    kotlinOptions {
        jvmTarget = "1.8"
    }
}

dependencies {

    implementation("androidx.core:core-ktx:1.9.0")
    implementation("androidx.appcompat:appcompat:1.6.1")
    implementation("com.google.android.material:material:1.11.0")
    implementation("androidx.constraintlayout:constraintlayout:2.1.4")
    testImplementation("junit:junit:4.13.2")
    androidTestImplementation("androidx.test.ext:junit:+")
    androidTestImplementation("androidx.test.espresso:espresso-core:3.5.1")

    val dagger2_version=2.47
    implementation ("com.google.dagger:dagger:2.47")
    implementation ("com.google.dagger:dagger-android:$dagger2_version")
    implementation ("com.google.dagger:dagger-android-support:$dagger2_version")
    kapt ("com.google.dagger:dagger-compiler:$dagger2_version")
    kapt ("com.google.dagger:dagger-android-processor:$dagger2_version")
    annotationProcessor ("com.google.dagger:dagger-compiler:$dagger2_version")
    compileOnly ("javax.annotation:jsr250-api:1.0")
    implementation ("javax.inject:javax.inject:1")

    val lifecycle_version = "2.5.0-alpha03"
    implementation("androidx.lifecycle:lifecycle-viewmodel-ktx:$lifecycle_version")
    implementation("androidx.lifecycle:lifecycle-livedata-ktx:$lifecycle_version")

    val retrofit_version = "2.9.0"
    implementation("com.squareup.retrofit2:retrofit:$retrofit_version")
    implementation("com.squareup.retrofit2:converter-gson:$retrofit_version")
    implementation("com.squareup.okhttp3:logging-interceptor:4.9.3")

    val room_version = "2.4.2"
    implementation("androidx.room:room-runtime:$room_version")
    implementation("androidx.room:room-ktx:$room_version")
    kapt("androidx.room:room-compiler:$room_version")
    implementation("androidx.room:room-rxjava2:$room_version")

    val coroutines_version = "1.6.0"
    implementation("org.jetbrains.kotlinx:kotlinx-coroutines-core:$coroutines_version")
    implementation("org.jetbrains.kotlinx:kotlinx-coroutines-android:$coroutines_version")

}