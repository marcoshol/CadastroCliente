package com.example.marcos.cadastrocliente;

import android.content.ContentValues;
import android.content.Intent;
import android.database.sqlite.SQLiteDatabase;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;


public class MainActivity extends ActionBarActivity {

    private EditText nome, cidade, telefone, estado, bairro, endereco;
    private String sNome, sCidade, sTelefone, sEstado, sBairro, sEndereco;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        nome = (EditText)findViewById(R.id.edt_nome);
        cidade = (EditText)findViewById(R.id.edt_cidade);
        telefone = (EditText)findViewById(R.id.edt_telefone);
        estado = (EditText)findViewById(R.id.edt_estado);
        bairro = (EditText)findViewById(R.id.edt_bairro);
        endereco = (EditText)findViewById(R.id.edt_endereco);
    }

    public void cadastrar(View v){

        sNome = nome.getText().toString();
        sCidade = cidade.getText().toString();
        sTelefone = telefone.getText().toString();
        sEstado = estado.getText().toString();
        sBairro = bairro.getText().toString();
        sEndereco = endereco.getText().toString();

        Pessoa pessoa = new Pessoa();
        pessoa.setpNome(sNome);
        pessoa.setpTelefone(sTelefone);
        pessoa.setpEndereco(sEndereco);
        pessoa.setpBairro(sBairro);
        pessoa.setpCidade(sCidade);
        pessoa.setpEstado(sEstado);

        Intent i = new Intent(this, MostraPessoa.class);
        i.putExtra("Pessoa", pessoa);
        startActivity(i);

    }




    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }


}
