package com.example.jwactivity;

import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.jwactivity.R;

import org.w3c.dom.Text;

public class jwData {

    TextView stu_no;
    TextView stu_name;
    ImageView btn_o;
    ImageView btn_a;
    ImageView btn_x;
    jwData(View v)
    {
        stu_no = v.findViewById(R.id.txt_no);
        stu_name = v.findViewById(R.id.txt_name);
        btn_o=v.findViewById(R.id.btn_O);
        btn_a=v.findViewById(R.id.btn_A);
        btn_x=v.findViewById(R.id.btn_X);


    }
}