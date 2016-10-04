package com.example.rm30917.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * Says hello from an alert
     */

    public void sayHello(View v) {
        // 1st param => inside this view/context
        // R = automatically generated every single time; means reference; by categories as well
        Toast.makeText(this, R.string.app_hello_folks, Toast.LENGTH_LONG).show();
    }
}