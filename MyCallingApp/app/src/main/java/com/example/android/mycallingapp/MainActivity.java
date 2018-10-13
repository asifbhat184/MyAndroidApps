package com.example.android.mycallingapp;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void placeCall(View view){
        Toast.makeText(this,"Placing a Call...",Toast.LENGTH_LONG).show();
        //Edit text to collect phone number
        EditText editText_number=(EditText)findViewById(R.id.ed_number_input);
        //Button --Onclicking this a call should start
        Button button_dial=(Button)findViewById(R.id.bt_call);
        //to get phone number from text view
        String phoneNumber=String.format("tel:%s",editText_number.getText().toString());
        //create the intent
        Intent intent=new Intent(Intent.ACTION_CALL);
        intent.setData(Uri.parse(phoneNumber));
        startActivity(intent);
    }


}
