package com.latihan.ujipolapikir;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class soal8 extends AppCompatActivity {

    Integer getData;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_soal8);

        //Getting Intent Data
        getData = getIntent().getIntExtra("skors", 0);
    }

    public void selected_next(View v) {

        Integer skor_soal8;

        // Logic Operation for assigning var skor
        switch (v.getId()) {
            case R.id.A:
                skor_soal8 = 10;
                break;
            case R.id.B:
                skor_soal8 = 20;
                break;
            case R.id.C:
                skor_soal8 = 30;
                break;
            case R.id.D:
                skor_soal8 = 40;
                break;
            default:
                skor_soal8 = 0;
        }

        //Akumulasi Skor Soal Terjawab
        getData = getData + skor_soal8;

        Intent myInt = new Intent(this, soal9.class);
        myInt.putExtra("skors", getData);
        startActivity(myInt);
    }
}
