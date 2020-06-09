package br.com.lsat.sisdojo.entity;

import javax.persistence.*;
import java.util.Date;

@Entity
public class Turma {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    Long id;

    private String nome;
    private String diasDaSemana;
    private String horario;
    @OneToOne
    private Professor professor;

    public Turma(String nome, String diasDaSemana, String horario, Professor professor) {
        this.nome = nome;
        this.diasDaSemana = diasDaSemana;
        this.horario = horario;
        this.professor = professor;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDiasDaSemana() {
        return diasDaSemana;
    }

    public void setDiasDaSemana(String diasDaSemana) {
        this.diasDaSemana = diasDaSemana;
    }

    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }

    public Professor getProfessor() {
        return professor;
    }

    public void setProfessor(Professor professor) {
        this.professor = professor;
    }
}
