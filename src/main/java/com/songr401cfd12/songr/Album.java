package com.songr401cfd12.songr;

public class Album {
    private String title;
    private String artist;
    private int songCount;
    private int length;
    private String imageUrl;
    private String imageLocal;


    public Album() {
    }

    public Album(String title, String artist) {
        this.title = title;
        this.artist = artist;
    }

    public Album(String title, String artist, int songCount, int length, String imageUrl) {
        this.title = title;
        this.artist = artist;
        this.songCount = songCount;
        this.length = length;
        this.imageUrl = imageUrl;
    }

    public Album(String title, String artist, int songCount, int length, String imageUrl, String imageLocal) {
        this.title = title;
        this.artist = artist;
        this.songCount = songCount;
        this.length = length;
        this.imageUrl = imageUrl;
        this.imageLocal = imageLocal;
    }

    public String getTitle() {
        return title;
    }

    public String getArtist() {
        return artist;
    }

    public int getSongCount() {
        return songCount;
    }

    public double getLength() {
        return length;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public String getImageLocal() {
        return imageLocal;
    }
}
