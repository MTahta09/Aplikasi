package com.example.mtahtakomara;

import android.os.Bundle;
import android.app.TabActivity;
import android.content.Intent;
import android.widget.TabHost;
import android.app.Activity;
import android.view.Menu;

public class MainActivity extends TabActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        TabHost tabhost = getTabHost();
        TabHost.TabSpec spec;
        Intent intent;
        
        intent = new Intent().setClass(this, Home.class);
        spec = tabhost.newTabSpec("Home").setIndicator("Home",null).setContent(intent);
        tabhost.addTab(spec);
        
        intent = new Intent().setClass(this, Pertemuan.class);
        spec = tabhost.newTabSpec("pertemuan").setIndicator("Pertemuan",null).setContent(intent);
        tabhost.addTab(spec);
        
        intent = new Intent().setClass(this, Lainnya.class);
        spec = tabhost.newTabSpec("Lainnya").setIndicator("Lainnya",null).setContent(intent);
        tabhost.addTab(spec);
        
        intent = new Intent().setClass(this, Biodata.class);
        spec = tabhost.newTabSpec("biodata").setIndicator("Biodata",null).setContent(intent);
        tabhost.addTab(spec);

    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }
    
}

