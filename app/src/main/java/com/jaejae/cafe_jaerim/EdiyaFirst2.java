package com.jaejae.cafe_jaerim;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class EdiyaFirst2 extends Fragment {
    private View view;

    public static EdiyaFirst2 newinstance() {
        EdiyaFirst2 ediyaFirst2 = new EdiyaFirst2(); // 어뎁터에 맞춰 주기적으로 인스턴스 생성
        return ediyaFirst2;
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.activity_ediya_page3, container, false);

        return view;
    }
}
