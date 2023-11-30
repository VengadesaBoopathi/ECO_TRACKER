package com.example.mentormentee;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void carboncalculator(View view){
    Intent intent =new Intent(this,loginPage.class);
    startActivity(intent);
    }
    public void plasticcalculator(View view){
        Intent intent =new Intent(this,loginPage.class);
        startActivity(intent);
    }

}