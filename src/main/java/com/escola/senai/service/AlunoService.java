package com.escola.senai.service;

import com.escola.senai.model.Interface.AlunoRepository;
import org.springframework.stereotype.Service;

@Service
public class AlunoService
{
    private final AlunoRepository repository;

    public AlunoService(AlunoRepository repository)
        this.repository = repository
}
