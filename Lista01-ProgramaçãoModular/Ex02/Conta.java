public class Conta{

    private int numeroConta;
    private String nomeUsuario;
    private double saldo;
    

    public Conta(){

        nomeUsuario = "Algum usuario ainda nao definido";
        numeroConta = 0;
        saldo = 0.0;
    }

    public Conta(int numConta,String nomeUsuario){

        this.numeroConta = numConta;
        this.nomeUsuario = nomeUsuario;

    }

    private void Depositar(Double valor){

        saldo = saldo + valor;
    }


    private void Sacar(Double valor){

        if((saldo - valor) < 0){

            System.out.println("Saldo insulficiente...Deposite mais dinheiro ou então saque um valor menor");

        }else{

            saldo = saldo - valor;
        }

    }

    public double getConfereSaldo(){

        return this.saldo;
    }

    public int getNumeroConta(){

        return this.numeroConta;
    }

    public String getnomeConta(){

        return this.nomeUsuario;
    }

    public void setDeposito(Double valor){

        this.Depositar(valor);

    }

    public void setSacar(Double valor){

        this.Sacar(valor);
    }
}
