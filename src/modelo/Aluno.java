package modelo;

import java.util.LinkedList;

public class Aluno {
    private String nome;
    private long numero;
    private LinkedList<Aula> aulas;

    //construtor
    public Aluno(String nome, long numero ){
        this.nome=nome;
        this.numero=numero;
        this.aulas = new LinkedList<>();
    }

    //assina sumario
    public void preencheSumario(Aula aula){
        aula.adicionaAluno(this);
    }

    //
    public void adicionaAula(Aula aula){
        this.aulas.add(aula);
    }

}
