package org.example.repository;

import jakarta.persistence.EntityManager;
import org.example.config.HibernateConfig;
import org.example.entity.one_to_one.Capital;
import org.example.entity.one_to_one.Country;

import java.util.List;

/**
 * @author kurstan
 * @created at 26.01.2023 15:06
 */
public class CountryRepositoryImpl implements CountryRepository{
    private final EntityManager entityManager = HibernateConfig.getEntityManager();
    @Override
    public void saveCountry(Country country) {
        entityManager.getTransaction().begin();
        entityManager.persist(country);
        entityManager.getTransaction().commit();
        entityManager.close();
    }

    @Override
    public List<Country> getCountries() {
        entityManager.getTransaction().begin();
        List<Country> countries = entityManager.createQuery("select c from Country c", Country.class).getResultList();
        entityManager.getTransaction().commit();
        entityManager.close();
        return countries;
    }

    @Override
    public void deleteCountryById(Long id) {
        entityManager.getTransaction().begin();
        Country country = entityManager.find(Country.class, id);
        entityManager.remove(country);
        entityManager.getTransaction().commit();
        entityManager.close();
    }

    @Override
    public Country update(Long id, Capital capital) {
        entityManager.getTransaction().begin();
        Country country = entityManager.find(Country.class, id);
        country.setCapital(capital);
        entityManager.merge(country);
        entityManager.getTransaction().commit();
        entityManager.close();
        return country;
    }
}
