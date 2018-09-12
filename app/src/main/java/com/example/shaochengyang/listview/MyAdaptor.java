package com.example.shaochengyang.listview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

class MyAdapter extends BaseAdapter {


    int myImages[];
    String myCountry[];
    Context ctx;

    LayoutInflater layoutInflater;


    public MyAdapter(int[] myImages, String[] myCountry, Context ctx) {
        this.myImages = myImages;
        this.myCountry = myCountry;
        this.ctx = ctx;

        layoutInflater=(LayoutInflater)ctx.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }

    @Override
    public int getCount() {
        return myCountry.length;
    }

    @Override
    public Object getItem(int position) {
        return position;
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(final int position, View convertView, ViewGroup parent) {


        View v =  layoutInflater.inflate(R.layout.item_layout,null);
        TextView tv = v.findViewById(R.id.textViewMyCountries);
        ImageView iv = v.findViewById(R.id.imageView);

        View layout = v.findViewById(R.id.mylayout);

        tv.setText(myCountry[position]);
        iv.setImageResource(myImages[position]);

        layout.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Toast.makeText(ctx, "layout is: "+ myCountry[position], Toast.LENGTH_SHORT).show();
            }
        });

        tv.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Toast.makeText(ctx,"click on "+myCountry[position],Toast.LENGTH_LONG).show();
            }
        });


        return v;
    }
}
