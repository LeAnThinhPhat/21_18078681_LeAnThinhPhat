package com.example.a21_18078681_leanthinhphat;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.TextView;

import java.util.ArrayList;

public class CustomAdapter extends BaseAdapter {
    private Context context;
    private ArrayList<Employee> empls;
    private int layout;

    public CustomAdapter(Context context, ArrayList<Employee> empls, int layout) {
        this.context = context;
        this.empls = empls;
        this.layout = layout;
    }

    @Override
    public int getCount() {
        return empls.size();
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        View view = LayoutInflater.from(context).inflate(layout,parent,false);
        TextView txtId = view.findViewById(R.id.txtId);
        TextView name = view.findViewById(R.id.txtName);
        TextView age = view.findViewById(R.id.txtAge);
        TextView dep = view.findViewById(R.id.txtDep);
        Button btnUpdate = view.findViewById(R.id.btnUpdate);
        Button btnDelete = view.findViewById(R.id.btnDelete);

        txtId.setText(empls.get(position).getId()+"");
        name.setText(empls.get(position).getName());
        age.setText(empls.get(position).getAge()+"");
        dep.setText(empls.get(position).getDep());

        btnDelete.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=  new Intent(context,Delete_warming.class);
                intent.putExtra("id",empls.get(position).getId());
//                    intent.putExtra("mess",muser);
                context.startActivity(intent);

            }
        });
        btnUpdate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=  new Intent(context,Update_empl.class);
                intent.putExtra("empl",empls.get(position).getId());
                context.startActivity(intent);
            }
        });
        return view;
    }
}
