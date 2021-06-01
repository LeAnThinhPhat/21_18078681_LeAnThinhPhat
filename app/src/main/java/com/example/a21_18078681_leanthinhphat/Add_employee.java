package com.example.a21_18078681_leanthinhphat;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.android.volley.AuthFailureError;
import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;

import java.util.HashMap;
import java.util.Map;

public class Add_employee extends AppCompatActivity {
    Button btnCreate, btnBack;
    TextView txtName, txtAge, txtDep;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_employee);
        btnBack.findViewById(R.id.btnBack3);
        btnCreate.findViewById(R.id.btnSave);
        txtName.findViewById(R.id.txtAddName);
        txtAge.findViewById(R.id.txtAddAge);
        txtDep.findViewById(R.id.txtAddDep);
        String urlGet="https://60b5399dfe923b0017c83d20.mockapi.io/api/employee";
        btnCreate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SaveData(urlGet);
                Intent intent = new Intent(Add_employee.this, Manager.class);
                startActivity(intent);
            }
        });
        btnBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Add_employee.this, Manager.class);
                startActivity(intent);
            }
        });
    }
    private void SaveData(String url) {
        StringRequest stringRequest = new StringRequest( Request.Method.POST,
                url+"",
                new Response.Listener<String>() {
                    @Override
                    public void onResponse(String response) {
                        Toast.makeText(Add_employee.this, "Successfully", Toast.LENGTH_SHORT).show();
                    }
                },
                new Response.ErrorListener() {
                    @Override
                    public void onErrorResponse(VolleyError error) {
                        Toast.makeText(Add_employee.this, "Error by Post data!", Toast.LENGTH_SHORT).show();
                    }
                })
        {
            @Override
            protected Map<String, String> getParams() throws AuthFailureError {
                HashMap<String, String> params = new HashMap<>();
                params.put("name", txtName.getText().toString());
                params.put("age", txtAge.getText().toString());
                params.put("dep", txtDep.getText().toString());
                return params;
            }
        };

        RequestQueue requestQueue = Volley.newRequestQueue(this);
        requestQueue.add(stringRequest);
    }
}