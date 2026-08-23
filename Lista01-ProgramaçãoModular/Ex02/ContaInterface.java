
import java.util.Scanner;

public class ContaInterface {


    public static void menu(int numConta, String nomeTitular){

        int opcao,controlador;
        double valoresDeOperacao;

        Conta estruturaOperacao = new Conta();

        boolean flag = true;
        Scanner leitor = new Scanner(System.in);


        while(flag){

            System.out.println("QUAL DAS OPCOES ABAIXO DESEJA ACESSAR:(DIGITE O NUMERO DA OPCAO DESEJADA) ");
            System.out.println("1-DEPOSITO");
            System.out.println("2-SACAR");
            System.out.println("3-CONFERIR SALDO");
            System.out.println("4-ENCERRAR SERVICOS");

            opcao = leitor.nextInt();

            switch(opcao){


                case 1: 

                    System.out.println("INFORME O VALOR DO DEPOSITO");
                    valoresDeOperacao = leitor.nextDouble();

                    estruturaOperacao.setDepositar(valoresDeOperacao);

                    break;

                case 2:

                    System.out.println("INFORME O VALOR DO SAQUE");
                    
                    valoresDeOperacao = leitor.nextDouble();

                    estruturaOperacao.setSacar(valoresDeOperacao);

                    break;
                    

                case 3:
                    
                    System.out.println("SALDO ATUAL: ");

                    System.out.println(estruturaOperacao.ConfereSaldo());



                    break;

                case 4:

                    System.out.println("SERVIÇO ENCERRADO COM SUCESSO SR(A)." + nomeTitular);
                    flag = false;
                    break;

            }

                if(flag){

                    System.out.println("DESEJA ENCERRAR O SERVIÇO OU ESCOLHER OUTRA OPCAO?");
                    System.out.println("0-ENCERRAR");
                    System.out.println("1-CONTINUAR");
                    
                    controlador = leitor.nextInt();

                    if(controlador == 0){

                        System.out.println("SERVIÇO ENCERRADO COM SUCESSO SR(A)." + nomeTitular);
                        flag = false;
                    }

                }

        }

        leitor.close();
    }
    
}
