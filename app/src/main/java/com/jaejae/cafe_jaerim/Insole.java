package com.jaejae.cafe_jaerim;

import android.content.Intent;
        import android.os.Bundle;
        import android.view.View;
        import android.widget.CheckBox;
        import android.widget.ImageButton;

        import androidx.appcompat.app.AppCompatActivity;


public class Insole extends AppCompatActivity {

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_insole);

        ImageButton back_button = (ImageButton) findViewById(R.id.back_button);
        ImageButton map = (ImageButton) findViewById(R.id.imageButton);
        CheckBox favoriteBtn = (CheckBox) findViewById(R.id.checkbox);

        Intent intent = getIntent();

        map.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent map = new Intent(getApplicationContext(), GoogleMapInsole.class);
                startActivity(map);
            }
        });

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

