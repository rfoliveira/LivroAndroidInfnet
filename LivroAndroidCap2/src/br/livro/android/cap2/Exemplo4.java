package br.livro.android.cap2;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Exemplo4 extends Activity {
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		
		setContentView(R.layout.layout_exemplo4_listener);
		
		final EditText edtNome = (EditText)findViewById(R.id.campoNome);
		final TextView tvResultado = (TextView)findViewById(R.id.campoResultado);
		Button btnOK = (Button)findViewById(R.id.botaoOk);
		
		btnOK.setOnClickListener(new Button.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				String nome = edtNome.getText().toString();
				
				tvResultado.setText(String.format("Obrigado %s", nome));
			}
		});
	}
}
