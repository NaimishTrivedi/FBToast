package com.tfb.fbtoast;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.support.v4.content.ContextCompat;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

public class FBCustomToast {
    private String msg = "";
    private Drawable icon;
    private Drawable backgroundDrawable;
    private int backgroundColor;
    private int toastMsgColor;
    private Typeface typeface;
    private Context context;
    private View layout;
    private ImageView toastImg;
    private TextView toastMsg;
    private RelativeLayout relContainer;
    private int length;
    private int gravity;

    public FBCustomToast(Context context){
        this.context = context;
        layout = LayoutInflater.from(context).inflate(R.layout.layout_toast,null,false);
        relContainer = layout.findViewById(R.id.relContainer);
        toastImg = layout.findViewById(R.id.toastImg);
        toastMsg = layout.findViewById(R.id.toastMsg);
        //Default Set Value;
        relContainer.setBackgroundResource(R.drawable.bg_native_toast);
    }

    public void setMsg(String msg){
        this.msg = msg;
    }

    public void setIcon(Drawable icon){
        this.icon = icon;
    }

    public void setBackgroundDrawable(Drawable backgroundDrawable){
        this.backgroundDrawable = backgroundDrawable;
    }

    public void setBackgroundColor(int backgroundColor) {
        this.backgroundColor = backgroundColor;
    }

    public void setTypeface(Typeface typeface) {
        this.typeface = typeface;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public void setGravity(int gravity) {
        this.gravity = gravity;
    }

    public void setToastMsgColor(int toastMsgColor) {
        this.toastMsgColor = toastMsgColor;
    }

    public void show(){
        try {
            if(gravity == 0){
                gravity = Gravity.BOTTOM;
            }
            toastMsg.setText(msg);
            if(icon == null){
                toastImg.setVisibility(View.GONE);
            }else{
                toastImg.setVisibility(View.VISIBLE);
                toastImg.setImageDrawable(icon);
            }
            if(backgroundDrawable!=null){
                relContainer.setBackground(backgroundDrawable);
            }
            if(backgroundColor!=0){
                Drawable customBackground = ContextCompat.getDrawable(context,R.drawable.bg_native_toast);
                assert customBackground != null;
                customBackground.setColorFilter(backgroundColor, PorterDuff.Mode.ADD);
                relContainer.setBackground(customBackground);
            }

            if(typeface!=null){
                toastMsg.setTypeface(typeface);
            }

            if(toastMsgColor != 0){
                toastMsg.setTextColor(toastMsgColor);
            }

            Toast toast = new Toast(context);
            toast.setDuration(length);
            toast.setGravity(gravity,0,0);
            toast.setView(layout);
            toast.show();
        }catch (Exception e){
            e.printStackTrace();
        }

    }
}
