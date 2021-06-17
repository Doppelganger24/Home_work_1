package com.example.home_work_1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.calendar);

    }
    public void nextToLinear(View view) {
        setContentView(R.layout.next_activity);
    }

    public void nextToConstraint(View view) {
        setContentView(R.layout.activity_main);
    }

    public void nextToCalendar(View view) {
        setContentView(R.layout.calendar);
    }
}