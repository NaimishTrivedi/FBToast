# FBToast
**Custom toast messages.**
- You can create customizable toast messages with FBToast.
- Use FBToast.LENGTH_SHORT or FBToast.LENGTH_LONG for toast display duration.
- You can use Gravity.BOTTOM, Gravity.TOP, Gravity.LEFT or Gravity.RIGHT for toast position on screen.

## Native Toast
![alt text](https://github.com/NaimishTrivedi/FBToast/blob/master/nativetoast.png)
```java
 FBToast.nativeToast(MainActivity.this,"This is Native Toast",FBToast.LENGTH_SHORT);
 ```
 ## Success Toast
![alt text](https://github.com/NaimishTrivedi/FBToast/blob/master/successtoast.png)
```java
 FBToast.successToast(MainActivity.this,"This is Success Toast",FBToast.LENGTH_SHORT);
 ```
  ## Warning Toast
![alt text](https://github.com/NaimishTrivedi/FBToast/blob/master/warningtoast.png)
```java
  FBToast.warningToast(MainActivity.this,"This is Warning Toast",FBToast.LENGTH_SHORT);
  ```
   ## Error Toast
![alt text](https://github.com/NaimishTrivedi/FBToast/blob/master/errortoast.png)
```java
  FBToast.errorToast(MainActivity.this,"This is Error Toast",FBToast.LENGTH_SHORT);
  ```
   ## Info Toast
![alt text](https://github.com/NaimishTrivedi/FBToast/blob/master/infotoast.png)
```java
  FBToast.infoToast(MainActivity.this,"This is Info Toast",FBToast.LENGTH_SHORT); 
  ```
  ## Custom Toast
![alt text](https://github.com/NaimishTrivedi/FBToast/blob/master/customtoast.png)
```java
  FBCustomToast fbCustomToast = new FBCustomToast(MainActivity.this);
   fbCustomToast.setMsg("This is Custom Toast");
   fbCustomToast.setIcon(ContextCompat.getDrawable(MainActivity.this,R.drawable.ic_android_white_24dp));
   fbCustomToast.setBackgroundDrawable(ContextCompat.getDrawable(MainActivity.this,R.drawable.bg_gradient));
   fbCustomToast.setTypeface(Typeface.createFromAsset(getAssets(),"font/PoppinsBold.ttf"));
   fbCustomToast.show(); 
   ```
   ## Installation

Step 1. Add the JitPack repository to your build file. 
```gradle
allprojects {
    repositories {
      maven { url 'https://jitpack.io' }
    }
}
```

Step 2. Add the dependency
```gradle
dependencies {
  implementation 'com.github.NaimishTrivedi:FBToast:1.0'
}
```
