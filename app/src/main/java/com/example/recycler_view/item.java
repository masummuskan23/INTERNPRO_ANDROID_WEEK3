package com.example.recycler_view;

public class item {
    String song;
    String singer;
    int image;
    public item(String song,String singer,int image){
        this.image=image;
        this.song=song;
        this.singer=singer;
    }

    public int getImage() {
        return image;
    }

    public String getSinger() {
        return singer;
    }

    public String getSong() {
        return song;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public void setSinger(String singer) {
        this.singer = singer;
    }

    public void setSong(String song) {
        this.song = song;
    }
}
