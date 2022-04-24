package com.sarkarinaukri24.practical3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    private Button Btn1;
    private Button Decrement;
    private Button Reset;
    private TextView Text;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Text = findViewById(R.id.txt);
        Btn1 = findViewById(R.id.increase);
        Decrement = findViewById(R.id.decrease);
        Reset = findViewById(R.id.button2);
        Btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String getText = Text.getText().toString();
                int i = Integer.parseInt(getText);
                ++i;
                String s=String.valueOf(i);
                Text.setText(s);

            }
        });
        Decrement.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String getText = Text.getText().toString();
                int i = Integer.parseInt(getText);
                --i;
                String s=String.valueOf(i);
                Text.setText(s);

            }
        });
        Reset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String getText = Text.getText().toString();
                Text.setText("0");
            }

        });
    }

    ;
};