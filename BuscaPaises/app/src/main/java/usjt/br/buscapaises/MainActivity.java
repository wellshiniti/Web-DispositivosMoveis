package usjt.br.buscapaises;

/* Nome: Wellington Shiniti Kawashima
   R.A: 81620964
*/

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Spinner;

public class MainActivity extends Activity {
    public static final String CHAVE = "usjt.br.buscapaises.nome";

    Spinner spinnerContinente;
    String continente = "Todos";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        spinnerContinente = (Spinner)findViewById(R.id.spin);
        spinnerContinente.setOnItemSelectedListener(new PaisSelecionado());
    }
    public void buscarChamados(View view){
        Intent intent = new Intent(this, ListarChamadosActivity.class);
        intent.putExtra(CHAVE, continente);
        startActivity(intent);
    }
    private class PaisSelecionado implements AdapterView.OnItemSelectedListener {
        @Override
        public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
            continente = (String) parent.getItemAtPosition(position);
        }

        @Override
        public void onNothingSelected(AdapterView<?> parent) {

        }
    }
}
