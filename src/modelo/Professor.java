package modelo;

import java.util.LinkedList;

public class Professor {
    private String nome;
    private long numero;
    private LinkedList<Aula> aulas;

    //construtor: aloca memoria com atributos, e inicializa nome
    public Professor(String nome, long numero){
        this.nome = nome;
        this.numero = numero;
        this.aulas = new LinkedList<Aula>();
    }

    public void preencherSumario(Aula aula, String sumario){
        aula.adicionaLinhaSumario(sumario);
    }

    public void adicionar(Aula aula){
        this.aulas.add(aula);
    }

}
