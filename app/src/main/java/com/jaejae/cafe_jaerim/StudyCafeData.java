package com.jaejae.cafe_jaerim;

import android.view.View;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

public class StudyCafeData extends AppCompatActivity {

    private String profile;
    private String name;
    private String operating_hours;
    private String wifi;
    private String socket;
    private String bathroom;

    public StudyCafeData(){}

    public String getProfile() { return profile; }

    public void setProfile(String profile) { this.profile = profile; }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getOperating_hours() {
        return operating_hours;
    }

    public void setOperating_hours(String operating_hours) {
        this.operating_hours = operating_hours;
    }

    public String getWifi() {
        return wifi;
    }

    public void setWifi(String wifi) {
        this.wifi = wifi;
    }

    public String getSocket() {
        return socket;
    }

    public void setSocket(String socket) {
        this.socket = socket;
    }

    public String getBathroom() {
        return bathroom;
    }

    public void setBathroom(String bathroom) {
        this.bathroom = bathroom;
    }

    public class StudyCafeDataViewHolder extends RecyclerView.ViewHolder {
        public StudyCafeDataViewHolder(@NonNull View itemView) { // 이 두줄 지워야하나
            super(itemView);
        }
    }
}
