package com.latihan.ujipolapikir;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class soal7 extends AppCompatActivity {

    Integer getData;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_soal7);

        //Getting Intent Data
        getData = getIntent().getIntExtra("skors", 0);
    }

    public void selected_next(View v) {

        Integer skor_soal7;

        // Logic Operation for assigning var skor
        switch (v.getId()) {
            case R.id.A:
                skor_soal7 = 30;
                break;
            case R.id.B:
                skor_soal7 = 40;
                break;
            case R.id.C:
                skor_soal7 = 10;
                break;
            case R.id.D:
                skor_soal7 = 20;
                break;
            default:
                skor_soal7 = 0;
        }

        //Akumulasi Skor Soal Terjawab
        getData = getData + skor_soal7;

        Intent myInt = new Intent(this, soal8.class);
        myInt.putExtra("skors", getData);
        startActivity(myInt);
    }
}
