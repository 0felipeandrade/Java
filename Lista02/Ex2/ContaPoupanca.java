public class ContaPoupanca extends ContaBancaria{
    
    protected  double taxaDeRendimento;

    public ContaPoupanca(String cliente,String numConta,double saldo){

        super(cliente,numConta,saldo);
        this.taxaDeRendimento = 0.1; //colocar a taxa de rendimento em 0.1 - Considerando mensal
    }


    public double getSaldo(){

        return (super.getSaldo() * taxaDeRendimento);

    }

    public String toString(){

        return "\nNome: " + cliente + "\nNumero Conta: " + numConta + "\nSaldo: " + getSaldo();
    }
}
