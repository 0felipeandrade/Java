
import java.util.Scanner;

public class ContaInterface{

    public int controleOpcoes;
    private int flag = 1;

    Conta acessaServicos;

    Scanner leitor = new Scanner(System.in);


    public ContaInterface(){

        acessaServicos = new Conta();
    }

    public Conta criaConta(){
        
        acessaServicos.setConta();

        return acessaServicos;
    }

    public void AcessaConta(){

        while(flag == 1){

            System.out.printf("\n\nACESSO A CONTA. DIGITE UMA DAS OPCOES ABAIXO:\n");
            System.out.printf("1-DEPOSITAR \n2-SACAR \n3- CONFERIR SALDO \n4-SAIR MENU\n");

            controleOpcoes = leitor.nextInt();

            switch(controleOpcoes){

                case 1: 
                    System.out.printf("\n" + acessaServicos.setDeposito());
                    break;
                
                case 2:
                    acessaServicos.setSacar();
                    break;
                
                case 3:
                    System.out.println("SEU SALDO EH: " + acessaServicos.getConfereSaldo());
                    break;
                
                case 4:

                    System.out.println("Saindo do Menu");
                    flag = 0;
                    break;


            }

        }

        


    }
}
