package br.com.lsat.sisdojo.config;

import br.com.lsat.sisdojo.entity.Professor;
import br.com.lsat.sisdojo.service.ProfessorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class ConfigInicial implements ApplicationListener<ContextRefreshedEvent> {

    @Autowired
    ProfessorService professorService;

    @Override
    public void onApplicationEvent(ContextRefreshedEvent event){

        List<Professor> professorList = professorService.findAll();

        if (professorList.isEmpty()){
            createProfessor("Takeshi Miura", "9 dan");
            createProfessor("Patrick Silva", "1 dan");
        }
    }

    private void createProfessor(String nome, String graduacao){
        Professor professor = new Professor(nome, graduacao);

        professorService.saveProfessor(professor);
    }
}
