package com.example.p1431658.listviewwithparse;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

/**
 * Created by P1431658 on 24/1/2016.
 */
public class LeftRight extends AppCompatActivity implements View.OnClickListener {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.leftright);

        Button btn1 = (Button) findViewById(R.id.buttontop);
        btn1.setOnClickListener(this);
        Button btn2 = (Button) findViewById(R.id.buttonbtm);
        btn2.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        Intent i;
        switch (v.getId()) {

            case R.id.buttontop:
                i=new Intent(this,ActivityActivity.class);
                startActivity(i);
                break;
            case R.id.buttonbtm:
                i=new Intent(this,FindFriends.class);
                startActivity(i);
                break;
        }
    }
}
