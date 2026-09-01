
import java.util.Scanner;

public class BancoInterface{

    Banco acessoAoBanco;
    ContaInterface manipulaConta;

    Conta criaConta;

    public BancoInterface(){

        acessoAoBanco = new Banco();
        manipulaConta = new ContaInterface();

    }

    public void menuBancoPrincipal(){  

        boolean whileRodaMenuBanco = true;
        int flag;
        String nome;
        Scanner leitor = new Scanner(System.in);

        System.out.println("Seja bem-vindo ao Banco POO Master.");

        while(whileRodaMenuBanco){

            System.out.printf("Qual das seguintes opcoes melhor te atende:\n1-Abrir Nova Conta\n2-Selecionar alguma conta \n3- Sair do Programa\n\n-----------------\n");
            flag = leitor.nextInt();

            switch (flag) {
                case 1:
                    System.out.println("Vamos criar sua conta...");
                    System.out.printf("Digite seu nome completo:\n");

                    leitor.nextLine();

                    nome = leitor.nextLine();


                    System.out.printf("Digite um numero para sua conta:");

                    flag = leitor.nextInt();
                    
                    criaConta = new Conta(flag,nome);

                    acessoAoBanco.cadastrarContas(criaConta);

                    break;
            
                case 2:

                    int guardaPosicao = -1;
                    Conta temp;
                    System.out.println("Digite qual o numero da conta que deseja acessar: ");


                    flag = leitor.nextInt();

                    for(int i = 0; i < acessoAoBanco.getRetornaInteiroQuantidadeContas();i++){

                        temp = acessoAoBanco.acessoUsuario()[i];

                        if(temp.getNumeroConta() == flag){
                            
                            System.out.println("A conta com o numero" + temp.getNumeroConta() + " pertence a " + temp.getnomeConta());
                            guardaPosicao = i;
                            break;

                        }else if(i == (acessoAoBanco.getRetornaInteiroQuantidadeContas() - 1)){
                            
                            System.out.println("Conta nao encontrada chefe...");
                            break;

                        }

                    }

                    if(guardaPosicao != -1){

                        System.out.println("Deseja acessar a conta?" + acessoAoBanco.acessoUsuario()[guardaPosicao].getnomeConta());
                        
                        System.out.printf("1- Sim\n 2-Nao");

                        flag = leitor.nextInt();

                        if(flag == 1){

                            manipulaConta.AcessaContaInterface(acessoAoBanco.acessoUsuario()[guardaPosicao]);
                            manipulaConta.menu();

                        }else{

                            System.out.println("Nao vamos acessa-la");
                        }

                    }


                    break;
                
                case 3:

                    System.out.println("Saindo do programa...");
                    whileRodaMenuBanco = false;
                                            
                    break;
            }


        }

    }

}
