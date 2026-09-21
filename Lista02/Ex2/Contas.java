
import java.util.Scanner;

import java.util.ArrayList;

public class Contas {
    

    public  static ContaBancaria encontraConta(ArrayList<ContaBancaria> conta, String numConta){ //Me deu um erro por que nao usei o "static" mas nao entendi muito bem- buscar explicação e complementar aqui

        for(ContaBancaria percorre : conta){

            if(percorre.getNumConta().equals(numConta)){

                return percorre;
            }
        }

        return null;

    }
    public static void main(String[] args) {
        
        int qtd;
        String numConta;
        int temp = 0;
        String nome, tipoConta;

        Scanner leitor = new Scanner(System.in);
        ArrayList<ContaBancaria> contasClientes = new ArrayList<>();

        System.out.println("""

                BemVindo ao Banco PAN (PARCEIRO AMIGAO NACIONAL)!! 
                Como nao temos um banco de dados nem um arq.txt vamos comecar cadastrando os clientes desejados;

        """);

        System.out.println("Digite a quantidade de clientes que deseja cadastrar?");
        System.out.print("Digite a quantidade: ");
        qtd = leitor.nextInt();
        leitor.nextLine(); //limpar o buffer

        while(temp < qtd){

            System.out.printf("Para o nosso cliente %d, digite o Nome Completo, o cpf do mesmo e se deseja abrir uma Conta Especial ou Poupanca:",temp);
            System.out.print("Nome Completo: ");
            nome = leitor.nextLine();

            System.out.print("CPF(apenas os numeros): ");
            numConta = leitor.nextLine();

            System.out.print("Digite ESPECIAL ou POUPANCA para o tipo de conta: ");
            tipoConta = leitor.nextLine();

            if(tipoConta.equals("ESPECIAL")){

                contasClientes.add(new ContaEspecial(nome, numConta, 0.0));
                System.out.println("\n CONTA ADICIONADA COM SUCESSO");

            }else if(tipoConta.equals("POUPANCA")){

                contasClientes.add(new ContaPoupanca(nome, numConta, 0.0));
                System.out.println("\n CONTA ADICIONADA COM SUCESSO");

            }
    
            temp++;
        }
        
        System.out.println("""

            Agora que ja adicionamos nossas contas corretamente ja podemos acessá-las:
            \n(Inicialmente estão todas instanciadas com R$0.0)


        """);

        while(true){
  

                System.out.println("Digite o numero da conta para acessá-la");
                System.out.print("Numero Conta: ");
                numConta = leitor.nextLine();
                

                ContaBancaria imprimeCliente = encontraConta(contasClientes,numConta);
                
                if(imprimeCliente == null){

                    System.out.println("Numero da Conta invalido");
                }else{

                    System.out.println(imprimeCliente.toString());
                }

            
                System.out.println("\n------------------------\nGostaria de acessar qual das opcoes abaixo? \n1-SACAR\n2-DEPOSITAR\n3-VISUALIZAR INFO's");

                System.out.print("Deseja continuar?\nS/N: ");
                nome = leitor.nextLine();


                if(nome.equals("N") || nome.equals("n")){

                    System.out.println("Obrigado por utilizar nosso Aplicativo!!");
                    break;
                }


        }



    leitor.close();

    }
}
