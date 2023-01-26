package org.example.repository;

import org.example.entity.one_to_one.Capital;

/**
 * @author kurstan
 * @created at 26.01.2023 15:16
 */
public interface CapitalRepository {
    void saveCapital(Capital capital);
    void deleteCapitalById(Long id);


}
