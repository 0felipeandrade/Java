
import java.util.Scanner;


public class Main{

    public static void main(String[] args) {
        
        String movimento;
        int series,repeticoes;

        Scanner leitor = new Scanner(System.in);

        movimento = leitor.nextLine();
        series = leitor.nextInt();
        repeticoes = leitor.nextInt();

        TreinoCalistenia calisthenics = new TreinoCalistenia(movimento, series, repeticoes);

        calisthenics.imprimirFicha();

         leitor.nextLine(); //Limpar o buffer do teclado

        movimento = leitor.nextLine();

        series = leitor.nextInt();
        repeticoes = leitor.nextInt();

        TreinoCalistenia calisthenics2 = new TreinoCalistenia(movimento, series, repeticoes);
        
        calisthenics2.imprimirFicha();

    

        leitor.close();
    }
}
