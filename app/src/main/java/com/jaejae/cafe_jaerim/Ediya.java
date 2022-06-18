package com.jaejae.cafe_jaerim;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;

import com.google.firebase.database.DatabaseReference;


public class Ediya extends AppCompatActivity {

    DatabaseReference bookmark;
    

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ediya);

        ImageButton back_button = (ImageButton) findViewById(R.id.back_button);
        ImageButton bookmark = (ImageButton) findViewById(R.id.bookmark_pic1);

        Intent intent = getIntent();
//        String filename = intent.getStringExtra("filename");

        back_button.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent intent = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(intent);
            }
        });
    }
}
