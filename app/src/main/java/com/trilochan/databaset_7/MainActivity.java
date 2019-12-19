package com.trilochan.databaset_7;

import androidx.appcompat.app.AppCompatActivity;

import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

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
        final SQLiteDatabase sqLiteDatabase = myHelper.getWritableDatabase();


        BtnAddWord.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               if(myHelper.InsertData(EtWord.getText().toString(), etMeaning.getText().toString(), sqLiteDatabase))
                {
                    Toast.makeText(MainActivity.this, "Successfull", Toast.LENGTH_SHORT).show();

                }
                else {
                    Toast.makeText(MainActivity.this, "UnSuccessfull", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}

