plugins {
    //trick: for the same plugin versions in all sub-modules
    alias(libs.plugins.androidLibrary).apply(false)
    alias(libs.plugins.kotlinMultiplatform).apply(false)
    id("co.touchlab.kmmbridge") version "1.2.1" apply false // Check for the latest version!
}
