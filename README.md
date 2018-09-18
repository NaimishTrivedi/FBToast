# FBToast
**Custom toast messages.**
- You can create customizable toast messages with FBToast.
- Use FBToast.LENGTH_SHORT or FBToast.LENGTH_LONG for toast display duration.
- You can use Gravity.BOTTOM, Gravity.TOP, Gravity.LEFT or Gravity.RIGHT for toast position on screen.

## Native Toast
![alt text](https://github.com/NaimishTrivedi/FBToast/blob/master/nativetoast.png)

 FBToast.nativeToast(MainActivity.this,"This is Native Toast",FBToast.LENGTH_SHORT);
 
 ## Success Toast
![alt text](https://github.com/NaimishTrivedi/FBToast/blob/master/successtoast.png)

 FBToast.successToast(MainActivity.this,"This is Success Toast",FBToast.LENGTH_SHORT);
 
  ## Warning Toast
![alt text](https://github.com/NaimishTrivedi/FBToast/blob/master/warningtoast.png)

  FBToast.warningToast(MainActivity.this,"This is Warning Toast",FBToast.LENGTH_SHORT);
  
   ## Error Toast
![alt text](https://github.com/NaimishTrivedi/FBToast/blob/master/errortoast.png)

  FBToast.errorToast(MainActivity.this,"This is Error Toast",FBToast.LENGTH_SHORT);
  
   ## Info Toast
![alt text](https://github.com/NaimishTrivedi/FBToast/blob/master/infotoast.png)

  FBToast.infoToast(MainActivity.this,"This is Info Toast",FBToast.LENGTH_SHORT); 
  
  ## Custom Toast
![alt text](https://github.com/NaimishTrivedi/FBToast/blob/master/customtoast.png)

  FBCustomToast fbCustomToast = new FBCustomToast(MainActivity.this);<br/>
   fbCustomToast.setMsg("This is Custom Toast");<br/>
   fbCustomToast.setIcon(ContextCompat.getDrawable(MainActivity.this,R.drawable.ic_android_white_24dp));<br/>
   fbCustomToast.setBackgroundDrawable(ContextCompat.getDrawable(MainActivity.this,R.drawable.bg_gradient));<br/>
   fbCustomToast.setTypeface(Typeface.createFromAsset(getAssets(),"font/PoppinsBold.ttf"));<br/>
   fbCustomToast.show(); 
