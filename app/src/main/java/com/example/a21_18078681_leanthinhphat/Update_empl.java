package com.example.a21_18078681_leanthinhphat;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class Update_empl extends AppCompatActivity {
    Button btnSave, btnBack;
    String editID;
    TextView txtName, txtAge, txtDep;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_update_empl);
//        btnBack.findViewById(R.id.btnBack2);
//        btnSave.findViewById(R.id.btnSave);
//        txtName.findViewById(R.id.txtNewName);
//        txtAge.findViewById(R.id.txtNewAge);
//        txtDep.findViewById(R.id.txtNewDep);
//
//        Intent intent1 =getIntent();
//        editID  = (String) intent1.getSerializableExtra("empl");
//        String urlGet="https://60b5399dfe923b0017c83d20.mockapi.io/api/employee";
//        btnSave.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                SaveData(urlGet);
//                Intent intent = new Intent(Update_empl.this, Show_info.class);
//                startActivity(intent);
//            }
//        });
//        btnBack.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Intent intent = new Intent(Update_empl.this, Show_info.class);
//                startActivity(intent);
//            }
//        });
//    }
//    private void SaveData(String url) {
//        StringRequest stringRequest = new StringRequest(
//                Request.Method.PUT, url + "/" + editID, new Response.Listener<String>() {
//                    @Override
//                    public void onResponse(String response) {
//                        Toast.makeText(Update_empl.this, "Successfully", Toast.LENGTH_SHORT).show();
//                    }
//                }, new Response.ErrorListener() {
//            @Override
//            public void onErrorResponse(VolleyError error) {
//                Toast.makeText(Update_empl.this, "Error by Put data!", Toast.LENGTH_SHORT).show();
//            }
//        }){
//            @Override
//            protected Map<String, String> getParams() throws AuthFailureError {
//                HashMap<String, String> params = new HashMap<>();
//                params.put("name", txtName.getText().toString());
//                params.put("age", txtAge.getText().toString());
//                params.put("dep", txtDep.getText().toString());
//                return params;
//            }
//        };
//        RequestQueue requestQueue = Volley.newRequestQueue(this);
//        requestQueue.add(stringRequest);
    }
}