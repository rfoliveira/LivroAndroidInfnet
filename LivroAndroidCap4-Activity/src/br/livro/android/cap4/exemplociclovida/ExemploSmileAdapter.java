package br.livro.android.cap4.exemplociclovida;

import java.util.ArrayList;

import android.app.ListActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ListView;
import android.widget.Toast;

public class ExemploSmileAdapter extends ListActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		
		ArrayList<Smile> list = new ArrayList<Smile>();
		
		list.add(new Smile("Feliz", Smile.FELIZ));
		list.add(new Smile("Triste", Smile.TRISTE));
		list.add(new Smile("Louco", Smile.LOUCO));
		
		// layout customizado para cada linha do Smile
		setListAdapter(new SmileAdapter(this, list));		
	}
	
	@Override
	protected void onListItemClick(ListView l, View v, int position, long id) {
		// TODO Auto-generated method stub
		super.onListItemClick(l, v, position, id);
		
		// Pega o Smile naquela posição
		Smile smile = (Smile)getListAdapter().getItem(position);
		
		// Exibe um alerta
		Toast.makeText(this, "Você selecionou: " + smile.nome, Toast.LENGTH_SHORT).show();
	}
}
