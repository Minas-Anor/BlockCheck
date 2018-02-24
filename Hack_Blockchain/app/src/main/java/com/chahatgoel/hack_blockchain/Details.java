package com.chahatgoel.hack_blockchain;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

/**
 * Created by Chahat goel on 24-02-2018.
 */
public class Details extends AppCompatActivity {


    TextView title, time, details;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);

        title = (TextView) findViewById(R.id.mytitle);
        time = (TextView) findViewById(R.id.mytime);
        details = (TextView) findViewById(R.id.mydetails);


        String _title = getIntent().getStringExtra("MyTITLE");
        String _news = getIntent().getStringExtra("MyNEWS");
        String _time = getIntent().getStringExtra("MyTime");

        title.setText(_title);
        time.setText(_time + "\n\n");
        details.setText(_news);

    }
}