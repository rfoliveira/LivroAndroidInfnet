package br.livro.android.cap4.exemplociclovida;

import java.util.List;

import android.content.Context;
import android.database.DataSetObserver;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListAdapter;
import android.widget.TextView;

public class SmileAdapter extends BaseAdapter {

	private Context context;
	private List<Smile> lista;
	
	public SmileAdapter(Context context, List<Smile> lista) {
		this.context = context;
		this.lista = lista;
	}
	
	public int getCount() {
		return lista.size();
	}
	
	public Object getItem(int position) {
		return lista.get(position);
	}
	
	public long getItemId(int position) {
		return position;
	}
	
	public View getView(int position, View convertView, ViewGroup parent) {
		//Recupera o Smile da posição atual
		Smile smile = lista.get(position);
		LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
		View v = inflater.inflate(R.layout.smile_detalhes,  null);
		
		// Atualiza o valor do Text para o nome do Smile
		TextView txtNome = (TextView)v.findViewById(R.id.nome);
		txtNome.setText(smile.nome);
		
		// Atualiza a imagem para a imagem do smile
		// A imagem é definida por um recurso @drawable
		ImageView img = (ImageView)v.findViewById(R.id.img);
		img.setImageResource(smile.getImagem());
		
		return v;
	}
}
