package com.JuanD.sis_academico.repository;

import com.JuanD.sis_academico.model.Aprendiz;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AprendizRepository extends JpaRepository<Aprendiz, Long> {
}
