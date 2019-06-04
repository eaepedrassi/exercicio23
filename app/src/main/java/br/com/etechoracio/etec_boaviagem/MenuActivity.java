package br.com.etechoracio.etec_boaviagem;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MenuActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
    }

    public void onSelecionaropcao(View view){
        switch (view.getId()){
            case R.id.viewNovaViagem:
                Intent int2 = new Intent(this,ViagemActivity.class);
                startActivity(int2);
                break;

            case R.id.viewNovoGasto:
                Intent int3 = new Intent(this,GastoActivity.class);
                startActivity(int3);
                break;

            case R.id.viewMinhasViagens:
                Toast aviso = Toast.makeText(this, "Em Desenvolvimento", Toast.LENGTH_SHORT);
                aviso.show();
                break;

            case R.id.viewConfig:
                Toast aviso2 = Toast.makeText(this, "Em Desenvolvimento", Toast.LENGTH_SHORT);
                aviso2.show();
        }
    }
}
