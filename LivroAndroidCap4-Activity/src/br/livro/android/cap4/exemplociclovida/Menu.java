package br.livro.android.cap4.exemplociclovida;

import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class Menu extends ListActivity {

	private static final String[] nomes = new String[] {
		"Ciclo de Vida", "ArrayAdapter", "ListActivity", "SimpleAdapter1", "SimpleAdapter2", 
		"CursorAdapter 1", "CursorAdapter 2", "Cursor de Carros", "Customizado - Smile",
		"MapActivity", "MapActivity - Cristo", "Sair"
	};
	private static final String TAG = "Menu";
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		
		this.setListAdapter(new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, nomes));
	}
	
	@Override
	protected void onListItemClick(ListView l, View v, int position, long id) {
		Log.i(TAG, String.format("Opção selecionada: %d", position));
		
		switch (position) {
		case 0:
			startActivity(new Intent(this, ExemploCicloVidaAbrirTela.class));
			break;
		case 1:
			startActivity(new Intent(this, ExemploListaContatos1.class));
			break;
		case 2:
			startActivity(new Intent(this, ExemploListActivity1.class));
			break;
		case 3:
			startActivity(new Intent(this, ExemploSimpleAdapter1.class));
			break;
		case 4:
			startActivity(new Intent(this, ExemploSimpleAdapter2.class));
			break;
		case 5:
		case 6:
		case 7:
		case 8:
		case 9:
		case 10:
		case 11:
			exibirMensagemNaoImplementado();
			break;
		default:
			finish();
		}
	}

	private void exibirMensagemNaoImplementado() {
		Toast.makeText(this, "Não implementado.", Toast.LENGTH_SHORT).show();
	}
	
	
}
