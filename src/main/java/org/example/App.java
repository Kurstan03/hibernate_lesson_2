package org.example;

import org.example.config.HibernateConfig;
import org.example.dao.Dao;
import org.example.entity.one_to_one.Capital;
import org.example.entity.one_to_one.Country;
import org.example.repository.CapitalRepository;
import org.example.repository.CapitalRepositoryImpl;
import org.example.service.CapitalService;
import org.example.service.CapitalServiceImpl;
import org.example.service.CountryService;
import org.example.service.CountryServiceImpl;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        CountryService service = new CountryServiceImpl();
        Country country = new Country("Kyrgyzstan", 199);
        Capital capital = new Capital("Bishkek", 1000000);
        Country country1 = new Country("Russia", 208442);
        Capital capital1 = new Capital("Moscow", 100000099);


        country.setCapital(capital);
        country1.setCapital(capital1);

//        System.out.println(service.saveCountry(country));
//        System.out.println(service.saveCountry(country1));

//        service.getCountries().forEach(System.out::println);
//        System.out.println(service.deleteCountryById(1L));
        CapitalService capitalService = new CapitalServiceImpl();
        System.out.println(capitalService.deleteCapitalById(1L));

//        System.out.println(service.update(2L, capital1));
    }
}
