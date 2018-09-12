package com.example.shaochengyang.listview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import android.view.View;
import android.widget.AdapterView;

import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    ListView listView;
    String[] myCountries = {"china","india","japan","USA","nepal","china","india","japan",
            "USA","nepal","china","india","japan","USA","nepal"};

    int[] myPictures = {R.drawable.china,R.drawable.india,R.drawable.usa,R.drawable.japan,R.drawable.nepal,
            R.drawable.china,R.drawable.india,R.drawable.usa,R.drawable.japan,R.drawable.nepal
            ,R.drawable.china,R.drawable.india,R.drawable.usa,R.drawable.japan,R.drawable.nepal};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView = findViewById(R.id.listViewMyCountries);



        //default adaptor
        //ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(MainActivity.this,android.R.layout.simple_list_item_1,myCountries);

        //costume adaptor
        //ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(MainActivity.this,R.layout.item_layout,R.id.textViewMyCountries,myCountries);

        //myadaptor
        MyAdapter arrayAdapter = new MyAdapter(myPictures,myCountries,MainActivity.this);

        listView.setAdapter(arrayAdapter);


        /*listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String item = (String) parent.getItemAtPosition(position);
                Toast.makeText(MainActivity.this,"name of country is " + item + " at positon "+ position + " with ID: "+id, Toast.LENGTH_LONG).show();
            }
        });*/


    }
}
