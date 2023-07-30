package com.example.implicitintentapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Calendar;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // got year
        Calendar calendar = Calendar.getInstance();
        int year = calendar.get(Calendar.YEAR);

        TextView tv = findViewById(R.id.textView);
        Button button1 = findViewById(R.id.btn);

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Implicit Intent
                Intent i = new Intent(Intent.ACTION_VIEW);
                i.setData(Uri.parse("https://nba.com"));
                startActivity(i);
                Toast.makeText(MainActivity.this, "Hello Public Domain " + year, Toast.LENGTH_LONG).show();
            }
        });

    }
}