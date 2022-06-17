package com.jaejae.cafe_jaerim;

import androidx.appcompat.app.AppCompatActivity;


import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;

//public class MainActivity extends AppCompatActivity {
//
//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_main);
//    }
//}

public class MainActivity extends AppCompatActivity {
    Button button_search;
    ImageButton button_studycafe, button_instagram, button_takeout, button_bookmark;
    ImageView imageView, imageView1, imageView2, imageView3, imageView6, imageView7, imageView10, imageView11;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        setTheme(R.style.Theme_Cafe_jaerim);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button_search = findViewById(R.id.button_search);
        button_studycafe = findViewById(R.id.button_studycafe);
        button_instagram = findViewById(R.id.button_instagram);
        button_takeout = findViewById(R.id.button_takeout);
        button_bookmark = findViewById(R.id.button_bookmark);
        imageView = findViewById(R.id.imageView);
        imageView1 = findViewById(R.id.imageView1);
        imageView2 = findViewById(R.id.imageView2);
        imageView11 = findViewById(R.id.imageView11);

        button_search.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                Intent intent = new Intent(getApplicationContext(), SearchList.class);
                startActivity(intent);
            }
        });

        button_studycafe.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
//                Intent intent = new Intent(Home.this, SubActivity1.class);
//                startActivity(intent);
            }
        });
        button_instagram.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
//                Intent intent = new Intent(Home.this, SubActivity1.class);
//                startActivity(intent);
            }
        });
        button_takeout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
//                Intent intent = new Intent(Home.this, SubActivity1.class);
//                startActivity(intent);
            }
        });
        button_bookmark.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
//                Intent intent = new Intent(Home.this, SubActivity1.class);
//                startActivity(intent);
            }
        });

    }
}