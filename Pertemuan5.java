package com.example.mtahtakomara;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.widget.Button;
import android.widget.TextView;
import android.view.View;

public class Pertemuan5 extends Activity {
	
	//R.1
		TextView input1, input2,
		operator, result, notif;
		Button btHitung;

		//V.1
		private int operation = 0;
		private double HasilAkhir = 0.0;
		private String Cek1 = "";
		private String Cek2 = "";
		

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_pertemuan5);
		
		//R.2
        input1 = (TextView)findViewById(R.id.angkapertama);
        input2 = (TextView) findViewById(R.id.angkakedua);
        operator = (TextView) findViewById(R.id.operasi);
        result = (TextView) findViewById(R.id.hasil);
        notif = (TextView) findViewById(R.id.Keterangan);
        //R.3
        btHitung = (Button) findViewById(R.id.button1);
        }
  //Metod.Hitung
    public void klikHitungYa(View V){
    double inputA =  Double.parseDouble(input1.getText().toString());
    double inputB =  Double.parseDouble(input2.getText().toString());
    HasilAkhir = inputA + inputB;
    String hasilString = String.valueOf(HasilAkhir);
    result.setText(hasilString);
    operator.setText("+");
    if(HasilAkhir>0){
    notif.setText("angka positif");
    }else if(HasilAkhir<0){
    notif.setText("angka negatif");
    }
    }


	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.pertemuan5, menu);
		return true;
	}

}

