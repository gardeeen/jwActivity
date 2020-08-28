package com.example.jwactivity;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class jwAdapter extends BaseAdapter {
    Context mContext =null;
    LayoutInflater mLayoutInflater=null;
    ArrayList<jwData> data;

    public jwAdapter(Context context, ArrayList<jwData> data){
        mContext = context;
        data = data;
        mLayoutInflater = LayoutInflater.from(mContext);
    }
    @Override
    public int getCount() {
        return data.size();
    }

    @Override
    public Object getItem(int position) {
        return data.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View view = mLayoutInflater.inflate(R.layout.jwlist, null);

        TextView Number = (TextView)convertView.findViewById(R.id.txt_no);
        TextView Name = (TextView)convertView.findViewById(R.id.txt_name);
        ImageView imageViewO = (ImageView)convertView.findViewById(R.id.btn_O);
        ImageView imageViewA = (ImageView)convertView.findViewById(R.id.btn_A);
        ImageView imageViewX = (ImageView)convertView.findViewById(R.id.btn_X);



        Number.setText(data.get(position).getNumber());
        Name.setText(data.get(position).getName());
        imageViewO.setImageResource(data.get(position).getImgO());
        imageViewA.setImageResource(data.get(position).getImgA());
        imageViewX.setImageResource(data.get(position).getImgX());
        return view;


    }
}
