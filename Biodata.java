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

public class Biodata extends ListActivity {
	String[] biodata = {
			"Nama: M. Tahta Komara",
			"NIM: 191011401481",
			"Kelas: 07TPLP014",
			"Alamat = Jl. Aren 2 Pondok Betung,Pondok Aren, Tangerang Selatan",
			"Semester: 7",
			"Mata Kuliah: Mobile Programming"};
	
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_biodata);
		setListAdapter(new ArrayAdapter<String>
		(this,android.R.layout.simple_list_item_1, biodata));
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.biodata, menu);
		return true;
	}

}