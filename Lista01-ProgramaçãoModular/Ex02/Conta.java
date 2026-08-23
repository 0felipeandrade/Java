public class Conta {

    private int numeroDaConta;
    private double saldoDaConta;

    public Conta(){

        this.numeroDaConta = 00000;
        this.saldoDaConta = 0.0;

    }

    public Conta(int numeroDaConta, double saldoDaConta){

        this.numeroDaConta = numeroDaConta;
        this.saldoDaConta = saldoDaConta;

    }

    public void setDepositar(double valor){

        this.saldoDaConta = saldoDaConta + valor;
        
        System.out.println("DEPOSITO REALIZADO COM SUCESSO");
    
    }

    public void setSacar(double valor){

        if(saldoDaConta <= 0 || (saldoDaConta - valor) < 0){

            System.out.println("SALDO INSUFICIENTE");

        }else{

            this.saldoDaConta = saldoDaConta - valor;

            System.out.println("SAQUE FEITO COM SUCESSO!!");
        }


    }

    public double ConfereSaldo(){

        return saldoDaConta;

    }
    
}
