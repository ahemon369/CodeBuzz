package com.amranemon.collageproject;

public class NewsModel {
    String title;
    int imageResId; // Local resource image id

    public NewsModel(String title, int imageResId) {
        this.title = title;
        this.imageResId = imageResId;
    }

    public String getTitle() { return title; }
    public int getImageResId() { return imageResId; }
}

