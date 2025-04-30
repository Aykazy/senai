package com.escola.senai.model.Interface;

import com.escola.senai.model.Aluno;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AlunoRepository extends JpaRepository<Aluno, Long> {

}
