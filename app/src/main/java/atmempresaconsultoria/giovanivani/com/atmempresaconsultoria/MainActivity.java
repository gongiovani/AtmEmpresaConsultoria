package atmempresaconsultoria.giovanivani.com.atmempresaconsultoria;

import android.app.Activity;
import android.content.Intent;
import android.media.Image;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends Activity {

    private ImageView botaoEmpresa;
    private ImageView botaoServico;
    private ImageView botaoClientes;
    private ImageView botaoContato;
    private TextView nomeInformado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //busca a ida para referenciar o objeto
        botaoEmpresa = (ImageView) findViewById(R.id.empresaId);
        botaoServico = (ImageView) findViewById(R.id.servicosId);
        botaoClientes = (ImageView) findViewById(R.id.clientesId);
        botaoContato = (ImageView) findViewById(R.id.contatoId);

        nomeInformado = (TextView) findViewById(R.id.txtStatus);


        Bundle extra = getIntent().getExtras();

        if (extra !=null){
            String textoPassado = extra.getString("nome");
            nomeInformado.setText(textoPassado);

        }

        //EVENTO DE CLICK NA IMAGEM
        botaoEmpresa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, EmpresaActivity.class));

            }
        });

        botaoServico.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, ServicoActivity.class));
            }
        });

        botaoClientes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, ClientesActivity.class));
            }
        });

        botaoContato.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, ContatoActivity.class));
            }
        });

    }

}
