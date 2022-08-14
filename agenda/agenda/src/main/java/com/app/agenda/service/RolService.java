package com.app.agenda.service;

import com.app.agenda.entity.Rol;
import com.app.agenda.repository.RolRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/rol")
@CrossOrigin
public class RolService {

    @Autowired
    RolRepository rolRepository;

    @GetMapping( path = "/buscar" )
    public List<Rol> getAllRol(){
        return rolRepository.findAll();
    }

    @PostMapping( path = "/guardar" )
    public Rol saveRol(@RequestBody Rol rol){
        return rolRepository.save(rol);
    }
}
