package com.example.android.tabhost_demo;

import android.app.TabActivity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TabHost;
import android.widget.TabHost.TabSpec;

public class MainActivity extends TabActivity {
    TabHost tabhost;


    TabSpec t1,t2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tabhost=(TabHost)findViewById(android.R.id.tabhost);
        tabhost.setup();
// t1 t2
        t1=tabhost.newTabSpec("Tab1");
        t1.setContent(R.id.tab1);
        t1.setIndicator("Tab1");
        Intent i=new Intent(MainActivity.this,First.class);
        t1.setContent(i);


        t2=tabhost.newTabSpec("Tab2");
        t2.setContent(R.id.tab2);
        t2.setIndicator("Tab2");
        Intent i1=new Intent(MainActivity.this,Second.class);
        t2.setContent(i1);

        tabhost.addTab(t1);
        tabhost.addTab(t2);

    }
}
