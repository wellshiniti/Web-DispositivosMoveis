/* Nome: Wellington Shiniti Kawashima
   R.A: 81620964
*/

package usjt.br.buscapaises;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class ListarChamadosActivity extends Activity {
    public static final String PAIS = "usjt.br.buscapaises.descricao";
    ArrayList<String> nomes;
    Activity atividade;
    ArrayList<Pais> paises;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_listar_chamados);
        atividade = this;
        Intent intent = getIntent();
        String continente = intent.getStringExtra(MainActivity.CHAVE);
        nomes = Data.listarNomes(paises);
        paises = Data.listarPaises(continente);

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
                android.R.layout.simple_list_item_1, nomes);

        ListView listView = (ListView) findViewById(R.id.listview);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view,
                                    int position, long id) {
                Intent intent = new Intent(atividade, DetalheChamadoActivity.class);
                intent.putExtra(PAIS, paises.get(position));
                startActivity(intent);
            }
        });
    }
}