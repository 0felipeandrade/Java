// Exercício 01 - Lista Programação Modular. Prof. Mateus Viana

import java.util.Scanner;


public class Main {
    
    public static void main(String args[]){

        Scanner leitor = new Scanner(System.in);

        int parteReal1,parteImaginaria1;
        int parteReal2,parteImaginaria2;

        parteReal1 = leitor.nextInt();
        parteImaginaria1 = leitor.nextInt();

        parteReal2 = leitor.nextInt();
        parteImaginaria2 = leitor.nextInt();



        NumeroComplexo criaClasse = new NumeroComplexo(parteReal1,parteImaginaria1,parteReal2,parteImaginaria2);

        criaClasse.ImprimeResultado();

        leitor.close();
    }
}
