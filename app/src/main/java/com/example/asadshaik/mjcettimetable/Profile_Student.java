package com.example.asadshaik.mjcettimetable;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class Profile_Student extends AppCompatActivity implements AdapterView.OnItemSelectedListener{

    Spinner branch,year,section;
    Button fetch;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile__student);

        branch = (Spinner) findViewById(R.id.branch);
        year = (Spinner)findViewById(R.id.year);
        section = (Spinner)findViewById(R.id.sec);
        fetch=(Button)findViewById(R.id.fetch);

        branch.setOnItemSelectedListener(this);
        year.setOnItemSelectedListener(this);
        section.setOnItemSelectedListener(this);

        //spinner 1
        List<String> categories_branch = new ArrayList<String>();
        categories_branch.add("IT");
        categories_branch.add("CIVIL");
        categories_branch.add("CSE");

        ArrayAdapter<String> dataAdapter_branch = new ArrayAdapter<String>(this,android.R.layout.simple_spinner_item,categories_branch);

        dataAdapter_branch.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        branch.setAdapter(dataAdapter_branch);


        //spinner 2

        List<String> categories_year = new ArrayList<String>();
        categories_year.add("1");
        categories_year.add("2");
        categories_year.add("3");
        categories_year.add("4");

        ArrayAdapter<String> dataAdapter_year = new ArrayAdapter<String>(this,android.R.layout.simple_spinner_item,categories_year);

        dataAdapter_year.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        year.setAdapter(dataAdapter_year);



        //spinner 3

        List<String> categories_section = new ArrayList<String>();
        categories_section.add("A");
        categories_section.add("B");


        ArrayAdapter<String> dataAdapter_section = new ArrayAdapter<String>(this,android.R.layout.simple_spinner_item,categories_section);

        dataAdapter_section.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        section.setAdapter(dataAdapter_section);



        fetch.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),Timetable_data.class);
                intent.putExtra("data1",String.valueOf(branch.getSelectedItem()));
                intent.putExtra("data2",String.valueOf(year.getSelectedItem()));
                intent.putExtra("data3",String.valueOf(section.getSelectedItem()));
                startActivity(intent);
            }
        });
    }

    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
        // On selecting a spinner item
        // String item = parent.getItemAtPosition(position).toString();

        // Showing selected spinner item
        //Toast.makeText(parent.getContext(), "Selected: " + item, Toast.LENGTH_LONG).show();

        switch(parent.getId()){
            case R.id.branch:
                Toast.makeText(getApplicationContext(),"OnItemSelectedListener :"+parent.getItemAtPosition(position).toString(),Toast.LENGTH_LONG).show();
                break;
            case R.id.year:
                Toast.makeText(getApplicationContext(),"OnItemSelectedListener :"+parent.getItemAtPosition(position).toString(),Toast.LENGTH_LONG).show();

                break;
            case R.id.sec:
                Toast.makeText(getApplicationContext(),"OnItemSelectedListener :"+parent.getItemAtPosition(position).toString(),Toast.LENGTH_LONG).show();

                break;

        }
    }

    public void onNothingSelected(AdapterView<?> arg0) {
        // TODO Auto-generated method stub

        Toast.makeText(getApplicationContext(),"No item Selectec",Toast.LENGTH_LONG).show();

    }
}
