public class NumeroComplexo {

    int parteReal1,parteImaginaria1;
    int parteReal2,parteImaginaria2;

    String soma,produto, conjugado;
    

    public NumeroComplexo(int parteReal1, int parteImaginaria1, int parteReal2, int parteImaginaria2) { //Construtor

        this.parteReal1 = parteReal1;
        this.parteImaginaria1 = parteImaginaria1;
        this.parteReal2 = parteReal2;
        this.parteImaginaria2 = parteImaginaria2;


        this.SomaNum();
        this.ProdutoNum();
        this.Conjugado();

    }


    private void SomaNum() {

        int somaReal, somaImaginario;

        somaReal = parteReal1 + parteReal2;
        somaImaginario = parteImaginaria1 + parteImaginaria2;

        this.soma = somaReal + "+" + somaImaginario + "i";

        
    }

    private void ProdutoNum(){


        int multiplicaReal, multiplicaImaginario;

        multiplicaReal = (parteReal1 * parteReal2) - (parteImaginaria1 * parteImaginaria2);
        multiplicaImaginario = (parteImaginaria1 * parteReal2) + (parteReal1 * parteImaginaria2);

        this.produto = multiplicaReal + "+" + multiplicaImaginario + "i";
    }

    private void Conjugado(){

        conjugado = parteReal1 + "+" + parteImaginaria1 + "i  " + parteReal2 + "+" + parteImaginaria2 + "i" ;


    }



    public void ImprimeResultado(){


        System.out.println(soma);
        System.out.println(produto);
        System.out.println(conjugado);

    }
}
