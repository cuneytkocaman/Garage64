package com.cuneyt.garage64;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.cuneyt.garage64.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {
    private ActivityMainBinding mainBinding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mainBinding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(mainBinding.getRoot());

        int a=2;
    }
}