package com.example.repository;

import com.example.model.Song;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import javax.transaction.Transactional;

@Transactional
public interface ISongRepository extends JpaRepository<Song,Integer> {

    @Modifying
    @Query(value = "update Song set kind_of_music=:kindOfMusic, name_singer=:nameSinger, name_song=:nameSong where id=:id",nativeQuery = true)
    void createSong(@Param("kindOfMusic") String kindOfMusic, @Param("nameSinger") String nameSinger, @Param("nameSong") String nameSong, @Param("id") int id);

    @Query(value = "select * from Song where id=:id", nativeQuery = true)
    Song findById(@Param("id") int id);
}
