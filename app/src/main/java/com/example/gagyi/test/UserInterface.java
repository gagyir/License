package com.example.gagyi.test;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageSwitcher;
import android.widget.ImageView;
import android.widget.ViewSwitcher;

public class UserInterface extends AppCompatActivity {

    private ImageSwitcher imgsw;
    private ImageButton prev;
    private ImageButton next;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_interface);
        imgsw = (ImageSwitcher) findViewById(R.id.imgsw);

        imgsw.setFactory(new ViewSwitcher.ViewFactory() {
            @Override
            public View makeView() {
                ImageView imageView = new ImageView(getApplicationContext());
                imageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
                return imageView;
            }
        });


        imgsw.setImageResource(R.drawable.common_google_signin_btn_text_light_pressed);

        prev = (ImageButton) findViewById(R.id.imageButton);
        next = (ImageButton) findViewById(R.id.imageButton4);

        prev.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                imgsw.setImageResource(R.drawable.common_google_signin_btn_icon_dark_normal);
            }
        });

        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                imgsw.setImageResource(R.drawable.common_google_signin_btn_text_light_pressed);
            }
        });
    }
}
