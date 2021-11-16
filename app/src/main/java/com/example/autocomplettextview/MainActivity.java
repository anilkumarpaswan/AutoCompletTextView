package com.example.autocomplettextview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;

public class MainActivity extends AppCompatActivity {
    private static final String[] COUNTRIES = new String[]{"Araria","Bihar","Jharkhand","Kishangang","Patna","Madhepura","Khagriya","Khajuri","Tharua Patti","Bhargama","Ranigang","Supoale","Tonha","bhatgama"};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);




        String[] countries = getResources().getStringArray(R.array.countries);

        AutoCompleteTextView textView = findViewById(R.id.autoCompText);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_gallery_item,countries);
        textView.setAdapter(adapter);




        //textView.setThreshold(1);

        String string = textView.getText().toString();




    }
}