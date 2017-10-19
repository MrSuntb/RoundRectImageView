[![](https://jitpack.io/v/AbduazizKayumov/RoundRectImageView.svg)](https://jitpack.io/#AbduazizKayumov/RoundRectImageView)

# RoundRectImageView
Rounded rectangle ImageView for Android with roundRatio.

![alt text](https://github.com/AbduazizKayumov/RoundRectImageView/blob/master/art/art.png)

## Setup
**Step 1.** Add the JitPack repository to your build file
Add it in your root build.gradle at the end of repositories:
```
	allprojects {
		repositories {
			...
			maven { url 'https://jitpack.io' }
		}
	}
```
**Step 2.** Add the dependency
```
	dependencies {
	        compile 'com.github.AbduazizKayumov:RoundRectImageView:v1.0'
	}
```
## Usage
```xml
<com.abduaziz.views.RoundRectImageView
        android:layout_width="100dp"
        android:layout_height="100dp"
        android:layout_centerInParent="true"
        android:scaleType="fitXY"
        android:src="@drawable/wall"
        android:layout_margin="8dp"
        app:roundRatio="0.16" />

    <com.abduaziz.views.RoundRectImageView
        android:layout_width="100dp"
        android:layout_height="100dp"
        android:layout_centerInParent="true"
        android:scaleType="fitXY"
        android:src="@drawable/wall"
        android:layout_margin="8dp"
        app:roundRatio="0.32" />

    <com.abduaziz.views.RoundRectImageView
        android:layout_width="100dp"
        android:layout_height="100dp"
        android:layout_centerInParent="true"
        android:scaleType="fitXY"
        android:src="@drawable/wall"
        android:layout_margin="8dp"
        app:roundRatio="0.50" />
```

[License](/LICENSE)
