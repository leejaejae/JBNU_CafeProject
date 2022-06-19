package com.jaejae.cafe_jaerim;

import android.os.Bundle;
import android.widget.ListView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class InstaCafeList extends AppCompatActivity {

    //    private List<StudyCafeData> list;          // 데이터를 넣은 리스트변수
    private ListView listView;          // 검색을 보여줄 리스트변수
    private TextView title;             // title
    private StudyCafeAdapter adapter;      // 리스트뷰에 연결할 아답터
    private ArrayList<StudyCafeData> arraylist;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_study_cafe_list);

        title = findViewById(R.id.title);
        listView = findViewById(R.id.listView);
        arraylist = new ArrayList<>();

        settingList();
//        arraylist.addAll(arraylist);
        adapter = new StudyCafeAdapter(this,R.layout.activity_itemlist, arraylist);
        listView.setAdapter(adapter);
    }

    private void settingList() {
        arraylist.add(new StudyCafeData(R.drawable.pretty_day_pic1,"예쁜하루 전북대점", "O", "O", "X"));
        arraylist.add(new StudyCafeData(R.drawable.ralee_pic1,"알엘커피", "O", "O", "X"));
        arraylist.add(new StudyCafeData(R.drawable.momo_pic1,"모모의 다락방", "X", "O", "O"));
        arraylist.add(new StudyCafeData(R.drawable.myeongnyun_pic1,"명륜", "O", "O", "O"));
        arraylist.add(new StudyCafeData(R.drawable.roy_pic1,"로이", "O", "O", "O"));
        arraylist.add(new StudyCafeData(R.drawable.go_mad_pic1,"고매드비", "O", "O", "O"));
        arraylist.add(new StudyCafeData(R.drawable.to_presso_pic1,"토프레소 전북대점", "O", "O", "O"));
        arraylist.add(new StudyCafeData(R.drawable.someday_afternoon_pic1,"어느날의 오후", "X", "O", "X"));
        arraylist.add(new StudyCafeData(R.drawable.cafe_goody_pic1,"카페구디", "O", "O", "O"));
        arraylist.add(new StudyCafeData(R.drawable.little_bear_pic1,"작은곰자리", "X", "O", "O"));
        arraylist.add(new StudyCafeData(R.drawable.doran_doran_pic1,"도란도란", "O", "O", "O"));
        arraylist.add(new StudyCafeData(R.drawable.the_man_pic1,"그남자네", "X", "O", "X"));
        arraylist.add(new StudyCafeData(R.drawable.merienda_pic1,"메리엔다", "O", "O", "O"));
        arraylist.add(new StudyCafeData(R.drawable.snowing_pic1,"스노잉 본점", "O", "O", "O"));
    }
}
