package Beec1045;

/*beecrowd | 1045

Tipos de Triângulos

Leia 3 valores de ponto flutuante A, B e C e ordene-os em ordem decrescente, de modo que o lado A representa o maior dos 3 lados. A seguir, determine o tipo de triângulo que estes três lados formam, com base nos seguintes casos, sempre escrevendo uma mensagem adequada:

se A ≥ B+C, apresente a mensagem: NAO FORMA TRIANGULO
se A2 = B2 + C2, apresente a mensagem: TRIANGULO RETANGULO
se A2 > B2 + C2, apresente a mensagem: TRIANGULO OBTUSANGULO
se A2 < B2 + C2, apresente a mensagem: TRIANGULO ACUTANGULO
se os três lados forem iguais, apresente a mensagem: TRIANGULO EQUILATERO
se apenas dois dos lados forem iguais, apresente a mensagem: TRIANGULO ISOSCELES
Entrada
A entrada contem três valores de ponto flutuante de dupla precisão A (0 < A) , B (0 < B) e C (0 < C).

Saída
Imprima todas as classificações do triângulo especificado na entrada. */

import java.util.Scanner;

public class Main{


    public static void main(String[] args) {
        
        float[] lados;
        lados = new float[3];

        Scanner Leitor = new Scanner(System.in);

            lados[0] = Leitor.nextFloat();
            lados[1] = Leitor.nextFloat();
            lados[2] = Leitor.nextFloat();


            System.out.println("O numero digitado eh: " + lados[0] + " " + lados[1] + " " + lados[2]);

        Leitor.close();

        int aux;
        float temp;

       for (int i = 0; i < 3 - 1; i++) {
        // Encontra o menor elemento na parte não ordenada
        aux = i;
        for (int j = i + 1; j < 3; j++) {
            if (lados[j] > lados[aux]) {
                aux = j;
            }
        }

        // Troca o menor elemento encontrado com o primeiro elemento
        temp = lados[aux];
        lados[aux] = lados[i];
        lados[i] = temp;
        }


        System.out.println("O numero digitado eh: " + lados[0] + " " + lados[1] + " " + lados[2]);

        if(lados[0] >= (lados[1] + lados[2])){

            System.out.println("NAO FORMA TRIANGULO");

        }else{
            
            
            if((lados[0]*lados[0]) == ((lados[1]*lados[1]) + (lados[2]*lados[2]))){

             System.out.println("TRIANGULO RETANGULO");

        }if((lados[0]*lados[0]) > ((lados[1]*lados[1]) + (lados[2]*lados[2]))){

             System.out.println("TRIANGULO OBTUSANGULO");
             
        }if((lados[0]*lados[0]) < ((lados[1]*lados[1]) + (lados[2]*lados[2]))){

             System.out.println("TRIANGULO ACUTANGULO");
             
        }if((lados[0] == lados[1]) && (lados[1] == lados[2])){

            System.out.println("TRIANGULO EQUILATERO");

        }else if((lados[0] == lados[1]) || (lados[0] == lados[2]) || (lados[1] == lados[2])){

            System.out.println("TRIANGULO ISOSCELES");

        }

    }

    }

        


}
