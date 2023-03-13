package com.example.switchtogglebutton;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Switch;
import android.widget.ToggleButton;

public class MainActivity extends AppCompatActivity {
    Switch sw;
    ToggleButton tb;
    Button btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        sw = (Switch) findViewById(R.id.switch1);
        tb = (ToggleButton) findViewById(R.id.tB);
        btn = (Button) findViewById(R.id.button);
    }

    public void go(View view) {
        if
            (sw.isChecked() && tb.isChecked()) setActivityBackgroundColor(Color.BLUE);
        else if
            (!(sw.isChecked()) && tb.isChecked()) setActivityBackgroundColor(Color.RED);
        else if
            (sw.isChecked() && !(tb.isChecked())) setActivityBackgroundColor(Color.YELLOW);
        else
            setActivityBackgroundColor(Color.GREEN);
    }
    public void setActivityBackgroundColor(int color) {
        View view = this.getWindow().getDecorView();
        view.setBackgroundColor(color);
    }
}