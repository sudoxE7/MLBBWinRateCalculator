# MLBBWinRateCalculator
MLBB Winrate Calculator Library for Android

## Screenshots
<p align="left">
<img src="/images/Screenshot_2023-10-31-07-01-34-88.jpg" width=25%/>
<img src="/images/Screenshot_2023-10-31-07-02-21-09_963a3a89f8f57c187f7ab51f689e160d.jpg" width=25%/>
</p>

## Including in your project
[![](https://jitpack.io/v/sudoxE7/MLBBWinRateCalculator.svg)](https://jitpack.io/#sudoxE7/MLBBWinRateCalculator)

### Gradle
Add below codes to your **root** `build.gradle` file (not your module build.gradle file).
```gradle
allprojects {
    repositories {
        ...
        maven { url 'https://jitpack.io' }
    }
}
```
And add a dependency code to your **module**'s `build.gradle` file.
```gradle
dependencies {
        implementation 'com.github.sudoxE7:MLBBWinRateCalculator:master-SNAPSHOT'
}
```

## Default Usage
Add in your Activity file.
```java
int totalMatches = 70;
double winRatePercentage = 70.0;
double targetWinRate = 90.0;

new MLBBWinRateCalculator(totalMatches, winRatePercentage, targetWinRate)
        .calculateWinRate(new MLBBWinRateCalculatorListener() {
            @Override
            public void onWinRateCalculated(String result) {
                ((TextView) findViewById(R.id.textview1)).setText(result);
            }
        });
```

#
// Credit to Exodus
