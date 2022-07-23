package com.example.service;

import com.example.model.Song;
import com.example.repository.ISongRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SongServiceImpl implements ISongService{

    @Autowired
    ISongRepository iSongRepository;

    @Override
    public List<Song> findAll() {
        return iSongRepository.findAll();
    }

    @Override
    public void create(Song song) {
        iSongRepository.save(song);
    }

    @Override
    public void edit(Song song) {
        iSongRepository.createSong(song.getKindOfMusic(), song.getNameSinger(), song.getNameSong(), song.getId());
    }

    @Override
    public Song findById(int id) {
        return iSongRepository.findById(id);
    }
}
