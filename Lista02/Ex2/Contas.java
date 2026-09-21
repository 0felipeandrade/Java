
import java.util.ArrayList;
import java.util.Scanner;

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

            System.out.printf("\nPara o nosso cliente %d, digite o Nome Completo, o cpf do mesmo e se deseja abrir uma Conta Especial ou Poupanca:",temp);
            System.out.print("\nNome Completo: ");
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
        
        boolean controle = true;
        while(controle){
  

                System.out.println("Digite o numero da conta para acessá-la");
                System.out.print("Numero Conta: ");
                numConta = leitor.nextLine();
                

                ContaBancaria imprimeCliente = encontraConta(contasClientes,numConta);
                
                if(imprimeCliente == null){

                    System.out.println("Numero da Conta invalido");
                    break;

                }else{

                    System.out.println("Conta encontrada com sucesso");
                }

            
                System.out.println("\n------------------------\nGostaria de acessar qual das opcoes abaixo? \n1-SACAR\n2-DEPOSITAR\n3-VISUALIZAR INFO's\n4-SAIR");

                int flag = leitor.nextInt();
                leitor.nextLine();
                double valor;

                switch (flag) {

                    case 1:

                        valor = leitor.nextDouble();
                        boolean ehVerdade = imprimeCliente.sacar(valor);
                        break;

                        

                    
                    case 2:

                        valor = leitor.nextDouble();
                        leitor.nextLine();
                        imprimeCliente.depositar(valor);
                        System.out.println("OBRIGADO POR DEPOSITAR " + valor);
                        break;
                    
                    case 3:
                        
                        System.out.println(imprimeCliente.toString()+"\n");
                        break;

                    case 4:

                        controle = false;
                        break;


                }




                


        }



    leitor.close();

    }
}
