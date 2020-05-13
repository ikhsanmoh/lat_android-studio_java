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

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_soal2);

        //Getting Intent Data
        String passDt = getIntent().getStringExtra(EXTRA_MESSAGE);

        //Converting String to Int and assign it
        Integer dt = Integer.parseInt(passDt) + 3;;

        //Converting Int to String and assign it
        String data = String.valueOf(dt);

        TextView myText = (TextView) findViewById(R.id.textView2);
        myText.setText(data);
    }

    public void selected_next(View v) {
        Intent myInt = new Intent(this, soal3.class);
        startActivity(myInt);
    }
}
