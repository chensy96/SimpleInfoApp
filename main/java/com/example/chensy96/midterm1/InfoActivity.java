package com.example.chensy96.midterm1;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class InfoActivity extends AppCompatActivity {
    private int index;
    TextView infopreq;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_info);

        //set name
        TextView namet = (TextView)findViewById(R.id.infoname);
        Intent intent = getIntent();
        String current = intent.getExtras().getString("current");
        namet.setText(current);

        //set title
        TextView titlet = (TextView)findViewById(R.id.infotitle);
        String currentT = intent.getExtras().getString("currentT");
        titlet.setText(currentT);

        //set credits
        TextView creditt = (TextView)findViewById(R.id.infocredits);
        String currentC = intent.getExtras().getString("currentC");
        creditt.setText(currentC);

        //set info
        TextView infot = (TextView)findViewById(R.id.infoinfo);
        String currentI = intent.getExtras().getString("currentI");
        infot.setText(currentI);

        //set preq
        infopreq = (TextView)findViewById(R.id.infopreq);
        int p = intent.getExtras().getInt("currentPre");
        index = p;
        if (p == 1) {
            infopreq.setText("CS 106");
        }
        if (p == 2) {
            infopreq.setText("CS 206");
        }
        if (p == 5) {
            infopreq.setText("CS 305");
        }
        if (p == 0) {
        }
    }

    public void gotocourse(View v){
        Course f = new Course(this);
        if (infopreq.getText().equals("CS 106") || infopreq.getText().equals("CS 206") || infopreq.getText().equals("CS 305")) {
            Content c = f.getContent(infopreq.getText().toString());
            String currentName = c.getName();
            String currentTitle = c.getTitle();
            String currentCredits = c.getCredits();
            String currentInfo = c.getIntro();
            int currentPre = c.getPre();
            Intent intent = new Intent(this.getApplicationContext(), InfoActivity.class);
            intent.putExtra("current", currentName);
            intent.putExtra("currentT", currentTitle);
            intent.putExtra("currentC", currentCredits);
            intent.putExtra("currentI", currentInfo);
            intent.putExtra("currentPre", currentPre);
            startActivity(intent);
        }

    }
}
