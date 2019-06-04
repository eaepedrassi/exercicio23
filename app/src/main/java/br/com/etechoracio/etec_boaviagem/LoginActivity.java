package br.com.etechoracio.etec_boaviagem;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity {

    private EditText editUsuario;
    private EditText editSenha;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        editUsuario = findViewById(R.id.editUsuario);
        editSenha = findViewById(R.id.editSenha);
    }

    public void onEntrar(View view) {
        if (editUsuario.getText().toString().equals("admin") && editSenha.getText().toString().equals("admin")) {
            Intent int1 = new Intent(this,MenuActivity.class);
            startActivity(int1);

        } else {
            Toast aviso = Toast.makeText(this, "Usuário e/ou senha inválidos", Toast.LENGTH_SHORT);
            aviso.show();
        }
    }
}
