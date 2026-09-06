public class Disciplina{

    int codigo;
    double valor;
    String nomeCurso;

    String disciplinasCurso;

    public Disciplina(String nomeCurso, String disciplinasCurso){

        this.nomeCurso = nomeCurso;
        this.disciplinasCurso = disciplinasCurso;
        
    }

    public String toString(){

        return "codigo: " + codigo + "valor: " + valor + "Nome Disciplina: " + nomeCurso;
    }



}
