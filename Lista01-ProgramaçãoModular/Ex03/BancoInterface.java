
import java.util.Scanner;

public class BancoInterface{

    Banco acesso;

    public BancoInterface(){

        acesso = new Banco();

    }

    public void Menu(){

        Scanner leitor = new Scanner(System.in);
        int flag;
        int SairPrograma = 1;
        ContaInterface minhaConta;
        Conta temporario;



        while(SairPrograma == 1){

        System.out.println("DESEJA CRIAR UMA CONTA?");
        System.out.printf("1-SIM\n2-NAO\n3-SAIRDOPROGRAMA");

        flag = leitor.nextInt();

            switch (flag) {
                case 1:

                    minhaConta = new ContaInterface();
                    temporario = minhaConta.criaConta();
                    minhaConta.AcessaConta();
                    acesso.CadastroDeConta(temporario);
                    break;

                case 2:

                    int contador = 0;
                    while(contador < acesso.qtdContas){
                        
                        System.out.println(acesso.AcessaContaUsuario()[contador]);
                        
                        contador++;
                    }       break;
                case 3:
                    
                    System.out.println("Obrigado por utilizar nossos servicos");
                    SairPrograma = 0;
                    break;
                    
                default:
                    break;
            }

        }
        



    }
}
