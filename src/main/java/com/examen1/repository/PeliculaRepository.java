/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.examen1.repository;
import com.examen1.entity.Pelicula;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
/**
 *
 * @author Mauricio
 */
public interface PeliculaRepository extends CrudRepository<Pelicula,Long>{
    
}
