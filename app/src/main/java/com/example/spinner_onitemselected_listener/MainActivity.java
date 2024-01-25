package com.example.spinner_onitemselected_listener;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Spinner spinner;
    private String[] countryNames;
    private String[] population;

    ArrayAdapter<String> arrayAdapter;

    private boolean isFirstSelected = true;

    int[] flags = {R.drawable.afghanistan_icon,R.drawable.azerbaijan_icon,
            R.drawable.bangladesh_icon,R.drawable.indonesia_icon,R.drawable.iran_icon,R.drawable.iraq_icon,
            R.drawable.pakistan_icon,R.drawable.turkey_icon

    };


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        spinner = findViewById(R.id.spinner_Id);

        countryNames = getResources().getStringArray(R.array.county_names);
        population = getResources().getStringArray(R.array.population_num);

        CustomAdapter customAdapter = new CustomAdapter(MainActivity.this,flags,countryNames,population);
        spinner.setAdapter(customAdapter);




        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

                if (isFirstSelected==true){

                    isFirstSelected=false;

                }
                else {

                    Toast.makeText(getApplicationContext(),countryNames[position]+"is selected ",Toast.LENGTH_SHORT).show();
                }



            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });






    }
}