package com.example.abithhussainh.ats;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

/**
 * Created by ABITH HUSSAIN H on 8/29/2016.
 */
public class Page3 extends Page2 {
    TextView t1,t2,t3,t4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.page2);
        t1=(TextView) findViewById(R.id.tv1);
        t2=(TextView) findViewById(R.id.tv2);
        t3=(TextView) findViewById(R.id.tv3);
        t4=(TextView) findViewById(R.id.tv4);
        t1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
    }
}
