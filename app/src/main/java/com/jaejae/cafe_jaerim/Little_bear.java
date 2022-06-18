package com.jaejae.cafe_jaerim;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;
import java.util.List;


public class Little_bear extends AppCompatActivity {

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_little_bear);

        ImageButton back_button = (ImageButton) findViewById(R.id.back_button);
        CheckBox favoriteBtn = (CheckBox) findViewById(R.id.checkbox);

        Intent intent = getIntent();

        back_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), SearchList.class);
                startActivity(intent);
            }
        });

        favoriteBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (favoriteBtn.isChecked()) {
                    favoriteBtn.setChecked(true);
//                    fav_cafe.add("이디야");
                } else {
                    favoriteBtn.setChecked(false);
                }
            }
        });
    }
}