package com.example.miniproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    ImageButton androidImageButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        androidImageButton= (ImageButton) findViewById(R.id.imageButton);

        androidImageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivity2();
                //Toast.makeText(MainActivity.this,"It Works", Toast.LENGTH_LONG).show();
            }
        });
    }

    private void openActivity2() {
        Intent intent =new Intent(this,Main2Activity.class);
        startActivity(intent);
    }
}
