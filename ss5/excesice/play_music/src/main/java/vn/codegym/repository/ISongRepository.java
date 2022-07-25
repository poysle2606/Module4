package vn.codegym.repository;

import vn.codegym.model.Song;

import java.util.List;

public interface ISongRepository {
    List<Song> findAll();

    void create(Song song);

    void update(Integer id,Song song);

    Song findById(Integer id);

    void delete(Integer id);
}
