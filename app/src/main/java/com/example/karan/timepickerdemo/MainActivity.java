package com.example.karan.timepickerdemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.TimePicker;

public class MainActivity extends AppCompatActivity {
    private TextView tv;
    private TimePicker tp;
    private Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //find View by id
        tv = findViewById(R.id.tv);
        tp = findViewById(R.id.tp);
        btn = findViewById(R.id.btn);
        tv.setText(getTime());
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tv.setText(getTime());
            }
        });
    }

    public String getTime() {
        String CurrentTime = "Current Time " + tp.getCurrentHour() + ":" + tp.getCurrentMinute();
        return CurrentTime;
    }
}
