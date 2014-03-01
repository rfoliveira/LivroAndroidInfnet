package br.livro.android.cap2;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ImageView;

public class Exemplo3 extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		
		setContentView(R.layout.layout_exemplo3);
		
		ImageView img2 = (ImageView)findViewById(R.id.imagem2);
		img2.setImageResource(R.drawable.ic_launcher);
	}
}
