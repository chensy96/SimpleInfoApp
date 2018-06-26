package com.example.chensy96.midterm1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MajorActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_major);

        //set major
        TextView majort = (TextView)findViewById(R.id.majors);
        majort.setText("CS206, CS230, CS305, CS306, CS318, MC215, MA 200, one 200 CS, two 300 CS ");

        //set minor
        TextView minort = (TextView)findViewById(R.id.minors);
        minort.setText("CS206, two of CS305, CS318, CS230, two additional CS courses");

        //set honor
        TextView honort = (TextView)findViewById(R.id.honors);
        honort.setText("Students wishing to qualify for departmental honors in the computer science major must:\n" +
                "1.\tComplete all departmental requirements for the computer science major and have a GPA of 3.5 or higher for all course work (MC and CS) taken in the department, together with a course in another discipline that has substantial computer science content if taken as an elective with permission of the department;\n" +
                "2.\tHave a GPA of 3.0 for all course work taken at Skidmore;\n" +
                "3.\tFile with the department, by the end of the official add-drop period of the spring semester of the senior year, a declaration of intention to qualify for honors; and\n" +
                "4.\tSubmit an honors thesis to be read by a review committee, and give an oral presentation of the thesis to the department. The review committee will evaluate the thesis to determine if it is of the exceptional quality that merits honors; the committee's recommendation will be submitted to the department for final adjudication.\n");

    }
}


