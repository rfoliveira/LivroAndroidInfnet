package br.livro.android.cap4.exemplociclovida;

import android.app.ListActivity;
import android.database.Cursor;
import android.net.Uri;
import android.os.Bundle;
import android.provider.ContactsContract;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class ExemploListaContatos1 extends ListActivity {

	private ArrayAdapter<String> adapter;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		
		// Uri para buscar os contatos
		Uri uri = ContactsContract.Contacts.CONTENT_URI;
		
		// Recupera o cursor dos contatos
		Cursor c = getContentResolver().query(uri, null, null, null, null);
		
		// Utiliza o ArrayAdapter para exibir o array de Strings na tela
		adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1);
		
		while (c.moveToNext())
		{
			// Lê a coluna nome e adiciona ao adapter
			adapter.add(c.getString(c.getColumnIndex(ContactsContract.Contacts.DISPLAY_NAME)));
		}
		
		// Informa o adapter responsável por exibir a lista do ListActivity
		setListAdapter(adapter);
		
		// Podemos fechar o cursor depois de utilizá-lo
		c.close();
	}
	
	@Override
	protected void onListItemClick(ListView l, View v, int position, long id) {
		// TODO Auto-generated method stub
		super.onListItemClick(l, v, position, id);
		
		// Clicou em um item na lista
		String s = (String)adapter.getItem(position);
		Toast.makeText(this, "Contato selecionado: " + s, Toast.LENGTH_SHORT).show();
	}
}
