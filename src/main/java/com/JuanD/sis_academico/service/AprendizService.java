package com.JuanD.sis_academico.service;

import com.JuanD.sis_academico.model.Aprendiz;
import com.JuanD.sis_academico.repository.AprendizRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AprendizService {

    @Autowired
    private AprendizRepository repository;

    public List<Aprendiz> listarTodos() {
        return repository.findAll();
    }

    public Optional<Aprendiz> buscarPorId(Long id) {
        return repository.findById(id);
    }

    public Aprendiz guardar(Aprendiz aprendiz) {
        return repository.save(aprendiz);
    }

    public void eliminar(Long id) {
        repository.deleteById(id);
    }
}
