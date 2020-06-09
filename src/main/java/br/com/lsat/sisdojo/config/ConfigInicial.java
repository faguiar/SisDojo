package br.com.lsat.sisdojo.config;

import br.com.lsat.sisdojo.entity.Professor;
import br.com.lsat.sisdojo.entity.Turma;
import br.com.lsat.sisdojo.service.ProfessorService;
import br.com.lsat.sisdojo.service.TurmaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;

import java.util.Date;
import java.util.List;

@Component
public class ConfigInicial implements ApplicationListener<ContextRefreshedEvent> {

    @Autowired
    ProfessorService professorService;
    @Autowired
    TurmaService turmaService;

    @Override
    public void onApplicationEvent(ContextRefreshedEvent event){

        List<Professor> professorList = professorService.findAllProfessores();

        if (professorList.isEmpty()){

            createProfessor("111.111.111-11","Takeshi Miura","9 Dan","00001",
                    "takeshi@miura","9999-9999","8888-8888","Riacho Fundo","30/11/1943",
                    "Masculino");
            createProfessor("222.222.222-22","Patrick Silva","1 Dan","00002",
                    "patrick@miura","9999-9999","8888-8888","Agua Claras","26/09/1977",
                    "Masculino");
            Professor prof = professorService.findProfessorByCpf("111.111.111-11");
            createTurma("Turma 01","Seg - Qua - Sex", "07:00",prof);

        }
    }

    private void createProfessor(String cpf, String nome, String graduacao, String registroNaFederacao, String email, String telefone1,
                                 String telefone2, String endereco, String dataNascimento, String sexo){

        Professor professor = new Professor(nome, graduacao, graduacao,registroNaFederacao,email,telefone1,telefone2,endereco,
                dataNascimento,sexo);

        professorService.saveProfessor(professor);
    }
    private void createTurma(String nome, String diasDaSemana, String horario, Professor professor){
        Turma turma = new Turma(nome,diasDaSemana,horario,professor);
        turmaService.saveTurma(turma);
    }
}
