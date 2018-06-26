package com.example.chensy96.midterm1;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;
import android.widget.TextView;

public class IntroActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_intro);

        //set name
        TextView namet = (TextView)findViewById(R.id.introname);
        Intent intent = getIntent();
        String current = intent.getExtras().getString("current");
        // current should be the name of the current Professor
        namet.setText(current);

        //set title
        TextView titlet = (TextView)findViewById(R.id.introtitle);
        String currentT = intent.getExtras().getString("currentT");
        titlet.setText(currentT);

        //set office
        TextView officet = (TextView)findViewById(R.id.introoffice);
        String currentO = intent.getExtras().getString("currentO");
        officet.setText(currentO);

        //set email
        TextView emailt = (TextView)findViewById(R.id.introemail);
        String currentE = intent.getExtras().getString("currentE");
        emailt.setText(currentE);

        //set intro
        TextView introt = (TextView)findViewById(R.id.intro);
        String currentI = intent.getExtras().getString("currentI");
        introt.setText(currentI);

        //set pic
        ImageView pic = (ImageView)findViewById(R.id.profpic);
        int currentP = intent.getExtras().getInt("currentP");
        if (currentP == 1) {
            pic.setImageResource(R.drawable.mike);
        }
        if (currentP == 2) {
            pic.setImageResource(R.drawable.tom);
        }
        if (currentP == 3) {
            pic.setImageResource(R.drawable.prasad);
        }
        if (currentP == 4) {
            pic.setImageResource(R.drawable.reilly);
        }
        if (currentP == 5) {
            pic.setImageResource(R.drawable.read);
        }


    }
}
