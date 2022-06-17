package com.jaejae.cafe_jaerim;

import androidx.appcompat.app.AppCompatActivity;

public class StudyCafeData extends AppCompatActivity {
    private String name;
    private String tel;
    private String address;
    private String operating_hours;
    private String wifi;
    private String num_socket;
    private String num_seat;
    private String bathroom;

    public StudyCafeData(){}

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
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

    public String getNum_socket() {
        return num_socket;
    }

    public void setNum_socket(String num_socket) {
        this.num_socket = num_socket;
    }

    public String getNum_seat() {
        return num_seat;
    }

    public void setNum_seat(String num_seat) {
        this.num_seat = num_seat;
    }

    public String getBathroom() {
        return bathroom;
    }

    public void setBathroom(String bathroom) {
        this.bathroom = bathroom;
    }
}
