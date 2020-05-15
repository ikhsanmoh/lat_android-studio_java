package com.latihan.ujipolapikir;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    AlertDialog.Builder builder;
    WebView webView;

    public String filename = "home.html";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Init WebView
        webView = (WebView) findViewById(R.id.homeWebView);

        //display webview in layout
        webView.getSettings().setJavaScriptEnabled(true);
        webView.loadUrl("file:///android_asset/" + filename);
    }

    //Memilih Button
    public void onKlik(View v) {
        //Create instance for Intent Object
        Intent myInt = new Intent(this, soal1.class);
        //Opening New Activity
        startActivity(myInt);
    }

    //Costumize Fungsi tombol back
    @Override
    public void onBackPressed() {
        //Alert Peringatan Keluar dari App
        isFinish("Keluar dari Applikasi");
    }

    public void isFinish(String alertMessage) {

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
        builder.setMessage(alertMessage);
        builder.setPositiveButton("Ya", dialogClickListener);
        builder.setNegativeButton("Batalkan", dialogClickListener);
        builder.create().show();
    }

}
