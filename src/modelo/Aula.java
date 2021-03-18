package modelo;

import java.util.LinkedList;

public class Aula {
    private String nome;
    private long numero;
    private String sumario;
    private Professor professor;
    private LinkedList<Aluno> alunos;

    public Aula(String nome, long numero){
        this.nome=nome;
        this.numero=numero;
        this.professor = null;
        this.sumario = "";
        this.alunos = new LinkedList<>();
    }

    public void atribuirProfessor(Professor professor){
        this.professor=professor;
    }

    public void adicionaAluno(Aluno aluno){
        this.alunos.add(aluno);
    }

    public void adicionaLinhaSumario(String sumario){
        this.sumario=sumario;
    }

}
