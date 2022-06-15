package com.jaejae.cafe_jaerim;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class EdiyaFirst1 extends Fragment {
    private View view;

    public static EdiyaFirst1 newinstance() {
        EdiyaFirst1 ediyaFirst1 = new EdiyaFirst1(); // 어뎁터에 맞춰 주기적으로 인스턴스 생성
        return ediyaFirst1;
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.activity_ediya_page2, container, false);

        return view;
    }
}
