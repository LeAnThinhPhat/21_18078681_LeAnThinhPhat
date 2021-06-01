package com.example.a21_18078681_leanthinhphat;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.JsonArrayRequest;
import com.android.volley.toolbox.Volley;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;

public class Show_info extends AppCompatActivity {
    Button btnSua,btnXoa,btnBack;
    CustomAdapter adt;
    ListView listView;
    TextView txtId,txtname,txtage,txtdep;
    ArrayList<Employee> arrEmpls;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show_info);

        btnBack = findViewById(R.id.btnBack);
        btnSua = findViewById(R.id.btnUpdate);
        btnXoa = findViewById(R.id.btnDelete);

        txtId = findViewById(R.id.txtId);
        txtname = findViewById(R.id.txtName);
        txtage = findViewById(R.id.txtAge);
        txtdep = findViewById(R.id.txtDep);
        listView = findViewById(R.id.listview);

        // Get data từ mockAPI
        String urlGet="https://60b5399dfe923b0017c83d20.mockapi.io/api/employee";
        GetData(urlGet);
        btnBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Show_info.this, Manager.class);
                startActivity(intent);
            }
        });
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Employee employees =arrEmpls.get(position);
                id = employees.getId();
                String name = employees.getName();
                int age = employees.getAge();
                String dep = employees.getDep();
                System.setProperty("ID", id+"");
                System.setProperty("Name",name);
                System.setProperty("Age",age+"");
                System.setProperty("Dep",dep);
            }
        });


    }

    // Add library Volley
    public void GetData(String url) {
        arrEmpls = new ArrayList<>();
        JsonArrayRequest request = new JsonArrayRequest(Request.Method.GET, url, null,
                new Response.Listener<JSONArray>() {
                    @Override
                    public void onResponse(JSONArray response) {
                        for (int i = 0; i < response.length(); i++) {
                            try {
                                JSONObject object = response.getJSONObject(i);
                                arrEmpls.add(new Employee(object.getInt("id"),
                                        object.getString("name"),
                                        object.getInt("age"),
                                        object.getString("dep")));
                            } catch (JSONException e) {
                                e.printStackTrace();
                            }
                        }
                        adt = new CustomAdapter(getApplicationContext(), arrEmpls, R.layout.item);
                        listView.setAdapter(adt);
                        adt.notifyDataSetChanged();
                    }
                }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {
                Toast.makeText(Show_info.this, "Lỗi", Toast.LENGTH_SHORT).show();
            }

        });
        RequestQueue requestQueue = Volley.newRequestQueue(this);
        requestQueue.add(request);
    }
}