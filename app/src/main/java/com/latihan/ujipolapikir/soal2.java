package com.latihan.ujipolapikir;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

import static android.provider.AlarmClock.EXTRA_MESSAGE;
import static java.lang.Integer.parseInt;

public class soal2 extends AppCompatActivity {

    AlertDialog.Builder builder;
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

        //Create instance for Intent Object
        Intent myInt = new Intent(this, soal3.class);
        //Send Data to specific Activity
        myInt.putExtra("skors", getData);
        //Opening New Activity
        startActivity(myInt);
        //End This Activity
        finish();
    }

    //Costumize Fungsi tombol back
    @Override
    public void onBackPressed() {
        //Alert Peringatan Kembali ke Home
        isFinish(
                "Kembali Ke Home",
                "Aksi ini akan menghapus histori jawaban anda pada sesi ini!!!"
                );
    }

    public void isFinish(String alertTitle, String alertMessage) {

        DialogInterface.OnClickListener dialogClickListener = new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                switch (which) {
                    case DialogInterface.BUTTON_POSITIVE:
                        //Keluar dari aktivitas ini
                        finish();
                        break;

                    case DialogInterface.BUTTON_NEGATIVE:
                        //Tidak ada perintah
                        break;
                }
            }
        };

        builder = new AlertDialog.Builder(this);
        builder.setCancelable(false);
        builder.setTitle(alertTitle);
        builder.setMessage(alertMessage);
        builder.setPositiveButton("OKE, Saya mengerti", dialogClickListener);
        builder.setNegativeButton("Batalkan", dialogClickListener);
        builder.create().show();
    }

}
