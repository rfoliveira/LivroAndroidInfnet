package br.livro.android.cap4.exemplociclovida;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TableLayout.LayoutParams;

public class ExemploCicloVidaAbrirTela extends Activity implements OnClickListener {

	//private static final String CATEGORIA = "livro";
	//private static final int MENSAGEM_RETORNO = 1;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		
		Button b = new Button(this);
		b.setText("Clique aqui para abrir a tela");
		b.setLayoutParams(new LayoutParams(LayoutParams.WRAP_CONTENT, LayoutParams.WRAP_CONTENT));
		b.setOnClickListener(this);
		
		setContentView(b);		
	}
	
	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		Intent it = new Intent(this, Tela2.class);
		Bundle params = new Bundle();
		params.putString("msg", "Olá");
		it.putExtras(params);
		
		startActivity(it);
	}
}
