package org.example.service;

import org.example.entity.one_to_one.Capital;

/**
 * @author kurstan
 * @created at 26.01.2023 15:22
 */
public interface CapitalService {
    String saveCapital(Capital capital);
    String deleteCapitalById(Long id);
}
