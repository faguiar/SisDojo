package br.com.lsat.sisdojo.repository;

import br.com.lsat.sisdojo.entity.Professor;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProfessorRepository extends JpaRepository<Professor, Long> {


}
