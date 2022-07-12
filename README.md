# WeatherUITest

- Provides a basic implementation for Appium based Android/iOS UI tests
– Tests run against WeatherUI project found [here](https://github.com/jackvdp/WeatherTestApp)
– For help, follow the tutorial [here](https://applitools.com/blog/how-to-write-appium-ios-test/)

## Pre setup

- Follow setup steps for:
  - [Common](https://automationhacks.io/slides/2021/appium-conf/hello-appium-writing-your-first-tests/04-common-libraries/)
  - [Android](https://automationhacks.io/slides/2021/appium-conf/hello-appium-writing-your-first-tests/05-setup-for-android/)
  - [iOS](https://automationhacks.io/slides/2021/appium-conf/hello-appium-writing-your-first-tests/09-setup-for-ios/)

## Setup

– Chnage path of app bundle in the ios-caps.json & android-caps.json
– Install [Apium Server](https://github.com/appium/appium-desktop/releases/tag/v1.22.3-4) & [Appium Inspector](https://github.com/appium/appium-inspector/releases) (optional)

## Run Tests Android/iOS

```zsh
gradle wrapper clean build runTests -Dtag="ANDROID" -Ddevice="ANDROID"
```

```zsh
gradle wrapper clean build runTests -Dtag="IOS" -Dtarget="IOS"
```

