package org.example.service;

import org.example.entity.one_to_one.Capital;
import org.example.entity.one_to_one.Country;

import java.util.List;

/**
 * @author kurstan
 * @created at 26.01.2023 15:09
 */
public interface CountryService {

    String saveCountry(Country country);
    List<Country> getCountries();
    String deleteCountryById(Long id);
    Country update(Long id, Capital capital);
}
