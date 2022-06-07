package com.example.codewithharry;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.util.Log;
import android.widget.Toast;
public class MainActivity extends AppCompatActivity {

public void clickbtn(View view){
    Log.i("info","hello");
    Toast.makeText(this,"Hello button is clicked",Toast.LENGTH_SHORT).show();
}


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}