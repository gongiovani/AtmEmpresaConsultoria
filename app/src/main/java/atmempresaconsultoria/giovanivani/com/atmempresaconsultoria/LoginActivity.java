package atmempresaconsultoria.giovanivani.com.atmempresaconsultoria;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class LoginActivity extends Activity {

    private TextView textoInformeNome;
    private Button botaoLogar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        textoInformeNome = (TextView) findViewById(R.id.txtInformeNome);
        botaoLogar = (Button) findViewById(R.id.btnLogar);

        botaoLogar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(LoginActivity.this, MainActivity.class);

                String textoInformado = textoInformeNome.getText().toString();

                intent.putExtra("nome", textoInformado);
                startActivity(intent);
            }
        });
    }
}
