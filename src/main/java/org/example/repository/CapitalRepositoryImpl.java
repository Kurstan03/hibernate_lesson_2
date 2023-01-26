package org.example.repository;

import jakarta.persistence.EntityManager;
import org.example.config.HibernateConfig;
import org.example.entity.one_to_one.Capital;

/**
 * @author kurstan
 * @created at 26.01.2023 15:18
 */
public class CapitalRepositoryImpl implements CapitalRepository{
     EntityManager entityManager = HibernateConfig.getEntityManager();
    @Override
    public void saveCapital(Capital capital) {
        entityManager.getTransaction().begin();
        entityManager.persist(capital);
        entityManager.getTransaction().commit();
        entityManager.close();
    }

    @Override
    public void deleteCapitalById(Long id) {
        entityManager.getTransaction().begin();
        Capital capital = entityManager.find(Capital.class, id);
        capital.getCountry().setCapital(null);
        entityManager.remove(capital);
        entityManager.getTransaction().commit();
        entityManager.close();
    }
}
