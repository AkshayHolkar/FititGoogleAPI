package com.example.wrenf.fititgoogleapi;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /** Called when the user taps the Send button */
    public void startRun(View view) {
        // Do something in response to button

        Intent intent = new Intent(this, MapsActivity.class);


        startActivity(intent);





    }
}
