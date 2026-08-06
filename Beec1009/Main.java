/*Faça um programa que leia o nome de um vendedor, o seu salário fixo e o total de vendas efetuadas por ele no mês (em dinheiro). Sabendo que este vendedor ganha 15% de comissão sobre suas vendas efetuadas, informar o total a receber no final do mês, com duas casas decimais.

Entrada
O arquivo de entrada contém um texto (primeiro nome do vendedor) e 2 valores de dupla precisão (double) com duas casas decimais, representando o salário fixo do vendedor e montante total das vendas efetuadas por este vendedor, respectivamente.

Saída
Imprima o total que o funcionário deverá receber, conforme exemplo fornecido.*/


import java.util.Locale;
import java.util.Scanner;

public class Main{

    public static void main(String[] args) {
        
        String vendedor;
        double salario, vendas;
        double total_receber;

        Scanner Leitor = new Scanner(System.in);
        Leitor.useLocale(Locale.US); 

        vendedor = Leitor.nextLine();
        salario = Leitor.nextDouble();
        Leitor.nextLine();
        vendas = Leitor.nextDouble();


        total_receber = salario + (vendas * 0.15);

        String total_receber1 = String.format(Locale.US,"%.2f",total_receber);

        System.out.println("TOTAL = R$ " + total_receber1);

        Leitor.close();
    }
}
