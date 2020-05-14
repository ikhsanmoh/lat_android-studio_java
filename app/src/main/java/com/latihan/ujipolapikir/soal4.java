package com.latihan.ujipolapikir;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class soal4 extends AppCompatActivity {

    Integer getData;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_soal4);

        //Getting Intent Data
        getData = getIntent().getIntExtra("skors", 0);
    }

    public void selected_next(View v) {

        Integer skor_soal4;

        // Logic Operation for assigning var skor
        switch (v.getId()) {
            case R.id.A:
                skor_soal4 = 10;
                break;
            case R.id.B:
                skor_soal4 = 40;
                break;
            case R.id.C:
                skor_soal4 = 30;
                break;
            case R.id.D:
                skor_soal4 = 20;
                break;
            default:
                skor_soal4 = 0;
        }

        //Akumulasi Skor Soal Terjawab
        getData = getData + skor_soal4;

        Intent myInt = new Intent(this, soal5.class);
        myInt.putExtra("skors", getData);
        startActivity(myInt);
    }
}
