package com.latihan.ujipolapikir;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import static android.provider.AlarmClock.EXTRA_MESSAGE;

public class home extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
    }

    public void selected_next(View v) {

        //Initialize Var
        Integer skor;

        // Logic Operation for assigning var skor
        switch (v.getId()) {
            case R.id.A:
                skor = 20;
                break;
            case R.id.B:
                skor = 30;
                break;
            case R.id.C:
                skor = 40;
                break;
            case R.id.D:
                skor = 10;
                break;
            default:
                skor = 0;
        }

        //Converting Int to String and assign it
        String skors = String.valueOf(skor);

        //Create instance for Intent Object
        Intent myInt = new Intent(this, soal2.class);
        //Send Data to specific Activity
        myInt.putExtra(EXTRA_MESSAGE, skors);
        //Opening New Activity
        startActivity(myInt);
    }
}
