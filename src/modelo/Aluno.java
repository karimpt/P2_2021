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

    public String getNome(){
        return this.nome;
    }

    public long getNumero(){
        return this.numero;
    }

    //marca presença numa determinada aula
    public void preencherSumario(Aula aula){
        if (!aulas.contains(aula)){
            return;
        }
        aula.adicionarLinhaSumario(nome);
    }

    // adiciona uma aula a este aluno
    public void adicionaAula(Aula aula){
        this.aulas.add(aula);
    }

}
