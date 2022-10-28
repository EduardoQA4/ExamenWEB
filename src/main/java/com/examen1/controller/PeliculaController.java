/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.examen1.controller;
import com.examen1.entity.Sala;
import com.examen1.entity.Pelicula;
import com.examen1.service.ISalaService;
import com.examen1.service.IPeliculaService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
/**
 *
 * @author Mauricio
 */
@Controller
public class PeliculaController {
    @Autowired
    private IPeliculaService peliculaService;

    @Autowired
    private ISalaService salaService;
    
    @GetMapping("/peliculas")
    public String index(Model model) {
        List<Pelicula> listaPeliculas = peliculaService.getAllPelicula();
        model.addAttribute("titulo", "Tabla Personas");
        model.addAttribute("personas", listaPeliculas);
        return "personas";
    }
    
    @GetMapping("/peliculaN")
    public String crearPelicula(Model model) {
        List<Sala> listaPaises = salaService.listSala();
        model.addAttribute("persona", new Pelicula());
        model.addAttribute("paises", listaPaises);
        return "crear";
    }
    
    @PostMapping("/save")
    public String guardarPersona(@ModelAttribute Pelicula pelicula) {
        peliculaService.savePelicula(pelicula);
        return "redirect:/persona";
    }
    
    @GetMapping("/editPelicula/{id}")
    public String editarPelicula(@PathVariable("id") Long idPelicula, Model model) {
        Pelicula pelicula = peliculaService.getPeliculaById(idPelicula);
        List<Sala> listaSalas = salaService.listSala();
        model.addAttribute("pelicula", pelicula);
        model.addAttribute("salas", listaSalas);
        return "crear";
    }
    
    @GetMapping("/delete/{id}")
    public String eliminarPelicula(@PathVariable("id") Long idPersona) {
        peliculaService.delete(idPersona);
        return "redirect:/persona";
    }
}
