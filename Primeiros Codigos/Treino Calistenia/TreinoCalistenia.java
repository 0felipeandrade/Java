public class TreinoCalistenia {

    String Movimento;
    int series;
    int repeticoes;

    public TreinoCalistenia(String Movimento, int series, int repeticoes){

        this.Movimento = Movimento;
        this.series = series;
        this.repeticoes = repeticoes;
    }



    public void imprimirFicha(){

        System.out.println("Movimento: " + Movimento);
        System.out.println("Series: " + series);
        System.out.println("Repeticoes: " + repeticoes);

    }
    
}
