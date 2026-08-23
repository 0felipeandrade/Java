import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        int numConta;
        String nomeDoTitular;

        System.out.println("DIGITE O NUMERO DA SUA CONTA E O NOME DO TITULAR:");

        System.out.print("NUMERO DA CONTA: ");
        numConta = leitor.nextInt();

        leitor.nextLine();

        System.out.printf("\nNOME DO TITULAR: ");
        nomeDoTitular = leitor.nextLine();


        ContaInterface.menu(numConta,nomeDoTitular);

        leitor.close();

        
    }
}
