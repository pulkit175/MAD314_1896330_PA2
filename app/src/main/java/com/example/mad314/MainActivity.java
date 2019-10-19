package com.example.mad314;

import android.content.Intent;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    EditText loginET,nameET,passwordET;
    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        loginET=findViewById(R.id.loginET);
        nameET=findViewById(R.id.nameET);
        passwordET=findViewById(R.id.passwirdET);
         button.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View view) {
                 String name = nameET.getText().toString();
                 String  password= passwordET.getText().toString();
                 String id = loginET.getText().toString();

                 Student student=new Student();

                 if(name.equals(student.usernameString)&&password.equals(student.password))
                 {
                     Intent intent=new Intent(MainActivity.this,Main2Activity.class);
                     intent.putExtra("username",name);
                     intent.putExtra("studentID",id);
                     startActivity(intent);

                 }

             }
         });

    }



}
