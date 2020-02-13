package edu.temple.assignment3appdev;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Spinner;
import android.view.View;
import android.widget.AdapterView;
import android.widget.TextView;
import android.widget.Toast;


public class ColorActivity extends AppCompatActivity {

    String[] colors = {"red", "blue", "green", "gray", "cyan", "magenta", "yellow", "lightgray", "darkgray", "aqua", "fuchsia"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Spinner mySpinner = (Spinner) findViewById(R.id.spinner1);
        mySpinner.setAdapter(new ColorAdapter(ColorActivity.this, colors));

        mySpinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener(){

            @Override
            public void onItemSelected(AdapterView<?> parent, View view,
                                       int position, long id) {
                //change color of layout background
                findViewById(R.id.mainActivity).setBackgroundColor(Color.parseColor(colors[position]));

                //change color of selected text view to white
                TextView textView = (TextView)parent.getChildAt(0);
                textView.setBackgroundColor(Color.parseColor("white"));//CRASHES PROGRAM




            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

    }


    }



