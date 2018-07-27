package com.example.quanganh.assigmentduan;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class AddStudent extends AppCompatActivity {
    private EditText edtTen;
    private EditText edtSdt;
    private EditText etuoi;
    private EditText edtDiemtoan;
    private EditText edtDiemvan;
    private Button btnThem;
    private Button btnHuy;
    private FirebaseDatabase database;
    private DatabaseReference databaseReference;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_student);
        edtTen = (EditText) findViewById(R.id.edtTen);
        edtSdt = (EditText) findViewById(R.id.edtSdt);
        etuoi = (EditText) findViewById(R.id.etuoi);
        edtDiemtoan = (EditText) findViewById(R.id.edtDiemtoan);
        edtDiemvan = (EditText) findViewById(R.id.edtDiemvan);
        btnThem = (Button) findViewById(R.id.btnThem);
        btnHuy = (Button) findViewById(R.id.btnHuy);
        database = FirebaseDatabase.getInstance();
        databaseReference = database.getReference("Student");
        final Student student= new Student("Qa",12,"1231232",10.0,10.0,10.0);
        btnThem.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                addNewStudent(student);
            }
        });


    }
    private void addNewStudent(Student student) {
        String key=databaseReference.push().getKey();
        databaseReference.child(key).setValue(student);

    }

}
