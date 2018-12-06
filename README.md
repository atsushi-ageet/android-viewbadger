[![](https://jitpack.io/v/atsushi-ageet/android-viewbadger.svg)](https://jitpack.io/#atsushi-ageet/android-viewbadger)

# android-viewbadger
Fork of [android-viewbadger][1]

# Gradle
Add the jitpack repo to your your project's build.gradle at the end of repositories

/build.gradle
```groovy
allprojects {
	repositories {
		jcenter()
		maven { url "https://jitpack.io" }
	}
}
```

Then add the dependency to your module's build.gradle:

/app/build.gradle
```groovy
implementation 'com.github.atsushi-ageet:android-viewbadger:1.0.1'
```

[1]: https://github.com/deano2390/android-viewbadger
