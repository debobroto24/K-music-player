package com.example.kmusicplayer.javares;

public class MusicFileModel {
    public void setName(String name) {
        this.name = name;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    private String name, artist;

    public String getName() {
        return name;
    }

    public String getArtist() {
        return artist;
    }

    public MusicFileModel(String name, String artist) {
        this.name = name;
        this.artist = artist;
    }
}
