package com.example.spinner_onitemselected_listener;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.lang.reflect.Constructor;

public class CustomAdapter extends BaseAdapter {

    private String[] countryName;

    private String[] populationText;
    int[] flag;

    Context context;

    public CustomAdapter( Context context,int[] flag,String[] countryName, String[] populationText) {
        this.countryName = countryName;
        this.populationText = populationText;
        this.flag = flag;
        this.context = context;
    }

    @Override
    public int getCount() {
        return countryName.length;
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        if (convertView==null){

            LayoutInflater layoutInflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            convertView = layoutInflater.inflate(R.layout.sample_layout,null,false);
        }


        ImageView imageView = convertView.findViewById(R.id.imageView_Id);
        imageView.setImageResource(flag[position]);

        TextView county = convertView.findViewById(R.id.sample_textTitelView_Id);
        county.setText(countryName[position]);

        TextView population = convertView.findViewById(R.id.sample_PopulationView_Id);
        population.setText(populationText[position]);



        return convertView;
    }
}
