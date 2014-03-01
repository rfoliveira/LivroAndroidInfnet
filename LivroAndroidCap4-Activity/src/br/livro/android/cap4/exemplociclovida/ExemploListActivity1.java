package br.livro.android.cap4.exemplociclovida;

import android.app.ListActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class ExemploListActivity1 extends ListActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		
		// Array de string para visualizar na lista
		String[] itens = new String[] { "Nome 1", "Nome 2", "Nome 3" };
		
		// Utiliza o adaptador ArrayAdapter, para exibir o array de Strings na tela
		ArrayAdapter<String> arrayAdapter = 
				new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, itens);
		
		setListAdapter(arrayAdapter);
	}
	
	@Override
	protected void onListItemClick(ListView l, View v, int position, long id) {
		// TODO Auto-generated method stub
		super.onListItemClick(l, v, position, id);
		
		// Pega o item naquela posição
		Object obj = this.getListAdapter().getItem(position);
		String item = obj.toString();
		
		// Exibe um alerta
		Toast.makeText(this, "Você selecionou: " + item, Toast.LENGTH_SHORT).show();
	}
}
