package vn.codegym.repository;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.stereotype.Repository;
import vn.codegym.model.Song;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.transaction.Transactional;
import java.util.List;

@Transactional
@Repository
public class SongRepositoryImpl implements ISongRepository {

    @PersistenceContext
    EntityManager entityManager;

    @Override
    public List<Song> findAll() {
        TypedQuery<Song> query = entityManager.createQuery("select m from Song as m", Song.class);
        return query.getResultList();
    }

    @Override
    @Modifying
    public void create(Song song) {
        entityManager.persist(song);
    }

    @Override
    public void update(Integer id, Song song) {
        entityManager.merge(song);
    }

    @Override
    public Song findById(Integer id) {
        return entityManager.createQuery("select m from Song m where m.id=:id", Song.class).
                setParameter("id", id).getSingleResult();

    }

    @Override
    public void delete(Integer id) {
        Song song = findById(id);
        entityManager.remove(song);
    }
}
