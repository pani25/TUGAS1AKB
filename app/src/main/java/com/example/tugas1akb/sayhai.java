package com.example.tugas1akb;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class sayhai extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sayhai);
    }

    public void ok(View view) {
        Intent intent = new Intent( sayhai.this,MainActivity.class);
        startActivity(intent);
    }
}
