package org.example.service;

import org.example.entity.one_to_one.Capital;
import org.example.repository.CapitalRepository;
import org.example.repository.CapitalRepositoryImpl;

/**
 * @author kurstan
 * @created at 26.01.2023 15:23
 */
public class CapitalServiceImpl implements CapitalService{
    CapitalRepository capitalRepository = new CapitalRepositoryImpl();
    @Override
    public String saveCapital(Capital capital) {
        capitalRepository.saveCapital(capital);
        return capital.getName() + " saved!";
    }

    @Override
    public String deleteCapitalById(Long id) {
        capitalRepository.deleteCapitalById(id);
        return "capital by id - " + id + "removed!";
    }
}
