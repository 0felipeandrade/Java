public class Treino {
    
    String grupo, treinoFinal;

    public Treino(String grupo){

        this.grupo = grupo;

        this.gerarExercicios();

    }

    private void gerarExercicios(){

        if(this.grupo.equals("Costas")){

            this.treinoFinal = "PullUps e FrontLever";

        }else if(this.grupo.equals("Peito")){

            this.treinoFinal = "Flexao Militar e Flexao Pike";

        }else if(this.grupo.equals("Pernas")){


            this.treinoFinal = "Agachamento e Afundo";

        }else{

            this.treinoFinal = "Nao existe essa opcao";

        }

    }


    public void imprimeFicha(){

        System.out.println("Seu treino eh: " + treinoFinal);
    }


}
