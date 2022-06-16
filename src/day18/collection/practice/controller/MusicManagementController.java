package day18.collection.practice.controller;

import day18.collection.practice.model.vo.Artist;

import java.util.*;

public class MusicManagementController {

    private final Map<String, Artist> artistMap;

    public MusicManagementController() {
        artistMap = new HashMap<>();
        List<String> songs = new ArrayList<>(
                Arrays.asList("Hug", "Rising Sun")
        );
        artistMap.put("동방신기", new Artist("동방신기", songs));
    }

    
    // 메서드
    // 등록된 가수가 몇 명인지 알려주는 메서드
    public int existArtistNum() {
        return artistMap.size();
    }
    
    // 가수 등록을 해주는 메서드
    public int insertSong(String name, String song) {
        if (artistMap.containsKey(name)) { // 이미 등록된 적이 있는 가수면
            if (artistMap.get(name).getSongs().contains(song)) { // 해당 노래가 이미 추가된 적이 있는지도 봐줘야 함.
                return 2;
            }
            else { // 처음 추가하는 노래라면
                artistMap.get(name).getSongs().add(song);
                return 1;
            }

        } else { // 등록된 적이 없는 가수면
            List<String> songs = new ArrayList<>();
            songs.add(song);
            artistMap.put(name, new Artist(name, songs));
            return 3;
        }
    }


    // 노래 정보를 검색하는 메서드
    public List<String> searchSong(String name) {
        if (artistMap.containsKey(name)) { // 검색하려는 가수가 정보에 있는 경우
            List<String> songs = artistMap.get(name).getSongs();
            return songs;
        } else { // 검색하려는 가수가 등록된 적 없는 가수일 경우.
            return null;
        }
    }


} // end class
