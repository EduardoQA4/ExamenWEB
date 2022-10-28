/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.examen1.service;
import com.examen1.entity.Sala;
import com.examen1.repository.SalaRepository;
import java.util.List;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
/**
 *
 * @author Mauricio
 */
public class SalaService implements ISalaService {
    @Autowired
    private SalaRepository salaRepository;

    @Override
    public List<Sala> listSala() {
        return (List<Sala>)salaRepository.findAll();  }  
}
