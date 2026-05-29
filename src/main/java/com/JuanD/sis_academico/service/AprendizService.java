package com.JuanD.sis_academico.service;

import com.JuanD.sis_academico.dto.AprendizDTO;
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

    public List<AprendizDTO> listarTodos() {
        return repository.findAll()
                .stream()
                .map(this::convertirADTO)
                .toList();
    }

    public Optional<AprendizDTO> buscarPorId(Long id) {
        return repository.findById(id)
                .map(this::convertirADTO);
    }

    public Aprendiz guardar(AprendizDTO dto) {
        Aprendiz aprendiz = convertirAEntidad(dto);
        return repository.save(aprendiz);
    }

    public void eliminar(Long id) {
        repository.deleteById(id);
    }

    private AprendizDTO convertirADTO(Aprendiz aprendiz) {
        AprendizDTO dto = new AprendizDTO();
        dto.setId(aprendiz.getId());
        dto.setNombre(aprendiz.getNombre());
        dto.setCorreo(aprendiz.getCorreo());
        dto.setPrograma(aprendiz.getPrograma());
        dto.setFicha(aprendiz.getFicha());
        return dto;
    }

    private Aprendiz convertirAEntidad(AprendizDTO dto) {
        Aprendiz aprendiz = new Aprendiz();
        aprendiz.setId(dto.getId());
        aprendiz.setNombre(dto.getNombre());
        aprendiz.setCorreo(dto.getCorreo());
        aprendiz.setPrograma(dto.getPrograma());
        aprendiz.setFicha(dto.getFicha());
        return aprendiz;
    }
}