package com.jaejae.cafe_jaerim;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.EditText;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;
import java.util.List;

public class Activity_favList extends AppCompatActivity {

    private List<String> list;
    private ListView listView;          // 검색을 보여줄 리스트변수
    private searchlistAdapter adapter;      // 리스트뷰에 연결할 아답터

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_favlist);
        listView = findViewById(R.id.listView2);

        Intent favlist = getIntent();
        String receiveStr = favlist.getStringExtra("cafe");


        list = new ArrayList<>();
        list.add(receiveStr);

        adapter = new searchlistAdapter(list, this);
        listView.setAdapter(adapter);

//        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
//            @Override
//            public void onItemClick(AdapterView adapterView, View view, int i, long l) {
//                String selected_item = (String)adapterView.getItemAtPosition(i);
//                Intent intent;
//                if(selected_item != null && selected_item.equals("이디야 커피 전북대점")) {
//                    intent = new Intent(getApplicationContext(), Ediya.class);
//                }
//                else if(selected_item != null && selected_item.equals("이디야커피 전북대구정문점")) {
//                    intent = new Intent(getApplicationContext(), Ediya_jbnu.class);
//                }
//                else if(selected_item != null && selected_item.equals("인앤아웃")) {
//                    intent = new Intent(getApplicationContext(), In_out.class);
//                }
//                else if(selected_item != null && selected_item.equals("인솔커피")) {
//                    intent = new Intent(getApplicationContext(), Insole.class);
//                }
//                else if(selected_item != null && selected_item.equals("할리스 전북대 덕진광장점")) {
//                    intent = new Intent(getApplicationContext(), Hollys.class);
//                }
//                else if(selected_item != null && selected_item.equals("작은곰자리")) {
//                    intent = new Intent(getApplicationContext(), Little_bear.class);
//                }
//                else if(selected_item != null && selected_item.equals("명륜")) {
//                    intent = new Intent(getApplicationContext(), Myeongnyun.class);
//                }
//                else if(selected_item != null && selected_item.equals("빽다방")) {
//                    intent = new Intent(getApplicationContext(), Paiks_coffee.class);
//                }
//                else if(selected_item != null && selected_item.equals("알엘 커피")) {
//                    intent = new Intent(getApplicationContext(), Ralee.class);
//                }
//                else if(selected_item != null && selected_item.equals("로이")) {
//                    intent = new Intent(getApplicationContext(), Roy.class);
//                }
//                else if(selected_item != null && selected_item.equals("Ivy586")) {
//                    intent = new Intent(getApplicationContext(), Ivy.class);
//                }
//                else if(selected_item != null && selected_item.equals("스타벅스 전북대점")) {
//                    intent = new Intent(getApplicationContext(), StarBucks.class);
//                }
//                else if(selected_item != null && selected_item.equals("모모의 다락방")) {
//                    intent = new Intent(getApplicationContext(), Momo.class);
//                }
//                else{
//                    intent = new Intent(getApplicationContext(), MainActivity.class);
//                }
//
//                startActivity(intent);
//            }
//        });
    }
}
