/* Nome: Wellington Shiniti Kawashima
   R.A: 81620964
*/

package usjt.br.buscapaises;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class DetalheChamadoActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detalhe_chamado);
        TextView txtPais = (TextView)findViewById(R.id.chamado_selecionado);
        Intent intent = getIntent();
        Pais pais = (Pais)intent.getSerializableExtra(ListarChamadosActivity.PAIS);
        txtPais.setText(pais.toString());
    }
}
