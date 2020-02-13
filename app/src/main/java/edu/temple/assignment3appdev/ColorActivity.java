package edu.temple.assignment3appdev;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Spinner;


public class ColorActivity extends AppCompatActivity {

    String[] colors = {"red", "blue", "green", "black", "gray", "cyan", "magenta", "yellow", "lightgray", "darkgray", "aqua", "fuchsia"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Spinner mySpinner = (Spinner) findViewById(R.id.spinner1);
        mySpinner.setAdapter(new ColorAdapter(ColorActivity.this, colors));
    }
}
