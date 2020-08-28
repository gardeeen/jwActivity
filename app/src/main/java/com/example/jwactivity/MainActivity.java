package com.example.jwactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ArrayList<jwData> studentData;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        this.InitializeStudentData();

        ListView listView = (ListView) findViewById(R.id.studenttable3);
        final jwAdapter myAdapter = new jwAdapter(this, studentData);

        listView.setAdapter(myAdapter);
    }
    public void InitializeStudentData()
    {
        studentData = new ArrayList<jwData>();

        studentData.add(new jwData(1, "김슈니",R.drawable.o,R.drawable.a,R.drawable.x));
        studentData.add(new jwData(2, "이슈니",R.drawable.o,R.drawable.a,R.drawable.x));
        studentData.add(new jwData(3, "박슈니",R.drawable.o,R.drawable.a,R.drawable.x));

    }

}

