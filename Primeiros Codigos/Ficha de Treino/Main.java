
import java.util.Scanner;

public class Main {
    
    public static void main(String[] args){

        String grupoMuscular;
        Scanner leitor = new Scanner(System.in);

        System.out.print("Digite o grupo muscular que deseja treinar: ");

        grupoMuscular = leitor.nextLine();

        Treino chamaTreino = new Treino(grupoMuscular);

        chamaTreino.imprimeFicha();

        leitor.close();
    }
}
