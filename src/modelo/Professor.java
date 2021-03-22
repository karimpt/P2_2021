package modelo;

import java.util.LinkedList;

public class Professor {
    private String nome;
    private long numero;
    private LinkedList<Aula> aulas;

    //construtor: aloca memoria com atributos, e inicializa nome
    public Professor(String nome, long numero){
        this(nome, numero, new LinkedList<Aula>());
    }

    public Professor(String nome, long numero, LinkedList<Aula> aulas){
        this.nome = nome;
        this.numero = numero;
        this.aulas = new LinkedList<Aula>();
    }

    public String getNome(){
        return this.nome;
    }

    public long getNumero(){
        return this.numero;
    }

    public void setNumero(long numero){
        this.numero=numero;
    }

    public void adicionar(Aula aula){
        if (!this.aulas.contains(aula)) {
            this.aulas.add(aula);
        }
    }

    public void remover(Aula aula){
        if (this.aulas.contains(aula)) {
            this.aulas.remove(aula);
        }
    }

    public void preencherSumario(Aula aula){
        if (!aulas.contains(aula)){
            return;
        }
        aula.adicionarLinhaSumario(aula.getNome());
        aula.adicionarLinhaSumario(String.valueOf(aula.getNumero()));
        aula.adicionarLinhaSumario(nome);
        for (Aluno aluno : aula.getAlunos()){
            aluno.preencherSumario(aula);
        }
    }

}
