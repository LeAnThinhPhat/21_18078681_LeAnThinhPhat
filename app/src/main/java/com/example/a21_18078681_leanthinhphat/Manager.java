package com.example.a21_18078681_leanthinhphat;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;

public class Manager extends AppCompatActivity {
    Button btnDangXuat, btnShow, btnAdd;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_manager);
        AnhXa();
        btnShow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                show_info();
            }
        });
        btnAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                add_emp();
            }
        });
        btnDangXuat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                logout();
            }
        });
    }
    private  void show_info(){
        Intent intent_showinfo = new Intent(Manager.this, Show_info.class);
        startActivity(intent_showinfo);
    }
    private  void add_emp(){
        Intent intent_addemp = new Intent(Manager.this, Add_employee.class);
        startActivity(intent_addemp);
    }
    private  void logout(){
        Intent intent_logout = new Intent(Manager.this, Login.class);
        startActivity(intent_logout);
    }
    private void AnhXa(){
        btnDangXuat = findViewById(R.id.btnLogout);
        btnShow = findViewById(R.id.btnShowInfo);
        btnAdd = findViewById(R.id.btnAddImp);
    }
}