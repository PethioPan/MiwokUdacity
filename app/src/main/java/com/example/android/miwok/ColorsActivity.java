package com.example.android.miwok;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class ColorsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);

        ArrayList<Word> words = new ArrayList<Word>();
        words.add(new Word("red","weṭeṭṭi"));
        words.add(new Word("green","chokokki"));
        words.add(new Word("brown","ṭakaakki"));
        words.add(new Word("gray","ṭopoppi"));
        words.add(new Word("white","kululli"));
        words.add(new Word("black","kelelli"));
        words.add(new Word("dusty yellow","ṭopiisә"));
        words.add(new Word("mustard yellow","chiwiiṭә"));

        WordAdapter familyAdapter = new WordAdapter(this, 0, words);
        ListView familyListView = (ListView) findViewById(R.id.list);
        familyListView.setAdapter(familyAdapter);
    }
}
