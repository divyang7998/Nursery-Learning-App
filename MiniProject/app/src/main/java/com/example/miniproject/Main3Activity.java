package com.example.miniproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class Main3Activity extends AppCompatActivity {
    ImageButton androidImageButton;
    ImageButton androidImageButton2;
    ImageButton androidImageButton3;
    ImageButton androidImageButton4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        androidImageButton= (ImageButton) findViewById(R.id.imageButton4);
        androidImageButton2= (ImageButton) findViewById(R.id.imageButton5);
        androidImageButton3= (ImageButton) findViewById(R.id.imageButton6);
        androidImageButton4= (ImageButton) findViewById(R.id.imageButton7);

        androidImageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivity4();
                //Toast.makeText(MainActivity.this,"It Works", Toast.LENGTH_LONG).show();
            }
        });

        androidImageButton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivity5();
                //Toast.makeText(MainActivity.this,"It Works", Toast.LENGTH_LONG).show();
            }
        });

        androidImageButton3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivity6();
                //Toast.makeText(MainActivity.this,"It Works", Toast.LENGTH_LONG).show();
            }
        });

        androidImageButton4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivity7();
                //Toast.makeText(MainActivity.this,"It Works", Toast.LENGTH_LONG).show();
            }
        });
    }

    private void openActivity4() {
        Intent intent =new Intent(this,Main4Activity.class);
        startActivity(intent);
    }
    private void openActivity5() {
        Intent intent =new Intent(this,subtract.class);
        startActivity(intent);
    }
    private void openActivity6() {
        Intent intent =new Intent(this,compare.class);
        startActivity(intent);
    }
    private void openActivity7() {
        Intent intent =new Intent(this,gk.class);
        startActivity(intent);
    }
}