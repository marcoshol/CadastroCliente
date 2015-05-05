package com.example.marcos.cadastrocliente;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by Marcos on 03/05/2015.
 */
public class DatabaseHelper extends SQLiteOpenHelper {
    private static final String BANCO_DADOS = "Cliente";
    private static int VERSION = 1;

    public DatabaseHelper(Context context) {
        super(context, BANCO_DADOS, null, VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        String dml = "CREATE TABLE cliente"+
        "(_id INTEGER PRIMARY KEY,"+
        "nome TEXT NOT NULL, cidade TEXT);";
        db.execSQL(dml);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }

    @Override
    public SQLiteDatabase getReadableDatabase() {
        return super.getReadableDatabase();
    }
}
