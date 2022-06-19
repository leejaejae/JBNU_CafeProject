package com.jaejae.cafe_jaerim;

import android.media.Image;

public class StudyCafeData {
    int Image;
    String Name;
    String Seat;
    String Socket;
    String Restroom;

    public int getImage() {
        return Image;
    }

    public void setImage(int image) {
        Image = image;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getSeat() {
        return Seat;
    }

    public void setSeat(String seat) {
        Seat = seat;
    }

    public String getSocket() {
        return Socket;
    }

    public void setSocket(String socket) {
        Socket = socket;
    }

    public String getRestroom() {
        return Restroom;
    }

    public void setRestroom(String restroom) {
        Restroom = restroom;
    }

    public StudyCafeData(int image, String name, String seat, String socket, String restroom) {
        Image = image;
        Name = name;
        Seat = seat;
        Socket = socket;
        Restroom = restroom;
    }
}
