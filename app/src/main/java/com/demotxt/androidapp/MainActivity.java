package com.demotxt.androidapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    int mycountvalue=0;
    Button btminus,btpuls;
    TextView txCount,txReset;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btminus=findViewById(R.id.btminus);
        btpuls=findViewById(R.id.btpuls);
        txCount=findViewById(R.id.txCount);
        txReset=findViewById(R.id.txReset);
        btminus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (mycountvalue!=0)
                {mycountvalue = mycountvalue - 1;
                txCount.setText(mycountvalue + "");
                }

            }

        });
        btpuls.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mycountvalue=mycountvalue+1;
                txCount.setText(mycountvalue+"");

            }
        });
        txReset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mycountvalue=0;
                txCount.setText(mycountvalue+"");

            }
        });
    }
}
