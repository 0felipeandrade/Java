
import java.util.Scanner;

public class Conta{

    Scanner leitor = new Scanner(System.in);


    private String nomeDoTitular;
    private int numConta;
    private double saldo;

    public double controleDeOperacao;


    public Conta(){

        this.nomeDoTitular = "NOMEUSUARIO";
        this.numConta = 0;
        this.saldo = 0.0;

    }

    public void setConta(){

        System.out.print("Digite seu nome completo: ");
        this.nomeDoTitular = leitor.nextLine();

        System.out.printf("\nDigite o numero da sua conta: ");
        this.numConta = leitor.nextInt();

    }

    private void Deposito(){

        System.out.print("Digite a quantidade que deseja depositar:");
        controleDeOperacao = leitor.nextDouble();

        saldo = saldo + controleDeOperacao;

    }

    private void Sacar(){

        System.out.print("Digite a quantidade que deseja sacar:");
        
        controleDeOperacao = leitor.nextDouble();
        

        if((saldo - controleDeOperacao) < 0){

            System.out.println("ERRO: SALDO INSULFICIENTE");

        }else{

            saldo = saldo - controleDeOperacao;
            
            System.out.println("SAQUE REALIZADO COM SUCESSO");
        }

    }

    public Double getConfereSaldo(){

        return saldo;
    }

    public String setDeposito(){

        this.Deposito();
        
        return "Deposito Feito com sucesso";
    }

    public void setSacar(){

        this.Sacar();
    }


    
}
