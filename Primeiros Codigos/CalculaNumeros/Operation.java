public class Operation {
    float number1, number2;
    String operacao;

    float resultado;

        public void realizaOperacao(){

                if(operacao.equals("multiplicacao")){

                    resultado = number1 * number2;

                }else if(operacao.equals("soma")){

                    resultado = number1 + number2;

                }else if(operacao.equals("subtracao")){

                    resultado = number1 - number2;

                }else if(operacao.equals("divisao")){

                if(number2 != 0){

                    resultado = number1/number2;

                }else{

                    System.out.println("Erro ao fazer divisao por zero");

                }
            }
    }
}
