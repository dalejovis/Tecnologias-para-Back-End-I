package com.alunoonline.api.backend.services;

import com.alunoonline.api.backend.models.Aluno;
import com.alunoonline.api.backend.repositories.AlunoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AlunoService {

        @Autowired
        AlunoRepository repository;

        public Aluno create(Aluno aluno) {
                return repository.save(aluno);
        }
}
