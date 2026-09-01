
import java.util.Scanner;

public class ContaInterface{

    Conta acesso;

    public void AcessaContaInterface(Conta conta){

        acesso = conta;

    }

    public void menu(){

        Scanner leitor = new Scanner(System.in);
        int flag;
        boolean whileRodaMenu = true;
        double valoresDeOperacao;

        while(whileRodaMenu){
            
            System.out.println("----------------------\n----------------------\nVoce entrou no menu de opcoes do BancoPOOMaster, digite uma opcao abaixo:");
            System.out.printf("1-Depositar\n2-Sacar\n3-Conferir Saldo\n4-Sair do Menu\n");

            flag = leitor.nextInt();

            switch (flag) {
                case 1:

                    valoresDeOperacao = leitor.nextDouble();
                    acesso.setDeposito(valoresDeOperacao);

                    break;
                case 2:

                    valoresDeOperacao = leitor.nextDouble();
                    acesso.setSacar(valoresDeOperacao);

                    break;
                
                case 3:

                    System.out.println("Seu saldo eh: R$ " + acesso.getConfereSaldo()); 
                    break;

                case 4:

                    System.out.println("Saindo do Menu");
                    whileRodaMenu = false;
                    break;

            }

        }

        leitor.close();
    }
}
