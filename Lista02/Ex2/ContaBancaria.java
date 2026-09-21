public abstract class ContaBancaria {
    
    protected String cliente;
    protected String numConta;
    protected double saldo;

    public ContaBancaria(String cliente,String numConta,double saldo){

        this.cliente = cliente;
        this.numConta = numConta;
        this.saldo = saldo;
        
    }

    protected boolean sacar(double valor){

        if((saldo - valor) < 0){

            return false;

        }else{

            saldo = saldo - valor;

            return true;
        }
    }

    protected void depositar(double valor){

        saldo = saldo + valor;

    }

    public String getNumConta(){

        return numConta;
    }

    public double getSaldo(){

        return saldo;
    }
}
