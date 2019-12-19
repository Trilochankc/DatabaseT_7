package com.trilochan.databaset_7.Helper;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

public class MyHelper extends SQLiteOpenHelper {

private static  final String databaseName = "DictionaryDb";
private static final int dbversion = 1;
//tblwords fields

    private static final String tblWord = "tblWord";
    private static  final String WordID = "WordId";
    private static final String Word = "Word";
    private static final String Meaning = "Meaning";

    @Override
    public void onCreate(SQLiteDatabase db) {

        String query = "CREATE TABLE " + tblWord +
                "("
                + WordID + " INTEGER PRIMARY KEY AUTOINCREMENT, " +
                Word + " TEXT,"
                + Meaning + " TEXT" +
        ")";
        db.execSQL(query);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }

    public MyHelper(@Nullable Context context, @Nullable String name, @Nullable SQLiteDatabase.CursorFactory factory, int version) {
        super(context, name, factory, version);
    }

}
