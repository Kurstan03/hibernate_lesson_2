package org.example.service;

import org.example.entity.one_to_one.Capital;
import org.example.entity.one_to_one.Country;
import org.example.repository.CountryRepository;
import org.example.repository.CountryRepositoryImpl;

import java.util.List;

/**
 * @author kurstan
 * @created at 26.01.2023 15:10
 */
public class CountryServiceImpl implements CountryService{
    CountryRepository repository = new CountryRepositoryImpl();
    @Override
    public String saveCountry(Country country) {
         repository.saveCountry(country);
         return country.getName() + " saved!";
    }

    @Override
    public List<Country> getCountries() {
        return repository.getCountries();
    }

    @Override
    public String deleteCountryById(Long id) {
        repository.deleteCountryById(id);
        return "deleted!";
    }

    @Override
    public Country update(Long id, Capital capital) {
        return repository.update(id, capital);
    }
}
