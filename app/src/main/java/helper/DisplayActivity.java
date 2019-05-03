package com.e.sqllite;

import android.database.sqlite.SQLiteDatabase;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

import helper.MyHelper;
import model.Word;

public class DisplayActivity extends AppCompatActivity {
    private ListView IstWords;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display);
        IstWords =findViewById(R.id.IstWords);
        LoadWord();
    }
    private void LoadWord(){
        final MyHelper myHelper=new MyHelper(this);
        final SQLiteDatabase sqLiteDatabase =myHelper.getWritableDatabase();
        List<Word>wordList=new ArrayList<>();
        wordList=myHelper. GetAllWords(SQLiteDatabase db){
            
        }
    }
}
