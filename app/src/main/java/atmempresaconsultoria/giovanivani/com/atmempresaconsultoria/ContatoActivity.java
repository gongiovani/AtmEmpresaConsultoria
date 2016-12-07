package atmempresaconsultoria.giovanivani.com.atmempresaconsultoria;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class ContatoActivity extends AppCompatActivity {

    private Button botaoEnviar;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contato);

        botaoEnviar = (Button) findViewById(R.id.btnEnviar);

        botaoEnviar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(ContatoActivity.this, MainActivity.class));

            }
        });



    }
}
