package com.example.hannahkim.lab4_1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        MyDrawEx a = new MyDrawEx(this);
        setContentView(a);
    }
}
