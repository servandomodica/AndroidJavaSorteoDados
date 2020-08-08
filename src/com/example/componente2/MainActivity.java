package com.example.componente2;

import android.os.Bundle;
import android.app.Activity;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends Activity {
	Dado dado1, dado2, dado3;

	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		dado1 = (Dado) findViewById(R.id.dado1);
		dado2 = (Dado) findViewById(R.id.dado2);
		dado3 = (Dado) findViewById(R.id.dado3);
	}

	public void tirar(View v) {
		dado1.tirar();
		dado2.tirar();
		dado3.tirar();
		if (dado1.retornarValor() == dado2.retornarValor()
				&& dado1.retornarValor() == dado3.retornarValor()) {
			Toast.makeText(this, "Gano", Toast.LENGTH_LONG).show();
		} else {
			Toast.makeText(this, "Perdió", Toast.LENGTH_LONG).show();
		}
	}
}