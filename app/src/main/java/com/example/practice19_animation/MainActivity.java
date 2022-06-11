package com.example.practice19_animation;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    ImageView image;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        image = findViewById(R.id.testImage);
        Button btn = findViewById(R.id.toRotate_btn);

        btn.setOnClickListener(v -> {
            Animation rotate = AnimationUtils.loadAnimation(this, R.anim.android_animation);
            image.startAnimation(rotate);
        });
    }
}