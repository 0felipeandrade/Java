public abstract class ContaBancaria {
    
    protected String cliente;
    protected String numConta;
    protected double saldo;

    public ContaBancaria(String cliente,String numConta,double saldo){
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

    public double depositar(double valor){

        saldo = saldo + valor;

        return saldo;

    }

    public String getNumConta(){

        return numConta;
    }

    public double getSaldo(){

        return saldo;
    }
}
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

    public double depositar(double valor){

        saldo = saldo + valor;

        return saldo;

    }

    public String getNumConta(){

        return numConta;
    }

    public double getSaldo(){

        return saldo;
    }
}
