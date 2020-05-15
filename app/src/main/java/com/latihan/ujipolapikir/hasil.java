package com.latihan.ujipolapikir;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class hasil extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hasil);

        //Getting Intent Data
        Integer getData = getIntent().getIntExtra("skors", 0);
        TextView judulText = (TextView) this.findViewById(R.id.judulHasil);
        TextView ketText = (TextView) this.findViewById(R.id.ketHasil);

        if (getData >= 350 && getData <= 400) {
            judulText.setText(R.string.conclusion1_header);
            ketText.setText(R.string.conclusion1_body);
        } else if (getData >= 300 && getData <= 349) {
            judulText.setText(R.string.conclusion2_header);
            ketText.setText(R.string.conclusion2_body);
        } else if (getData >= 250 && getData <= 290) {
            judulText.setText(R.string.conclusion3_header);
            ketText.setText(R.string.conclusion3_body);
        } else if (getData >= 200 && getData <= 240) {
            judulText.setText(R.string.conclusion4_header);
            ketText.setText(R.string.conclusion4_body);
        } else if (getData >= 150 && getData <= 190) {
            judulText.setText(R.string.conclusion5_header);
            ketText.setText(R.string.conclusion5_body);
        } else if (getData >= 100 && getData <= 140) {
            judulText.setText(R.string.conclusion6_header);
            ketText.setText(R.string.conclusion6_body);
        } else {
            judulText.setText("Error");
        }
    }

    public void onklik(View v) {

        Intent myInt;

        switch (v.getId()) {
            case R.id.Home:
                //End This Activity
                finish();
                break;
            case R.id.Restart:
                myInt = new Intent(this, soal1.class);
                startActivity(myInt);
                //End This Activity
                finish();
                break;
        }
    }

}
