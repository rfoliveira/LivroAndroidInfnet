package br.livro.android.cap4.exemplociclovida;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

public class Tela2 extends Activity {

	private static final String CATEGORIA = "livro";
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		
		TextView view = new TextView(this);
		view.setText("Esta é a tela 2.");
		
		setContentView(view);
		
		Intent it = getIntent();
		
		if (it != null)
		{
			Bundle params = it.getExtras();
			
			if (params != null)
			{
				String msg = params.getString("msg");
				Log.i(CATEGORIA, "Mensagem: " + msg);
			}
			
			/* ou sem usar o Bundle...
			 * String msg = it.getStringExtra("msg");
			 * Log.i(CATEGORIA, "Mensagem: " + msg);a
			 */
		}
	}
}
