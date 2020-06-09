package br.com.lsat.sisdojo.service;

import br.com.lsat.sisdojo.entity.Professor;
import br.com.lsat.sisdojo.repository.ProfessorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProfessorService {

    @Autowired
    ProfessorRepository professorRepository;

    public List<Professor> findAll(){
        return  this.professorRepository.findAll();
    }

    public void saveProfessor(Professor professor){
        this.professorRepository.save(professor);
    }
}
