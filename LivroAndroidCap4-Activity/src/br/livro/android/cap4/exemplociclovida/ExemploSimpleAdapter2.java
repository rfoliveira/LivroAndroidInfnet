package br.livro.android.cap4.exemplociclovida;

import java.util.ArrayList;
import java.util.HashMap;

import android.app.ListActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ListView;
import android.widget.SimpleAdapter;
import android.widget.Toast;

public class ExemploSimpleAdapter2 extends ListActivity {
	
	private static final String TAG = "ExemploSimpleAdapter2";

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.layout_contatos_fone);
		
		ArrayList<HashMap<String, String>> list = new ArrayList<HashMap<String, String>>();
		
		for (int i = 0; i < 10; i++) {
			HashMap<String, String> item = new HashMap<String, String>();
			
			item.put("nome", "Nome " + i);
			item.put("fone", "Fone " + i);
			
			list.add(item);
		}
		
		String[] from = new String[] { "nome", "fone" };
		int[] to = new int[] { R.id.nome, R.id.fone };
		
		setListAdapter(new SimpleAdapter(this, list, R.layout.layout_contatos_fone, from, to));
		Log.i(TAG, "ExemploSimpleAdapter2.onCrate()");
	}
	
	@Override
	protected void onListItemClick(ListView l, View v, int position, long id) {
		// TODO Auto-generated method stub
		super.onListItemClick(l, v, position, id);
		
		Object obj = this.getListAdapter().getItem(position);
		String item = obj.toString();
		
		// Exibe um alerta
		Toast.makeText(this, "Você selecionou: " + item, Toast.LENGTH_SHORT).show();
		Log.i(TAG, "ExemploSimpleAdapter2.onListItemClick()");
	}
}
