package com.example.linfa.list;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {
    private String[] data = {"aaaaaaa","bbbbbb","cccccc","dddddd",
            "aaaaaaa","bbbbbb","cccccc","dddddd",
            "aaaaaaa","bbbbbb","cccccc","dddddd",
            "aaaaaaa","bbbbbb","cccccc","dddddd",
            "aaaaaaa","bbbbbb","cccccc","dddddd",
            "aaaaaaa","bbbbbb","cccccc","dddddd",
            "aaaaaaa","bbbbbb","cccccc","dddddd"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(
                MainActivity.this,android.R.layout.simple_list_item_1,data);
        ListView listView = (ListView) findViewById(R.id.list_view);
        listView.setAdapter(adapter);
    }
}
