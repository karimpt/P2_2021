import modelo.Aluno;
import modelo.Aula;
import modelo.Professor;

public class Main {

    public Main(){
        Professor professor1 = new Professor("Marco Ferreira",1579 );
        Professor professor2 = new Professor("António Carlos Urbano",123243534312334l ); // pode usar-se 123122312334l
        Aluno aluno1 = new Aluno("toni",123123);
        Aluno aluno2 = new Aluno("toino", 213123);

        Aula aula1 = new Aula("prog2", 1);
        Aula aula2 = new Aula("prog3", 2);
        Aula aula3 = new Aula("prog4", 2);
        Aula aula4 = new Aula("prog5", 2);


    }

    public static void main(String[] args){
        new Main(); //construtor por omissão
    }



}
