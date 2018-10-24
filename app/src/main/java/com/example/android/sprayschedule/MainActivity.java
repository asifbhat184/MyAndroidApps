package com.example.android.sprayschedule;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView mSprayList;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mSprayList=(TextView)findViewById(R.id.tv_list_of_sprays);

        String[] sprayName=SprayList.getSprayList();
        for(String spray:sprayName){
            mSprayList.append(spray+"\n\n\n");
        }
    }
}
