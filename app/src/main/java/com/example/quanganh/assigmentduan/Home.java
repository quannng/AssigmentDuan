package com.example.quanganh.assigmentduan;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.RecyclerView;
import android.widget.Button;

public class Home extends AppCompatActivity {
    private Button btnAdd;
    private RecyclerView rvStudent;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);


        btnAdd = (Button) findViewById(R.id.btnAdd);
        rvStudent = (RecyclerView) findViewById(R.id.rvStudent);

    }
}
