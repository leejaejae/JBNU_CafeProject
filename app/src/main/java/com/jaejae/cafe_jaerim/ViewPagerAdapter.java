package com.jaejae.cafe_jaerim;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

public class ViewPagerAdapter extends FragmentPagerAdapter {
//    class MyViewPagerAdapter(manager: FragmentManager) : FragmentPagerAdapter(manager, FragmentPagerAdapter.BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT)

    public ViewPagerAdapter(@NonNull FragmentManager fm) {
        super(fm);
    }

    // 프래그먼트를 교체를 보여주는 처리를 구현한 곳
    @NonNull
    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0:
                return com.jaejae.cafe_jaerim.EdiyaFirst1.newinstance();
            case 1:
                return com.jaejae.cafe_jaerim.EdiyaFirst2.newinstance();
            case 2:
                return com.jaejae.cafe_jaerim.EdiyaFirst3.newinstance();
            default:
                return null;
        }
    }

    @Override
    public int getCount() {
        return 3;
    }


}
