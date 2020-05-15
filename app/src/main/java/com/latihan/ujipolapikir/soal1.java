package com.latihan.ujipolapikir;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class soal1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_soal1);
    }

    public void selected_next(View v) {

        //Initialize Var
        Integer skor_soal1;

        // Logic Operation for assigning var skor
        switch (v.getId()) {
            case R.id.A:
                skor_soal1 = 20;
                break;
            case R.id.B:
                skor_soal1 = 30;
                break;
            case R.id.C:
                skor_soal1 = 40;
                break;
            case R.id.D:
                skor_soal1 = 10;
                break;
            default:
                skor_soal1 = 0;
        }

        //Create instance for Intent Object
        Intent myInt = new Intent(this, soal2.class);
        //Send Data to specific Activity
        myInt.putExtra("skors", skor_soal1);
        //Opening New Activity
        startActivity(myInt);
        //End This Activity
        finish();
    }

}
