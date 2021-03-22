package modelo;

import java.util.LinkedList;

public class Aula {
    private String nome;
    private long numero;
    private String sumario;
    private Professor professor;
    private LinkedList<Aluno> alunos;

    public Aula(String nome, long numero){
        this(nome, numero, null, new LinkedList<>());
        //this.nome=nome;
        //this.numero=numero;
        //this.professor = null;
        //this.sumario = new StringBuilder();
        //this.alunos = new LinkedList<>();
    }

    public Aula(String nome, long numero, Professor professor, LinkedList<Aluno> alunos){
        this.nome=nome;
        this.numero=numero;
        this.sumario = "";
        this.setProfessor(professor);
        this.alunos = new LinkedList<>();
        //testar se a lista é null
        if(alunos!=null){
            for (Aluno aluno : alunos){
                //fazer

            }
        }
        this.alunos = new LinkedList<>();
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

    public String getSumario(){
        return this.sumario;
    }
    public Professor getProfessor(){
        return this.professor;
    }

    public void setProfessor(Professor professor){
        this.professor=professor;
    }

    public void adicionarAluno(Aluno aluno){
        this.alunos.add(aluno);
    }

    public void desassociarProfessor(Professor professor){
        if(this.professor.equals(professor)) {
            this.professor = null;
        }
    }

    public LinkedList<Aluno> getAlunos(){
        return new LinkedList<Aluno>(this.alunos);
    }

    public void removerAluno(Aluno aluno){
        if (this.alunos.contains(aluno)){
            this.alunos.remove(aluno);
        }
    }


    //o strong builder é mais eficiente do que a concatenação que cria vários objetos adicionais
    public void adicionarLinhaSumario(String linha){
        StringBuilder sb = new StringBuilder(sumario);
        sb.append(linha).append("/n");
        this.sumario=sb.toString();
    }


}
