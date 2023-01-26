package org.example.config;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import org.example.entity.many_to_many.Instructor;
import org.example.entity.many_to_many.Student;
import org.example.entity.one_to_many.Author;
import org.example.entity.one_to_many.Book;
import org.example.entity.one_to_one.Capital;
import org.example.entity.one_to_one.Country;
import org.hibernate.EntityNameResolver;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.cfg.Environment;

import java.util.Properties;

/**
 * @author kurstan
 * @created at 25.01.2023 11:47
 */
public class HibernateConfig {

    public static EntityManager getEntityManager() {
        Configuration configuration = new Configuration();
        configuration.setProperty(Environment.DRIVER, "org.postgresql.Driver");
        configuration.setProperty(Environment.URL, "jdbc:postgresql://localhost:5432/postgres");
        configuration.setProperty(Environment.USER, "postgres");
        configuration.setProperty(Environment.PASS, "postgres");
        configuration.setProperty(Environment.HBM2DDL_AUTO, "update");
        configuration.setProperty(Environment.DIALECT, "org.hibernate.dialect.PostgreSQL9Dialect");
        configuration.setProperty(Environment.SHOW_SQL, "true");
        configuration.addAnnotatedClass(Country.class);
        configuration.addAnnotatedClass(Capital.class);
        return configuration.buildSessionFactory().createEntityManager();

    }

}
