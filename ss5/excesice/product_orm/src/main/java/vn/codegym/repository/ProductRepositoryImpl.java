package vn.codegym.repository;

import org.springframework.stereotype.Repository;
import vn.codegym.model.Product;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.transaction.Transactional;
import java.util.List;

@Repository
@Transactional
public class ProductRepositoryImpl implements IProductRepository {

    @PersistenceContext
    EntityManager entityManager;

    @Override
    public List<Product> findAll() {
        TypedQuery<Product> query = entityManager.createQuery("select m from Product as m", Product.class);
        return query.getResultList();
    }

    @Override
    public void create(Product product) {
        entityManager.persist(product);
    }

    @Override
    public void edit(Product product, Integer id) {
        entityManager.merge(product);
    }

    @Override
    public void delete(Integer id) {
        Product product = findById(id);
        entityManager.remove(product);
    }

    @Override
    public Product findById(Integer id) {
        return entityManager.createQuery("select m from Product m where m.id=:id", Product.class).
                setParameter("id",id).getSingleResult();
    }

    @Override
    public List<Product> findName(String name) {

        return null;
    }
}
