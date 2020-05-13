package com.latihan.ujipolapikir;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class soal9 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_soal9);
    }

    public void selected_next(View v) {
        Intent myInt = new Intent(this, soal10.class);
        startActivity(myInt);
    }
}
