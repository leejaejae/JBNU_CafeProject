package com.jaejae.cafe_jaerim;

import android.content.Context;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.Log;
import android.view.MotionEvent;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import android.widget.ListView;
import java.util.ArrayList;
import java.util.List;

public class SearchList extends AppCompatActivity {

    private List<String> list;          // 데이터를 넣은 리스트변수
    private ListView listView;          // 검색을 보여줄 리스트변수
    private EditText editSearch;        // 검색어를 입력할 Input 창
    private searchlistAdapter adapter;      // 리스트뷰에 연결할 아답터
    private ArrayList<String> arraylist;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_searchlist);

//        FirebaseFirestore database = FirebaseFirestore.getInstance();

        editSearch = findViewById(R.id.editSearch);
        listView = findViewById(R.id.listView);

        // 리스트를 생성한다.
        list = new ArrayList<>();

        // 검색에 사용할 데이터을 미리 저장한다. -> 이걸 디비에서 받아오면 되는거자네 ?
        settingList();
//        database.collection("cafe_list").get();
//                .addOnCompleteListener(new OnCompleteListener<QuerySnapshot>() {
//                    list.add()
//                    @Override
//                    public void onComplete(@NonNull Task<QuerySnapshot> task) {
//                        if (task.isSuccessful()) {
//                            for (QueryDocumentSnapshot document : task.getResult()) {
//                                Log.d(TAG, document.getId() + " => " + document.getData());
//                                String info = task.getResult();
//
//                            }
//                        } else {
//                            Log.w(TAG, "Error getting documents.", task.getException());
//                        }
//                    }
//                });
//        list.add(database.toString());
//        System.out.print(list);
        // 리스트의 모든 데이터를 arraylist에 복사한다.// list 복사본을 만든다.
        arraylist = new ArrayList<>();
        arraylist.addAll(list);

        // 리스트에 연동될 아답터를 생성한다.
        adapter = new searchlistAdapter(list, this);

        // 리스트뷰에 아답터를 연결한다.
        listView.setAdapter(adapter);

        // input창에 검색어를 입력시 "addTextChangedListener" 이벤트 리스너를 정의한다.
        editSearch.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {
            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void afterTextChanged(Editable editable) {
                // input창에 문자를 입력할때마다 호출된다.
                // search 메소드를 호출한다.
                String text = editSearch.getText().toString();
                search(text);
            }
        });
        list.clear();
    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        InputMethodManager inputmethod = (InputMethodManager) getSystemService(Context.INPUT_METHOD_SERVICE);
        inputmethod.hideSoftInputFromWindow(getCurrentFocus().getWindowToken(), 0);
        return true;
    }

    // 검색을 수행하는 메소드
    public void search(String charText) {

        // 문자 입력시마다 리스트를 지우고 새로 뿌려준다.
        list.clear();

        // 문자 입력이 없을때는 모든 데이터를 보여준다.
        if (charText.length() == 0) {
              list.addAll(arraylist);
        }
        // 문자 입력을 할때..
        else
        {
            // 리스트의 모든 데이터를 검색한다.
            for(int i = 0; i < arraylist.size() ; i++)
            {
                // arraylist의 모든 데이터에 입력받은 단어(charText)가 포함되어 있으면 true를 반환한다.
                if (arraylist.get(i).toLowerCase().contains(charText))
                {
                    // 검색된 데이터를 리스트에 추가한다.
                    list.add(arraylist.get(i));
                }
            }
        }
        // 리스트 데이터가 변경되었으므로 아답터를 갱신하여 검색된 데이터를 화면에 보여준다.
        adapter.notifyDataSetChanged();
    }


    // 검색에 사용될 데이터를 리스트에 추가한다.
    private void settingList() {
        list.add("우노의 정원");
        list.add("예쁜하루 전북대점");
        list.add("할리스 전북대 덕진광장점");
        list.add("모모의 다락방");
        list.add("인앤아웃");
        list.add("명륜");
        list.add("스타벅스 전북대점");
        list.add("인솔커피");
        list.add("드롭탑");
        list.add("투썸플레이스 전주전북대점");
        list.add("이디야커피 전북대구정문점");
        list.add("공차");
        list.add("텐퍼센트커피 전주전북대점");
        list.add("빽다방");
        list.add("커피디딤");
        list.add("포멀커피");
        list.add("노트릭");
        list.add("로이");
        list.add("고매드비");
        list.add("케이빈");
        list.add("토프레소");
        list.add("오늘과 오늘 사이");
        list.add("어느날의 오후");
        list.add("성근커피바");
        list.add("몽레브");
        list.add("카페구디");
        list.add("카페 프로바이더");
        list.add("카페 이프온리");
        list.add("작은곰자리");
        list.add("도란도란");
        list.add("할리스 전주백제대로점");
        list.add("Ivy586");
        list.add("2:in");
        list.add("팬도로시");
        list.add("파인땡큐");
        list.add("플레인빈커피");
        list.add("스위머");
        list.add("그남자네");
        list.add("네커피");
        list.add("이디야 커피 전북대점");
        list.add("메리엔다");
        list.add("스노잉 본점");
        list.add("알엘 커피");
    }
}

