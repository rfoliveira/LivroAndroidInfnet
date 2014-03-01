package br.livro.android.cap4.exemplociclovida;

import java.util.ArrayList;
import java.util.HashMap;

import android.app.ListActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ListView;
import android.widget.SimpleAdapter;
import android.widget.Toast;

public class ExemploSimpleAdapter1 extends ListActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		
		ArrayList<HashMap<String, String>> list = new ArrayList<HashMap<String, String>>();
		
		// Cada item da lista precisa ser um HashMap
		// O HashMap contém as chaves e valores necessário para preencher os elementos da tela
		for (int i = 0; i < 10; i++) {
			HashMap<String, String> item = new HashMap<String, String>();
			
			item.put("nome", "Nome " + i);
			item.put("fone", "Fone " + i);
			list.add(item);
		}
		
		// Utiliza o adapter SimpleAdapter
		// Array que define as chaves do HashMap
		String[] from = new String[] { "nome", "fone" };
		
		// text1 e text2 são padrões do android para o layout nativo "two_line_list_item"
		int[] to = new int[] { android.R.id.text1, android.R.id.text2 };
		int layoutNativo = android.R.layout.two_line_list_item;
		
		setListAdapter(new SimpleAdapter(this, list, layoutNativo, from, to));
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
