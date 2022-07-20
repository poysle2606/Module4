package vn.codegym.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import vn.codegym.model.Song;
import vn.codegym.repository.ISongRepository;

import java.util.List;

@Service
public class SongServiceImpl implements ISongService {

    @Autowired
    ISongRepository iSongRepository;

    @Override
    public List<Song> findAll() {
        return iSongRepository.findAll();
    }

    @Override
    public void create(Song song) {
        iSongRepository.create(song);
    }

    @Override
    public void update(Integer id,Song song) {
        iSongRepository.update(id,song);
    }

    @Override
    public Song findById(Integer id) {
        return iSongRepository.findById(id);
    }

    @Override
    public void delete(Integer id) {
        iSongRepository.delete(id);
    }
}
