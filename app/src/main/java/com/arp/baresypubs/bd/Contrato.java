package com.arp.baresypubs.bd;

import android.net.Uri;
import android.provider.BaseColumns;

/**
 * Created by Alex on 10/07/2017.
 */

public class Contrato {

    public Contrato() {
    }

    public static abstract class TablaBar implements BaseColumns{
        public static String TABLA="bar";
        public static String BAR="idbar";
        public static String NOMBRE="nombre";
        public static String DIRECCION="direccion";
        public static String COMENTARIO="comentario";
        public static String ALTITUD="altitud";
        public static String LONGITUD="longitud";

        //La autoridad es la cadena q identifica a qué contentprovider se llama
        public final static String AUTHORITY = "com.arp.app.Proveedor";
        //Definir como llego a la tabla cliente (a q tabla estoy llegando)
        public final static Uri CONTENT_URI =
                Uri.parse("content://" + AUTHORITY + "/" + TABLA);
        public final static String SINGLE_MIME =
                "vnd.android.cursor.item/vnd." + AUTHORITY + TABLA;
        public final static String MULTIPLE_MIME =
                "vnd.android.cursor.dir/vnd." + AUTHORITY + TABLA;
    }
}
