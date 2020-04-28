/**
 * @author Aldyaz on 23/03/19.
 */

object Versions {
    const val ANDROID_BUILD_TOOLS = "28.0.3"
    const val ANDROID_MIN_SDK = 19
    const val ANDROID_COMPILE_SDK = 28

    const val KOTLIN = "1.3.70"
    const val ANDROID_STUDIO = "3.6.0"
    const val ANDROID_X = "1.0.0"
    const val ANDROID_MATERIAL = "1.0.0"
    const val ANDROID_X_MULTIDEX = "2.0.0"
    const val ANDROID_ARCH = "1.1.1"
    const val CONSTRAINT_LAYOUT = "1.1.2"
    const val RETROFIT = "2.8.1"
    const val OKHTTP = "4.5.0"
    const val RX_JAVA = "2.2.16"
    const val RX_ANDROID = "2.1.0"
    const val DAGGER = "2.26"
    const val KTX = "1.2.0"

    // Test
    const val JUNIT = "4.12"
    const val ESPRESSO = "3.1.0"
    const val ANDROID_TEST_SUPPORT_LIB = "1.1.0"
    const val MOCKITO_KOTLIN = "2.0.0-RC1"
    const val DEXMAKER_MOCKITO = "2.19.1"
    const val ROBOLECTRIC = "4.0.1"
}

object Kotlin {
    const val classpath = "org.jetbrains.kotlin:kotlin-gradle-plugin:${Versions.KOTLIN}"
    const val stdlib = "org.jetbrains.kotlin:kotlin-stdlib:${Versions.KOTLIN}"
    const val allopen = "org.jetbrains.kotlin:kotlin-allopen:${Versions.KOTLIN}"
    const val stdlibJdk7 = "org.jetbrains.kotlin:kotlin-stdlib-jdk7:${Versions.KOTLIN}"
}

object AndroidStudio {
    const val classpath = "com.android.tools.build:gradle:${Versions.ANDROID_STUDIO}"
}

object AndroidX {
    const val multiDex = "androidx.multidex:multidex:${Versions.ANDROID_X_MULTIDEX}"
    const val core = "androidx.core:core:${Versions.ANDROID_X}"
    const val appCompat = "androidx.appcompat:appcompat:${Versions.ANDROID_X}"
    const val design = "com.google.android.material:material:${Versions.ANDROID_MATERIAL}"
    const val supportV4 = "androidx.legacy:legacy-support-v4:${Versions.ANDROID_X}"
    const val cardView = "androidx.cardview:cardview:${Versions.ANDROID_X}"
    const val recyclerView = "androidx.recyclerview:recyclerview:${Versions.ANDROID_X}"
    const val supportAnnotations = "androidx.annotation:annotation:${Versions.ANDROID_X}"
    const val customTabs = "androidx.browser:browser:${Versions.ANDROID_X}"
    const val constraintLayout = "androidx.constraintlayout:constraintlayout:${Versions.CONSTRAINT_LAYOUT}"
    const val ktx = "androidx.core:core-ktx:${Versions.KTX}"
}

object TestLib {
    const val junit = "junit:junit:${Versions.JUNIT}"
    const val androidRunner = "androidx.test:runner:${Versions.ANDROID_TEST_SUPPORT_LIB}"
    const val androidRules = "androidx.test:rules:${Versions.ANDROID_TEST_SUPPORT_LIB}"
    const val dexmakerMockito = "com.linkedin.dexmaker:dexmaker-mockito:${Versions.DEXMAKER_MOCKITO}"
    const val espressoCore = "androidx.test.espresso:espresso-core:${Versions.ESPRESSO}"
    const val espressoIntents = "com.android.support.test.espresso:espresso-intents:${Versions.ESPRESSO}"
    const val espressoContrib = "com.android.support.test.espresso:espresso-contrib:${Versions.ESPRESSO}"
    const val liveData = "android.arch.core:core-testing:${Versions.ANDROID_ARCH}"
    const val kotlinJunit = "org.jetbrains.kotlin:kotlin-test-junit:${Versions.KOTLIN}"
    const val mockitoKotlin = "com.nhaarman.mockitokotlin2:mockito-kotlin:${Versions.MOCKITO_KOTLIN}"
    const val robolectric = "org.robolectric:robolectric:${Versions.ROBOLECTRIC}"
}

object Net {
    const val retrofit = "com.squareup.retrofit2:retrofit:${Versions.RETROFIT}"
    const val gsonConverter = "com.squareup.retrofit2:converter-gson:${Versions.RETROFIT}"
    const val rxJavaAdapter = "com.squareup.retrofit2:adapter-rxjava2:${Versions.RETROFIT}"
    const val okHttpLogging = "com.squareup.okhttp3:logging-interceptor:${Versions.OKHTTP}"
}

object Rx {
    const val rxJava = "io.reactivex.rxjava2:rxjava:${Versions.RX_JAVA}"
    const val rxAndroid = "io.reactivex.rxjava2:rxandroid:${Versions.RX_ANDROID}"
}

object Dagger {
    const val core = "com.google.dagger:dagger:${Versions.DAGGER}"
    const val android = "com.google.dagger:dagger-android:${Versions.DAGGER}"
    const val androidSupport = "com.google.dagger:dagger-android:${Versions.DAGGER}"
    const val processor = "com.google.dagger:dagger-android-processor:${Versions.DAGGER}"
    const val compiler = "com.google.dagger:dagger-compiler:${Versions.DAGGER}"
}