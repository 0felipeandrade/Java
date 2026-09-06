
import java.util.Map;
import java.util.HashMap;

import java.util.Scanner;

public class Matricula{

    Scanner leitor = new Scanner(System.in);

    Aluno alunoProcurado;
    String cursando;

    Map<String,Double> disciplinasENotas;
    String flagDisciplina = null;
    Double flagNota = 0.0;
    //Gostaria de criar uma lista com uma chave que aponta para uma informação. Neste caso seria uma lista de lista em que a chave é o nome da Materia e aponta para a nota do aluno;
    // ex.: Algoritmos --> 23 Estrutura de Dados--> 20
    // para isso a IA me recomendou criar um HashMap presente no Java;


    public Matricula(String cursando, Aluno alunoProcurado){

        this.cursando = cursando;
        this.alunoProcurado = alunoProcurado;
        disciplinasENotas = new HashMap<>();


    }

    //public void cadastraDisciplinaENotas(){
    //}

    public void setNotas(){

        System.out.println("Digite a materia e a Nota que deseja cadastrar: DIGITE 'SAIR' para encerrar");

        while(true){

            System.out.print("Materia: ");
            flagDisciplina = leitor.nextLine();

            if(flagDisciplina.equals("SAIR")){

                break;
            }

            System.out.print("Nota: ");
            flagNota = leitor.nextDouble();
            leitor.nextLine();

            this.disciplinasENotas.put(flagDisciplina,flagNota);

        }
        System.out.println("Disciplinas e notas cadastradas");


    }


    public Double calculaTotal(){

        double total = 0.0;

        for(Double nota : this.disciplinasENotas.values()){

            total += nota;

        }

        return total;
        
    }


}
