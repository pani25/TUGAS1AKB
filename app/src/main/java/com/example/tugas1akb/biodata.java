package com.example.tugas1akb;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class biodata extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_biodata);
    }

    public void selanjutnya(View view) {
        Intent intent = new Intent( biodata.this,sayhai.class);
        startActivity(intent);
    }
}
