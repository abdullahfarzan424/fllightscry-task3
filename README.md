<<<<<<< HEAD
# flightscry-task3
=======
# Flightscry — Skyscanner Forage Task 3

A small Android proof of concept showing a **sample flight itinerary**. It displays three Backpack cards: the flight number, the departure airport and time, and the arrival airport and time. The details are dummy data, so the app needs no account, API key, or network permission.

## Open and run

1. Install **Android Studio**, **Android SDK Platform 35**, and **JDK 17**. Create an Android 13 (API 33) or newer emulator, or connect an Android phone running Android 13 or newer.
2. Open the `Flightscry` folder (the folder containing `settings.gradle`) as a project in Android Studio. Let Gradle sync and download dependencies.
3. Choose the emulator/phone and click **Run**. The screen shows flight UL 503, departure CMB at 10:30 AM, and arrival LHR at 5:45 PM.

You can edit all the code in **VS Code** and use VS Code's terminal to push it to GitHub. Building and running a native Android app still requires the Android SDK and Gradle; Android Studio is the easiest way to set those up. If you already have both, open a terminal inside the project folder and run `gradle :app:assembleDebug`. The debug APK will be under `app/build/outputs/apk/debug/`.

GitHub Actions also attempts a build automatically when you push. Open the repository's **Actions** tab and check that **Android build** passes before submitting your link. A green build checks that the source compiles; run the app on an emulator/phone to check its appearance.

## Push from VS Code

In a terminal opened in the `Flightscry` folder:

```bash
git init
git add .
git commit -m "Build Flightscry itinerary app"
git branch -M main
git remote add origin https://github.com/YOUR_USERNAME/flightscry.git
git push -u origin main
```

First create an **empty public repository** called `flightscry` on GitHub, then replace `YOUR_USERNAME` in the command. Submit the repository's URL, for example `https://github.com/YOUR_USERNAME/flightscry`. If your folder is already a Git repository with an `origin`, skip `git init` and `git remote add origin`.

## Files and learning points

| File | What it teaches |
| --- | --- |
| `app/build.gradle` | Gradle downloads Skyscanner Backpack 43.0.0 from Maven Central. |
| `app/src/main/res/layout/activity_main.xml` | XML arranges Backpack `BpkCardView` and `BpkText` widgets in a scrolling vertical layout. |
| `app/src/main/res/values/strings.xml` | Sample flight details are kept separate from the layout. |
| `app/src/main/res/values/styles.xml` | The app uses `BpkTheme`, which Backpack components need. |
| `app/src/main/java/com/abdullah/flightscry/MainActivity.kt` | Kotlin launches the XML screen. |

The Forage PDF describes an older Android Studio workflow, but its requested Backpack version and XML widget design are used here. This repository was prepared as source code; **the app has not been built or run in an emulator in the preparation environment**. Please check the GitHub Actions build and run it once before submitting. The project has no Gradle wrapper binary; the Actions workflow supplies Gradle 8.9, while local builds require an installed Gradle or Android Studio's Gradle setup.
>>>>>>> b3340c9 (intial commit)
