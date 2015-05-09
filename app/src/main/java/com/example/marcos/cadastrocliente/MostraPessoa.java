package com.example.marcos.cadastrocliente;

import android.content.ContentValues;
import android.database.sqlite.SQLiteDatabase;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;
import android.widget.Toast;


public class MostraPessoa extends ActionBarActivity {

    private TextView olanome, telefone, endereco, bairro, cidade, estado;
    private String sNome, sCidade, sTelefone, sEstado, sBairro, sEndereco;
    private DatabaseHelper helper;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mostra_pessoa);

        olanome = (TextView) findViewById(R.id.txt_ola);
        telefone = (TextView) findViewById(R.id.txt_telefone);
        endereco = (TextView) findViewById(R.id.txt_endereco);
        bairro = (TextView) findViewById(R.id.txt_bairro);
        cidade = (TextView) findViewById(R.id.txt_cidade);
        estado = (TextView) findViewById(R.id.txt_estado);

        Pessoa pessoa = (Pessoa) getIntent().getSerializableExtra("Pessoa");

        sNome = pessoa.getpNome().toString();
        sTelefone = pessoa.getpTelefone().toString();
        sEndereco = pessoa.getpEndereco().toString();
        sBairro = pessoa.getpBairro().toString();
        sCidade = pessoa.getpCidade().toString();
        sEstado = pessoa.getpEstado().toString();

        helper = new DatabaseHelper(this);
        SQLiteDatabase banco = helper.getWritableDatabase();

        ContentValues valores = new ContentValues();
        valores.put("nome",sNome);
        valores.put("telefone",sTelefone);
        valores.put("endereco",sEndereco);
        valores.put("bairro",sBairro);
        valores.put("cidade",sCidade);
        valores.put("estado",sEstado);

        long id = banco.insert("cliente", null, valores);

        if(id == -1){
            Toast.makeText(this, "Falha de gravação no Banco de Dados", Toast.LENGTH_LONG).show();
        }else{
            Toast.makeText(this, "Dados gravados com Sucesso", Toast.LENGTH_LONG).show();
        }

        olanome.setText(olanome.getText().toString()+sNome);
        telefone.setText(telefone.getText().toString()+sTelefone);
        endereco.setText(endereco.getText().toString()+sEndereco);
        bairro.setText(bairro.getText().toString()+sBairro);
        cidade.setText(cidade.getText().toString()+sCidade);
        estado.setText(estado.getText().toString()+sEstado);

    }



    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_mostra_pessoa, menu);
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
