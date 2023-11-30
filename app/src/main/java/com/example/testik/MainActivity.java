package com.example.testik;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.MediaController;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.VideoView;

import java.io.File;

public class MainActivity extends AppCompatActivity {
    ImageView mImageView;
    Button b;
    static final String Key = "NORM";
    static final int REQUESTCODE = 123;

    int x=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        b=findViewById(R.id.BUT);

        //String str = getIntent().getStringExtra(Key);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                x++;
                if (x<4) {
                    mImageView = findViewById(R.id.imageView);
                    if (x == 1)
                        mImageView.setImageResource(R.drawable.img1);
                    else if (x == 2)
                        mImageView.setImageResource(R.drawable.img2);
                    else mImageView.setImageResource(R.drawable.img3);
                }
                else {
                    Intent intent  = new Intent(MainActivity.this,SecondActivity.class);
                    startActivity(intent);
                    finish();
                }
            }
        });
    }

}