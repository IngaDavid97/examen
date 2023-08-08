package com.inga.examen.service;

import com.inga.examen.models.Profesor;
import com.inga.examen.repository.ProfesorRepository;

import org.springframework.beans.factory.annotation.Autowired;


import org.springframework.stereotype.Service;
import java.util.List;


@Service
public class ProfesorServiceImpl implements ProfesorService{
	@Autowired
    private ProfesorRepository usuariosRepository;

   

 

    @Override
    public List<Profesor> findByAll() {
        return usuariosRepository.findAll();
    }

    @Override
    public Profesor save(Profesor usuarios) {
        return usuariosRepository.save(usuarios);
    }

   

    @Override
    public Profesor findById(Integer id) {
        return usuariosRepository.findById(id).orElse(null);
    }

    @Override
    public void delete(Integer id) {
        usuariosRepository.deleteById(id);
    }

   
    
}
