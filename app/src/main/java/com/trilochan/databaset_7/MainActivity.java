package com.trilochan.databaset_7;

import androidx.appcompat.app.AppCompatActivity;

import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

import com.trilochan.databaset_7.Helper.MyHelper;

public class MainActivity extends AppCompatActivity {

    EditText EtWord, etMeaning;
    Button BtnAddWord;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EtWord = findViewById(R.id.etWord);
        etMeaning = findViewById(R.id.etMeaning);
        BtnAddWord = findViewById(R.id.btnAddWord);

        final MyHelper myHelper = new MyHelper(this);
        final SQLiteDatabase sqLiteOpenHelper = myHelper.getWritableDatabase();
    }
}
