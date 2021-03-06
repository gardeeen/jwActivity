package com.example.jwactivity;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class jwAdapter extends ArrayAdapter<String> {
    Context context;
    int[] stuNo;
    String[] stuName;
    int[] btnO;
    int[] btnA;
    int[] btnX;

    public jwAdapter(Context context, int[] stuNo, String[] stuName, int[] butO, int[] butA, int[] butX){
       super(context,R.layout.jwlist,R.id.txt_name,stuName);
        this.context=context;
        this.stuNo=stuNo;
        this.stuName=stuName;
        this.btnO=btnO;
        this.btnA=btnA;
        this.btnX=btnX;

    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        View view = convertView;
        jwData holder = null;
        if(view ==null){
            LayoutInflater layoutInflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            view = layoutInflater.inflate(R.layout.jwlist,parent,false);
            holder = new jwData(view);
            view.setTag(holder);
        }
        else{
            holder= (jwData) view.getTag();
        }

        holder.stu_no.setText(stuNo[position]);
        holder.stu_name.setText(stuName[position]);
        holder.btn_o.setImageResource(btnO[position]);
        holder.btn_a.setImageResource(btnA[position]);
        holder.btn_x.setImageResource(btnX[position]);


        return view;


    }
}
