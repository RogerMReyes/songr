package com.songr401cfd12.songr.models;

import javax.persistence.*;
import java.util.List;

@Entity
public class Album {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    long id;
    private String title;
    private String artist;
    private int songCount;
    private int length;
    private String imageUrl;
    private String imageLocal;

    @OneToMany(mappedBy = "album")
    List<Song> songsInAlbum;


    public Album() {
    }

    public Album(String title, String artist, int songCount, int length, String imageUrl, String imageLocal) {
        this.title = title;
        this.artist = artist;
        this.songCount = songCount;
        this.length = length;
        this.imageUrl = imageUrl;
        this.imageLocal = imageLocal;
    }

    public long getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getArtist() {
        return artist;
    }

    public Integer getSongCount() {
        return songCount;
    }

    public Integer getLength() {
        return length;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public String getImageLocal() {
        return imageLocal;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public void setSongCount(int songCount) {
        this.songCount = songCount;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public void setImageLocal(String imageLocal) {
        this.imageLocal = imageLocal;
    }

    public List<Song> getSongsInAlbum() {
        return songsInAlbum;
    }

    public void setSongsInAlbum(List<Song> songsInAlbum) {
        this.songsInAlbum = songsInAlbum;
    }
}
