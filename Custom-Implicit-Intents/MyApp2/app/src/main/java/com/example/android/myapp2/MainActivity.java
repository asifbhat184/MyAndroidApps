package com.example.android.myapp2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    public static final String ACTION_ASIF = "com.example.android.myapp1.action.ASIF";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }

    public void buttonPressed(View view) {
        Toast.makeText(this, "button pressed", Toast.LENGTH_LONG).show();
        Intent intent = new Intent(ACTION_ASIF);
        if (intent.resolveActivity(getPackageManager()) != null) {
            startActivity(intent);
        }
    }
}
