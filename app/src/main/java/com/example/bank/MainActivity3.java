package com.example.bank;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        ListView listView = (ListView) this.findViewById(R.id.listViews);

        ArrayList<DataFlags> list = new ArrayList<>();
        list.clear();

        list.add(new DataFlags(R.drawable.us, R.string.usa, R.string.usaUSD));
        list.add(new DataFlags(R.drawable.us, R.string.usa, R.string.usaUSD));
        list.add(new DataFlags(R.drawable.us, R.string.usa, R.string.usaUSD));
        list.add(new DataFlags(R.drawable.us, R.string.usa, R.string.usaUSD));
        list.add(new DataFlags(R.drawable.us, R.string.usa, R.string.usaUSD));
        list.add(new DataFlags(R.drawable.us, R.string.usa, R.string.usaUSD));
        list.add(new DataFlags(R.drawable.us, R.string.usa, R.string.usaUSD));
        list.add(new DataFlags(R.drawable.us, R.string.usa, R.string.usaUSD));
        list.add(new DataFlags(R.drawable.us, R.string.usa, R.string.usaUSD));
        list.add(new DataFlags(R.drawable.us, R.string.usa, R.string.usaUSD));
        list.add(new DataFlags(R.drawable.us, R.string.usa, R.string.usaUSD));
        list.add(new DataFlags(R.drawable.us, R.string.usa, R.string.usaUSD));
        list.add(new DataFlags(R.drawable.us, R.string.usa, R.string.usaUSD));
        list.add(new DataFlags(R.drawable.us, R.string.usa, R.string.usaUSD));
        list.add(new DataFlags(R.drawable.us, R.string.usa, R.string.usaUSD));
        list.add(new DataFlags(R.drawable.us, R.string.usa, R.string.usaUSD));
        list.add(new DataFlags(R.drawable.us, R.string.usa, R.string.usaUSD));
        list.add(new DataFlags(R.drawable.us, R.string.usa, R.string.usaUSD));
        list.add(new DataFlags(R.drawable.us, R.string.usa, R.string.usaUSD));
        list.add(new DataFlags(R.drawable.us, R.string.usa, R.string.usaUSD));
        list.add(new DataFlags(R.drawable.us, R.string.usa, R.string.usaUSD));
        list.add(new DataFlags(R.drawable.us, R.string.usa, R.string.usaUSD));
        list.add(new DataFlags(R.drawable.us, R.string.usa, R.string.usaUSD));
        list.add(new DataFlags(R.drawable.us, R.string.usa, R.string.usaUSD));
        list.add(new DataFlags(R.drawable.us, R.string.usa, R.string.usaUSD));
        list.add(new DataFlags(R.drawable.us, R.string.usa, R.string.usaUSD));
        list.add(new DataFlags(R.drawable.us, R.string.usa, R.string.usaUSD));
        list.add(new DataFlags(R.drawable.us, R.string.usa, R.string.usaUSD));

        MyListAdapter myListAdaptery = new MyListAdapter(this, list);
        listView.setAdapter(myListAdaptery);
    }
}