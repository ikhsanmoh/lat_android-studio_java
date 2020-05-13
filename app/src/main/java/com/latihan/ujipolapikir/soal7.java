package com.latihan.ujipolapikir;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class soal7 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_soal7);
    }

    public void selected_next(View v) {
        Intent myInt = new Intent(this, soal8.class);
        startActivity(myInt);
    }
}
