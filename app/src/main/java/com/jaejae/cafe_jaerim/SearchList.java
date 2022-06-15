package com.jaejae.cafe_jaerim;

import android.os.Bundle;
import android.util.Log;

import androidx.appcompat.app.AppCompatActivity;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class SearchList extends AppCompatActivity {
    FirebaseDatabase database;
    DatabaseReference stateRef;

    final String TAG = "TAG+Caferagment";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_searchlist);

        database = FirebaseDatabase.getInstance("https://cafe-jaerim-default-rtdb.firebaseio.com/");
        stateRef = database.getReference("cafe");  // real time

        Log.d(TAG, "show cafe search list");


    }
}