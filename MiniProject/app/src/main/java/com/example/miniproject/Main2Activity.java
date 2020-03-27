package com.example.miniproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class Main2Activity extends AppCompatActivity {
    ImageButton androidImageButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        androidImageButton= (ImageButton) findViewById(R.id.imageButton3);

        androidImageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivity3();
                //Toast.makeText(MainActivity.this,"It Works", Toast.LENGTH_LONG).show();
            }
        });
    }

    private void openActivity3() {
        Intent intent =new Intent(this,Main3Activity.class);
        startActivity(intent);
    }
}