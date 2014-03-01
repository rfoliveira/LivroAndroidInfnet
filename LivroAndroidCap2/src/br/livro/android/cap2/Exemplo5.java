package br.livro.android.cap2;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;

public class Exemplo5 extends Activity {

	private static final String CATEGORIA = "livro";
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		
		setContentView(R.layout.activity_main);
		
		// Verbose
		Log.v(CATEGORIA, "log de verbose");
		
		// Debug
		Log.d(CATEGORIA, "log de debug");
		
		// Info
		Log.i(CATEGORIA, "log de info");
		
		// Warning
		Log.w(CATEGORIA, "log de alerta");
		
		// Error
		Log.e(CATEGORIA, "log de erro", new RuntimeException("teste de erro"));
	}
}
