package com.example.bank;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class MyListAdapter2 extends BaseAdapter {
    private LayoutInflater LInflater;
    private ArrayList<DataFlags2> list;
    public MyListAdapter2(Context context, ArrayList<DataFlags2> data){

        list = data;
        LInflater = (LayoutInflater) context
                .getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }

    @Override
    public int getCount() {
        return list.size();
    }

    @Override
    public DataFlags2 getItem(int position) {
        return list.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        ViewHolder holder;
        View v = convertView;

        if ( v == null){
            holder = new ViewHolder();
            v = LInflater.inflate(R.layout.list_item_2, parent, false);
            holder.dd1 = (TextView) v.findViewById(R.id.dd1);
            holder.dd2 = (TextView) v.findViewById(R.id.dd2);
            holder.dd3 = (TextView) v.findViewById(R.id.dd3);
            holder.dd4 = (TextView) v.findViewById(R.id.dd4);
            v.setTag(holder);
        }

        holder = (ViewHolder) v.getTag();
        DataFlags2 dataFlags = getData(position);

        holder.dd1.setText(v.getResources().getString(dataFlags.getdd1ID()));
        holder.dd2.setText(v.getResources().getString(dataFlags.getdd2ID()));
        holder.dd3.setText(v.getResources().getString(dataFlags.getdd3ID()));
        holder.dd4.setText(v.getResources().getString(dataFlags.getdd4ID()));

        return v;
    }

    DataFlags2 getData(int position){
        return (getItem(position));
    }

    private static class ViewHolder {
        private TextView dd1;
        private TextView dd2;
        private TextView dd3;
        private TextView dd4;
    }


}
