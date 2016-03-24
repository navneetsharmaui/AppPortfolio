package com.example.ryuhadouken.myappportfolio;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button bp1, bp2, bp3, bp4, bp5, bp6;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        bp1 = (Button)findViewById(R.id.button);
        bp2 = (Button)findViewById(R.id.button2);
        bp3 = (Button)findViewById(R.id.button3);
        bp4 = (Button)findViewById(R.id.button4);
        bp5 = (Button)findViewById(R.id.button5);
        bp6 = (Button)findViewById(R.id.button6);

        bp1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this,"Spotify Streamer App", Toast.LENGTH_SHORT).show();
            }
        });

        bp2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "Football Scores App", Toast.LENGTH_LONG).show();
            }
        });

        bp3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "Library App", Toast.LENGTH_LONG).show();
            }
        });

        bp4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "Build It Bigger", Toast.LENGTH_LONG).show();
            }
        });

        bp5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "XYZ Reader", Toast.LENGTH_LONG).show();
            }
        });

        bp6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "Capstone: My Own App", Toast.LENGTH_LONG).show();
            }
        });
    }
}
