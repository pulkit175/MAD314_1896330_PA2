package com.example.mad314;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {
    TextView username11,id11;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        username11=findViewById(R.id.studentNameET);
        id11=findViewById(R.id.studentIdET);
        RecyclerView recyclerView;
        Intent intent=getIntent();
        String text1=intent.getStringExtra("username");
        username11.setText(text1);
        String text2=intent.getStringExtra("studentId");
        id11.setText(text2);
    }
}
