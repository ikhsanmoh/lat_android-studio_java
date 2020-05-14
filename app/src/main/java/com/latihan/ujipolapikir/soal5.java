package com.latihan.ujipolapikir;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class soal5 extends AppCompatActivity {

    Integer getData;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_soal5);

        //Getting Intent Data
        getData = getIntent().getIntExtra("skors", 0);
    }

    public void selected_next(View v) {

        Integer skor_soal5;

        // Logic Operation for assigning var skor
        switch (v.getId()) {
            case R.id.A:
                skor_soal5 = 40;
                break;
            case R.id.B:
                skor_soal5 = 30;
                break;
            case R.id.C:
                skor_soal5 = 20;
                break;
            case R.id.D:
                skor_soal5 = 10;
                break;
            default:
                skor_soal5 = 0;
        }

        //Akumulasi Skor Soal Terjawab
        getData = getData + skor_soal5;

        Intent myInt = new Intent(this, soal6.class);
        myInt.putExtra("skors", getData);
        startActivity(myInt);
    }
}
