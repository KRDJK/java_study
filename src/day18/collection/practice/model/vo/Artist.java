package day18.collection.practice.model.vo;

import java.util.List;

// 가수 클래스
public class Artist {
    private String name; // 가수명
    private List<String> songs; // 노래 목록


    public Artist(String name, List<String> songs) {
        this.name = name;
        this.songs = songs;
    }

    // 메서드

    @Override
    public String toString() {
        return "Artist{" +
                "name='" + name + '\'' +
                ", songs=" + songs +
                '}';
    }


    // getter / setter

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<String> getSongs() {
        return songs;
    }

    public void setSongs(List<String> songs) {
        this.songs = songs;
    }

    
} // end class
