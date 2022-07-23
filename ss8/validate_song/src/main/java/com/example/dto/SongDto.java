package com.example.dto;

import javax.validation.constraints.Max;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

public class SongDto {

    @NotEmpty(message = "Here is Empty!")
    @Size(max = 800)
    @Pattern(regexp = "^[a-zA-Z\\s\\d\\p{L}]+$",message = "Wrong format")
    private String nameSong;

    @NotEmpty(message = "Here is Empty!")
    @Size(max = 300)
    @Pattern(regexp = "^[a-zA-Z\\s\\d\\p{L}]+$",message = "Wrong format")
    private String nameSinger;

    @NotEmpty(message = "Here is Empty!")
    @Size(max = 1000)
    @Pattern(regexp = "^[a-zA-Z,\\s\\d\\p{L}]+$", message = "Wrong format")
    private String kindOfMusic;

    public SongDto() {
    }

    public SongDto(String nameSong, String nameSinger, String kindOfMusic) {
        this.nameSong = nameSong;
        this.nameSinger = nameSinger;
        this.kindOfMusic = kindOfMusic;
    }

    public String getNameSong() {
        return nameSong;
    }

    public void setNameSong(String nameSong) {
        this.nameSong = nameSong;
    }

    public String getNameSinger() {
        return nameSinger;
    }

    public void setNameSinger(String nameSinger) {
        this.nameSinger = nameSinger;
    }

    public String getKindOfMusic() {
        return kindOfMusic;
    }

    public void setKindOfMusic(String kindOfMusic) {
        this.kindOfMusic = kindOfMusic;
    }
}
