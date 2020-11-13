package com.example.listapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.res.Resources;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ResourceBundle;

public class MainActivity extends AppCompatActivity {

    // definizione lista e arrays
    ListView myListView;
    String[] items;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Resources res = getResources();
        // collegamento lista e arrays
        myListView = (ListView)findViewById(R.id.myListView);
        items = res.getStringArray(R.array.items);


    }
}