package com.example.aakas.mva;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import static android.R.attr.button;


public class MainActivity extends AppCompatActivity {

    public static ImageView imgview;
    public static Button buttonsbm;
    private int currentimg;
    int[] images={R.drawable.e1eyechart,R.drawable.e2eyechart};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        buttonclick();
    }
    public void buttonclick(){
        imgview=(ImageView)findViewById(R.id.imageView);
        buttonsbm=(Button)findViewById(R.id.button);
        buttonsbm.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        currentimg++;
                        currentimg=currentimg%images.length;
                        imgview.setImageResource(images[currentimg]);
                    }
                }
        );

    }
}

