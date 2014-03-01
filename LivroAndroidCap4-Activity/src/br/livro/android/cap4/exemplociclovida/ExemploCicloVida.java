package br.livro.android.cap4.exemplociclovida;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;

public class ExemploCicloVida extends Activity {

	private static final String CATEGORIA = "livro";
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		
		Log.i(CATEGORIA, getClassName() + ".onCreate() chamado: " + savedInstanceState);
	}

	// Retorna o nome da classe sem o pacote
	private String getClassName() {
		// TODO Auto-generated method stub		
		String s = getClass().getName();
		
		return s.substring(s.lastIndexOf("."));
	}

	@Override
	protected void onStart() {
		// TODO Auto-generated method stub
		super.onStart();
		Log.i(CATEGORIA, getClassName() + ".onStart() chamado.");
	}
	
	@Override
	protected void onRestart() {
		// TODO Auto-generated method stub
		super.onRestart();
		Log.i(CATEGORIA, getClassName() + ".onRestart() chamado.");
	}
	
	@Override
	protected void onResume() {
		// TODO Auto-generated method stub
		super.onResume();
		Log.i(CATEGORIA, getClassName() + ".onResume() chamado.");
	}
	
	@Override
	protected void onPause() {
		// TODO Auto-generated method stub
		super.onPause();
		Log.i(CATEGORIA, getClassName() + ".onPause() chamado.");
	}
	
	@Override
	protected void onStop() {
		// TODO Auto-generated method stub
		super.onStop();
		Log.i(CATEGORIA, getClassName() + ".onStop() chamado.");
	}
	
	@Override
	protected void onDestroy() {
		// TODO Auto-generated method stub
		super.onDestroy();
		Log.i(CATEGORIA, getClassName() + ".onDestroy() chamado.");
	}

}
