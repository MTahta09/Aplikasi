package com.example.mtahtakomara;

import android.os.Bundle;
import android.app.ListActivity;
import android.view.Menu;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;
import android.content.Intent;
import android.view.View;
import android.app.Activity;
import android.view.Menu;

public class Pertemuan extends ListActivity {
	
	String[] pertemuan = {
			"Pertemuan 1",
			"Pertemuan 2",
			"pertemuan 3",
			"Pertemuan 4",
			"Pertemuan 5"};

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_pertemuan);
		setListAdapter(new ArrayAdapter<String>
		(this,android.R.layout.simple_list_item_1, pertemuan));
	}
	
	public void onListItemClick(ListView parent, View v, int urutan, long id) {
    	Object detail = this.getListAdapter().getItem(urutan);
    	String tampil = detail.toString();
    	Intent i = null;
    	if(tampil=="Pertemuan 1")
    	{
    		i = new Intent(Pertemuan.this, Pertemuan1.class);
    		startActivity(i);
    	}
    	else if(tampil=="Pertemuan 2")
    	{
    		i = new Intent(Pertemuan.this, Pertemuan2.class);
    		startActivity(i);
    	}
    	else if(tampil=="Pertemuan 3")
    	{
    		i = new Intent(Pertemuan.this, Pertemuan3.class);
    		startActivity(i);
    	}
    	else if(tampil=="Pertemuan 4")
    	{
    		i = new Intent(Pertemuan.this, Pertemuan4.class);
    		startActivity(i);
    	}
    	else if(tampil=="Pertemuan 5")
    	{
    		i = new Intent(Pertemuan.this, Pertemuan5.class);
    		startActivity(i);
    	}
    }

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.pertemuan, menu);
		return true;
	}

}

