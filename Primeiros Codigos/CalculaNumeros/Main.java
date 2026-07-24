import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        
        Scanner Leitor = new Scanner(System.in);

        Operation recebeOperation = new Operation();

        System.out.print("Digite o primeiro numero: ");
        recebeOperation.number1 = Leitor.nextFloat();

        System.out.print("Digite o segundo numero: ");
        recebeOperation.number2 = Leitor.nextFloat();

        Leitor.nextLine();

        System.out.print("Digite o tipo de operacao: ");
        recebeOperation.operacao = Leitor.nextLine();


        System.out.print("Analisando resultado");

        int flag = 0;

        for(int i = 0; i < 2; i++){

            System.out.print(".");
            Thread.sleep(500);

            if(i == 1 && flag < 2){

                i = 0;
                flag++;
            }
    
        }

        recebeOperation.realizaOperacao();

        System.out.println("\nSeu resultado eh: " + recebeOperation.resultado);

        Leitor.close();
    
    }

}
