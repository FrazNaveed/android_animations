package com.example.animations;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.drawable.TransitionDrawable;
import android.media.Image;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    ImageView imgView;
    Button btn;
    boolean tri = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imgView = (ImageView) findViewById(R.id.imageView);
        btn = (Button) findViewById(R.id.button);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(tri==false) {
                    imgView.setImageResource(R.drawable.trans);
                    ((TransitionDrawable) imgView.getDrawable()).startTransition(3000);
                    tri = true;
                }
                else
                {
                    imgView.setImageResource(R.drawable.squaretotri);
                    ((TransitionDrawable) imgView.getDrawable()).startTransition(3000);
                    tri = false;
                }
            }
        });

    }
}