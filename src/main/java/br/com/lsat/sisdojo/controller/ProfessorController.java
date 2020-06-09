package br.com.lsat.sisdojo.controller;

import br.com.lsat.sisdojo.service.ProfessorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ProfessorController {

    @Autowired
    private ProfessorService professorService;

    @RequestMapping("/professorList")
    public String getProfessor(Model model){
        model.addAttribute("professorList", this.professorService.findAllProfessores());
        return "professorList";
    }
}
