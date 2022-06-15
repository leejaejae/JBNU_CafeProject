package com.jaejae.cafe_jaerim;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager2.adapter.FragmentStateAdapter;

public class EdiyaFirst extends AppCompatActivity {

    private FragmentStateAdapter fragmentPagerAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ediya_page1);

        // 뷰페이저 세팅
//        ViewPager viewPager = findViewById(R.id.viewPager);
//        fragmentPagerAdapter = new ViewPagerAdapter(getSupportFragmentManager());
//
//        viewPager.setAdapter(fragmentPagerAdapter);
//    }
    }
}
