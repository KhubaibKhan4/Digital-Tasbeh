package com.example.tasbehandroid;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView ResultTv;
    Button Counter, Reset;
    int i = 0;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Reset = (Button) findViewById(R.id.reset);
        Counter = (Button) findViewById(R.id.counterbtn);
        ResultTv = (TextView) findViewById(R.id.textView);

        Counter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                i++;
                ResultTv.setVisibility(View.VISIBLE);
                ResultTv.setText(""+i);
            }
        });

        Reset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                i=0;
                ResultTv.setVisibility(View.VISIBLE);
                ResultTv.setText(""+i);
            }
        });
    }
}