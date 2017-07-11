package com.arp.baresypubs.bd;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import com.arp.baresypubs.bd.Contrato;

/**
 * Created by Alex on 10/07/2017.
 */

public class Ayudante extends SQLiteOpenHelper {

    public static final String DATABASE_NAME ="bares.db";
    public static final int DATABASE_VERSION = 1;

    public Ayudante(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }


    @Override
    public void onCreate(SQLiteDatabase db) {
        String sql;
        sql="create table "+ Contrato.TablaBar.TABLA+ " ("+
                Contrato.TablaBar._ID+ " integer primary key, "+
                Contrato.TablaBar.BAR+" integer, "+
                Contrato.TablaBar.NOMBRE+" text, "+
                Contrato.TablaBar.DIRECCION+" text, "+
                Contrato.TablaBar.COMENTARIO+" text, "+
                Contrato.TablaBar.ALTITUD+" integer, "+
                Contrato.TablaBar.LONGITUD+" integer)";
        db.execSQL(sql);

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }
}
