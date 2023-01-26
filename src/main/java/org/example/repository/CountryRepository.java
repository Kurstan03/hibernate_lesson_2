package org.example.repository;

import org.example.entity.one_to_one.Capital;
import org.example.entity.one_to_one.Country;

import java.util.List;

/**
 * @author kurstan
 * @created at 26.01.2023 15:05
 */
public interface CountryRepository {

    void saveCountry(Country country);
    List<Country> getCountries();
    void deleteCountryById(Long id);
    Country update(Long id, Capital capital);
}
