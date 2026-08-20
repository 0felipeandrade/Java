
import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        
        String comandoDesejado;

        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite o comando de terminal que deseja saber: (Ex.: ls,cd,mkdir...");

        comandoDesejado = leitor.nextLine();

        TerminalLinux chamaTerminal = new TerminalLinux(comandoDesejado);

        chamaTerminal.ImprimeResultado();
        

        leitor.close();
    }
}
