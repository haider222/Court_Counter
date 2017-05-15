package com.example.l400.courtcounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {



    int ta = 0;
    int tb = 0;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void three(View view) {
        TextView teama = (TextView)findViewById(R.id.teama);
        ta = ta + 3;
        teama.setText(ta + "");
    }
    public void two(View view) {
        TextView teama = (TextView)findViewById(R.id.teama);
        ta = ta + 2;
        teama.setText(ta + "");
    }
    public void one(View view) {
        TextView teama = (TextView)findViewById(R.id.teama);
        ta = ta + 1;
        teama.setText(ta + "");
    }

    public void reset(View view) {
        TextView teama = (TextView)findViewById(R.id.teama);
        TextView teamb = (TextView)findViewById(R.id.teamb);
        teama.setText("" + 0);
        teamb.setText("" + 0);
    }

    public void oneb(View view) {
        TextView teamb = (TextView)findViewById(R.id.teamb);
        tb = tb + 1;
        teamb.setText("" + tb);
    }

    public void twob(View view) {
        TextView teamb = (TextView)findViewById(R.id.teamb);
        tb = tb + 2;
        teamb.setText("" + tb);
    }

    public void threeb(View view) {
        TextView teamb = (TextView)findViewById(R.id.teamb);
        tb = tb + 3;
        teamb.setText("" + tb);
    }
}
