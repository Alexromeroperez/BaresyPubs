package com.arp.baresypubs;

import android.content.Context;
import android.database.Cursor;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CursorAdapter;
import android.widget.TextView;

/**
 * Created by Alex on 11/07/2017.
 */

public class Adaptador extends CursorAdapter {

    private LayoutInflater i;
    private View v;

    public Adaptador(Context context, Cursor c) {
        super(context, c,true);
    }

    @Override
    public View newView(Context context, Cursor cursor, ViewGroup parent) {
        i = LayoutInflater.from(parent.getContext());
        v = i.inflate(R.layout.lista_detalle, parent, false);
        return v;
    }

    @Override
    public void bindView(View view, Context context, Cursor cursor) {
        TextView tvBar;
        tvBar=(TextView)v.findViewById(R.id.tvBar);
        cursor.moveToFirst();
        tvBar.setText(cursor.getString(cursor.getColumnIndex("nombre")));
    }

}
