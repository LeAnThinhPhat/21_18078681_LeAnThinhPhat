package com.example.a21_18078681_leanthinhphat;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class Add_employee extends AppCompatActivity {
    Button btnCreate, btnBack1;
    TextView txtName1, txtAge1, txtDep1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_employee);
//        btnBack1.findViewById(R.id.btnBack3);
//        btnCreate.findViewById(R.id.btnSave);
//        txtName1.findViewById(R.id.txtAddName);
//        txtAge1.findViewById(R.id.txtAddAge);
//        txtDep1.findViewById(R.id.txtAddDep);
//        String urlGet="https://60b5399dfe923b0017c83d20.mockapi.io/api/employee";
//        btnCreate.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                SaveData(urlGet);
//                Intent intent = new Intent(Add_employee.this, Manager.class);
//                startActivity(intent);
//            }
//        });
//        btnBack.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Intent intent = new Intent(Add_employee.this, Manager.class);
//                startActivity(intent);
//            }
//        });
//    }
//    private void SaveData(String url){
//            StringRequest stringRequest = new StringRequest(Request.Method.POST,
//                    url + "",
//                    new Response.Listener<String>() {
//                        @Override
//                        public void onResponse(String response) {
//                            Toast.makeText(Add_employee.this, "Successfully", Toast.LENGTH_SHORT).show();
//                        }
//                    },
//                    new Response.ErrorListener() {
//                        @Override
//                        public void onErrorResponse(VolleyError error) {
//                            Toast.makeText(Add_employee.this, "Error by Post data!", Toast.LENGTH_SHORT).show();
//                        }
//                    }) {
//                @Override
//                protected Map<String, String> getParams() throws AuthFailureError {
//                    HashMap<String, String> params = new HashMap<>();
//                    params.put("name", txtName.getText().toString());
//                    params.put("age", txtAge.getText().toString());
//                    params.put("dep", txtDep.getText().toString());
//                    return params;
//                }
//            };
//
//            RequestQueue requestQueue = Volley.newRequestQueue(this);
//            requestQueue.add(stringRequest);
        }
    }
