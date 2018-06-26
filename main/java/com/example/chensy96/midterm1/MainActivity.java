package com.example.chensy96.midterm1;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private Button btnf;
    private Button btnc;
    private Button btnm;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnf = (Button) findViewById(R.id.btnf);
        btnf.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent newIntent = new Intent(getApplicationContext(), FacultyActivity.class);
                startActivity(newIntent);
            }
        });

        btnc = (Button) findViewById(R.id.btnc);
        btnc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent newIntent2 = new Intent(getApplicationContext(), CourseActivity.class);
                startActivity(newIntent2);
            }
        });

        btnm = (Button) findViewById(R.id.btnm);
        btnm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent newIntent3 = new Intent(getApplicationContext(), MajorActivity.class);
                startActivity(newIntent3);
            }
        });


    }
}
