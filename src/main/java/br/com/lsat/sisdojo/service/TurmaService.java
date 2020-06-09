package br.com.lsat.sisdojo.service;

import br.com.lsat.sisdojo.entity.Turma;
import br.com.lsat.sisdojo.repository.TurmaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TurmaService {

    @Autowired
    private TurmaRepository turmaRepository;

    public void saveTurma(Turma turma){
        this.turmaRepository.save(turma);
    }
}
