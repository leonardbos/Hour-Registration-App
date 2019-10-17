package com.hra.hourregistrationapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {


    /*

    Currently the only thing this activity class does is making an intent towards the NavigationActivity

    */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Intent intent = new Intent(this, NavigationActivity.class);
        startActivity(intent);

        //setContentView(R.layout.activity_main);
    }
}
