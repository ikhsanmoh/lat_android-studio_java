package com.latihan.ujipolapikir;

import android.content.DialogInterface;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;


public class MainActivity extends AppCompatActivity {

    AlertDialog.Builder builder;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    //Memilih Button
    public void onKlik(View v) {

        String hasilnya, opsi;

        switch (v.getId()) {
            case R.id.buttonA:
                hasilnya = "Kamu tipe orang yang menunggu sampai orang lain yang berselisih dengan mu menjadi tenang, lalu memulai diskusi yang tenang ";
                opsi = "A";
                tampilDialog(hasilnya, opsi);
                break;
            case R.id.buttonB:
                hasilnya = "Kamu tidak perduli akan hasil dari perselisihan. Artinya kamu orang yang asik diajak berdiskusi terbuka";
                opsi = "B";
                tampilDialog(hasilnya, opsi);
                break;
            case R.id.buttonC:
                hasilnya = "Kamu tipe orang yang tidak menyukai konflik dan konfrontasi";
                opsi = "C";
                tampilDialog(hasilnya, opsi);
                break;
            case R.id.buttonD:
                hasilnya = "Kamu tipe orang yang tidak mau disalahkan dan selalu bersikap defensive ketika ada orang yang mencoba mengkritikmu";
                opsi = "D";
                tampilDialog(hasilnya, opsi);
                break;
            default:
                hasilnya = "Pilih Salah satu";
        }
    }

    //menampilkan dialog
    public void tampilDialog(String hasilnya, String opsi) {

        builder = new AlertDialog.Builder(this);
        builder.setCancelable(false);
        builder.setTitle("Jawaban " + opsi);
        builder.setMessage(hasilnya);
        builder.setPositiveButton("OKE", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                Toast.makeText(MainActivity.this, "Coba Lagi", Toast.LENGTH_SHORT).show();
            }
        });
        builder.create().show();
    }

}
