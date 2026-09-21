public class ContaEspecial extends ContaBancaria{

    protected  double limiteRestante;


    public ContaEspecial(String cliente,String numConta,double saldo){

        super(cliente,numConta,saldo);
        this.limiteRestante = 1000.00;

    }

    @Override 
    protected  boolean sacar(double valor){

        double temp = saldo - valor;

        if(temp < 0 && (limiteRestante + temp) >= 0 ){

            limiteRestante = limiteRestante + temp;

            saldo = 0;

            System.out.printf("Saque feito com sucesso!!\nVoce usou %.2f do seu limite\n", -temp);

            return true;

        }else if(temp >= 0 && (saldo != 0)){

            saldo = temp;

            System.out.println("Saque feito com sucesso!!\n");

            return true;
        }

            System.out.printf("Nao foi possivel sacar, seu limite estourou ou o valor desejado excede o limite\nSeu limite: %.2f\n",limiteRestante);

            return false;
        
    }

      public String toString(){

        return "\nNome: " + cliente + "\nNumero Conta: " + numConta + "\nSaldo: " + getSaldo() + "\nLimite: " + limiteRestante;
    }


}
