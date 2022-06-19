package com.jaejae.cafe_jaerim;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.content.Context;

import androidx.annotation.NonNull;

import java.util.ArrayList;

public class StudyCafeAdapter extends ArrayAdapter<StudyCafeData> {
    private Context context;
    private int resource;

    public StudyCafeAdapter(@NonNull Context context, int resource, @NonNull ArrayList<StudyCafeData> objects) {
        super(context, resource, objects);
        this.context = context;
        this.resource = resource;
    }

    @NonNull
    @Override
    public View getView(int position, @NonNull View convertView, @NonNull ViewGroup parent) {
        
    }
}
