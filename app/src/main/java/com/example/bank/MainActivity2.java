package com.example.bank;

import android.os.Bundle;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        ListView listView = (ListView) this.findViewById(R.id.listViews);

        ArrayList<DataFlags2> list = new ArrayList<>();
        list.clear();

        list.add(new DataFlags2(R.string.dd1, R.string.dd2, R.string.dd3, R.string.dd4));
        list.add(new DataFlags2(R.string.dd1, R.string.dd2, R.string.dd3, R.string.dd4));
        list.add(new DataFlags2(R.string.dd1, R.string.dd2, R.string.dd3, R.string.dd4));
        list.add(new DataFlags2(R.string.dd1, R.string.dd2, R.string.dd3, R.string.dd4));
        list.add(new DataFlags2(R.string.dd1, R.string.dd2, R.string.dd3, R.string.dd4));
        list.add(new DataFlags2(R.string.dd1, R.string.dd2, R.string.dd3, R.string.dd4));
        list.add(new DataFlags2(R.string.dd1, R.string.dd2, R.string.dd3, R.string.dd4));
        list.add(new DataFlags2(R.string.dd1, R.string.dd2, R.string.dd3, R.string.dd4));
        list.add(new DataFlags2(R.string.dd1, R.string.dd2, R.string.dd3, R.string.dd4));
        list.add(new DataFlags2(R.string.dd1, R.string.dd2, R.string.dd3, R.string.dd4));
        list.add(new DataFlags2(R.string.dd1, R.string.dd2, R.string.dd3, R.string.dd4));
        list.add(new DataFlags2(R.string.dd1, R.string.dd2, R.string.dd3, R.string.dd4));
        list.add(new DataFlags2(R.string.dd1, R.string.dd2, R.string.dd3, R.string.dd4));
        list.add(new DataFlags2(R.string.dd1, R.string.dd2, R.string.dd3, R.string.dd4));
        list.add(new DataFlags2(R.string.dd1, R.string.dd2, R.string.dd3, R.string.dd4));
        list.add(new DataFlags2(R.string.dd1, R.string.dd2, R.string.dd3, R.string.dd4));
        list.add(new DataFlags2(R.string.dd1, R.string.dd2, R.string.dd3, R.string.dd4));
        list.add(new DataFlags2(R.string.dd1, R.string.dd2, R.string.dd3, R.string.dd4));
        list.add(new DataFlags2(R.string.dd1, R.string.dd2, R.string.dd3, R.string.dd4));
        list.add(new DataFlags2(R.string.dd1, R.string.dd2, R.string.dd3, R.string.dd4));
        list.add(new DataFlags2(R.string.dd1, R.string.dd2, R.string.dd3, R.string.dd4));


        MyListAdapter2 myListAdaptery = new MyListAdapter2(this, list);
        listView.setAdapter(myListAdaptery);
    }
}