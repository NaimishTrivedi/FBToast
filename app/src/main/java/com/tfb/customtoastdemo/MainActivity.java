package com.tfb.customtoastdemo;

import android.graphics.Typeface;
import android.os.Bundle;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import com.tfb.fbtoast.FBCustomToast;
import com.tfb.fbtoast.FBToast;

public class MainActivity extends AppCompatActivity {

    Button btnNativeClick,btnSuccessClick,btnInfoClick,btnWarningClick,btnErrorClick,btnCustomClick;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnNativeClick = findViewById(R.id.btnNativeClick);
        btnNativeClick.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FBToast.nativeToast(MainActivity.this,"This is Native Toast",FBToast.LENGTH_SHORT);
            }
        });

        btnSuccessClick = findViewById(R.id.btnSuccessClick);
        btnSuccessClick.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FBToast.successToast(MainActivity.this,"This is Success Toast",FBToast.LENGTH_SHORT);
            }
        });

        btnInfoClick = findViewById(R.id.btnInfoClick);
        btnInfoClick.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FBToast.infoToast(MainActivity.this,"This is Info Toast",FBToast.LENGTH_SHORT);
            }
        });

        btnWarningClick = findViewById(R.id.btnWarningClick);
        btnWarningClick.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FBToast.warningToast(MainActivity.this,"This is Warning Toast",FBToast.LENGTH_SHORT);
            }
        });

        btnErrorClick = findViewById(R.id.btnErrorClick);
        btnErrorClick.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FBToast.errorToast(MainActivity.this,"This is Error Toast",FBToast.LENGTH_SHORT);
            }
        });

        btnCustomClick = findViewById(R.id.btnCustomClick);
        btnCustomClick.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FBCustomToast fbCustomToast = new FBCustomToast(MainActivity.this);
                fbCustomToast.setMsg("This is Custom Toast");
                fbCustomToast.setIcon(ContextCompat.getDrawable(MainActivity.this,R.drawable.ic_android_white_24dp));
                fbCustomToast.setBackgroundDrawable(ContextCompat.getDrawable(MainActivity.this,R.drawable.bg_gradient));
                fbCustomToast.setTypeface(Typeface.createFromAsset(getAssets(),"font/PoppinsBold.ttf"));
                fbCustomToast.show();
            }
        });
    }
}
