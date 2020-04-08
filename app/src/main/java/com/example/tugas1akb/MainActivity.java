/*
4-7 april 2020
membuat interface halaman utama, login, biodata dengan
memasukan gambar sebagai layout dan atribut button dan text yang di butuhkan

nim : 10117144
nama : Muhamad Pani Rayadi
kelas : IF-4

 */
package com.example.tugas1akb;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }
    public void button(View view) {
        Intent intent = new Intent( MainActivity.this,login.class);
        startActivity(intent);
    }
}
