package com.example.mtahtakomara;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Pertemuan2 extends Activity implements OnClickListener{
EditText inText;


public void onCreate(Bundle savedInstanceState) {
super.onCreate(savedInstanceState);
setContentView(R.layout.activity_pertemuan2);

inText = (EditText) findViewById(R.id.masukkan);
findViewById(R.id.cetak).setOnClickListener(this);
}


public boolean onCreateOptionsMenu(Menu menu) {
getMenuInflater().inflate(R.menu.pertemuan2, menu);
return true;
}
public void onClick(View v){
switch (v.getId()){
case R.id.cetak:
Toast.makeText(this, inText.getText(), Toast.LENGTH_LONG).show();
}
}
}

