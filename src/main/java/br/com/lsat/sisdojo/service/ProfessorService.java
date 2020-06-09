package br.com.lsat.sisdojo.service;

import br.com.lsat.sisdojo.entity.Professor;
import br.com.lsat.sisdojo.repository.ProfessorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProfessorService {

    @Autowired
    ProfessorRepository professorRepository;

    public List<Professor> findAllProfessores(){
        return  this.professorRepository.findAll();
    }

    public Professor findProfessorByCpf(String cpf){
        return  this.professorRepository.findByCpf(cpf);
    }

    public void saveProfessor(Professor professor){
        this.professorRepository.save(professor);
    }
}
