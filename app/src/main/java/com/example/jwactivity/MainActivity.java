package com.example.jwactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {


    ListView studenttable3;
    int[] stuNo ={1,2,3};
    String[] stuName = {"김슈니","이슈니","박슈니"};
    int[] butO ={R.drawable.o,R.drawable.o,R.drawable.o};
    int[] butA ={R.drawable.a,R.drawable.a,R.drawable.a};
    int[] butX ={R.drawable.x,R.drawable.x,R.drawable.x};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        studenttable3=findViewById(R.id.studenttable3);
        jwAdapter jwAdapter=new jwAdapter(this, stuNo,stuName,butO,butA,butX);
        studenttable3.setAdapter(jwAdapter);


    }
//    public void InitializeStudentData()
//    {
//        studentData = new ArrayList<jwData>();
//
//        studentData.add(new jwData(1, "김슈니",R.drawable.o,R.drawable.a,R.drawable.x));
//        studentData.add(new jwData(2, "이슈니",R.drawable.o,R.drawable.a,R.drawable.x));
//        studentData.add(new jwData(3, "박슈니",R.drawable.o,R.drawable.a,R.drawable.x));
//
//    }

}

