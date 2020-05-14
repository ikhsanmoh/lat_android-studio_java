package com.latihan.ujipolapikir;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

import static android.provider.AlarmClock.EXTRA_MESSAGE;
import static java.lang.Integer.parseInt;

public class soal2 extends AppCompatActivity {

    Integer getData;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_soal2);

        //Getting Intent Data
        getData = getIntent().getIntExtra("skors", 0);

        /* Debuuging Code
        //Converting Int to String and assign it
        String data = String.valueOf(getData);

        TextView myText = (TextView) findViewById(R.id.textView2);
        myText.setText(data);
        */
    }

    public void selected_next(View v) {

        Integer skor_soal2;

        // Logic Operation for assigning var skor
        switch (v.getId()) {
            case R.id.A:
                skor_soal2 = 10;
                break;
            case R.id.B:
                skor_soal2 = 40;
                break;
            case R.id.C:
                skor_soal2 = 10;
                break;
            case R.id.D:
                skor_soal2 = 20;
                break;
            default:
                skor_soal2 = 0;
        }

        //Akumulasi Skor Soal Terjawab
        getData = getData + skor_soal2;

        Intent myInt = new Intent(this, soal3.class);
        myInt.putExtra("skors", getData);
        startActivity(myInt);
    }
}
