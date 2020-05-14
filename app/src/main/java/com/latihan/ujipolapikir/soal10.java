package com.latihan.ujipolapikir;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class soal10 extends AppCompatActivity {

    AlertDialog.Builder builder;
    Integer getData;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_soal10);

        //Getting Intent Data
        getData = getIntent().getIntExtra("skors", 0);
    }

    public void selected_next(View v) {

        Integer skor_soal10;

        // Logic Operation for assigning var skor
        switch (v.getId()) {
            case R.id.A:
                skor_soal10 = 40;
                break;
            case R.id.B:
                skor_soal10 = 20;
                break;
            case R.id.C:
                skor_soal10 = 30;
                break;
            case R.id.D:
                skor_soal10 = 10;
                break;
            default:
                skor_soal10 = 0;
        }

        //Akumulasi Skor Soal Terjawab
        getData = getData + skor_soal10;

        builder = new AlertDialog.Builder(this);
        builder.setCancelable(false);
        builder.setTitle("Selesai");
        builder.setMessage("Semua pertanyaan telah terjawab");
        builder.setPositiveButton("LIHAT HASIL", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                Intent myInt = new Intent(soal10.this, hasil.class);
                myInt.putExtra("skors", getData);
                startActivity(myInt);
            }
        });
        builder.create().show();
    }

}
