public class AssistenteAdm extends Assistente {

    protected double bonusNoturno;
    protected double salario;
    protected String turno;

    public AssistenteAdm(){

        super(null,null,null);
        this.turno = null;
        this.salario = 0.0;

    }
    public AssistenteAdm(String nome, String email,String matricula,String turno, double salario){

        super(nome,email,matricula);
        this.turno = turno;
        this.salario = salario;

    }

    public String exibeDados(){

        return "\nNome: " + nome + "\nEmail: " + email + "\nMatricula: " + matricula + "\nTurno de Trabalho: " + turno;
    }
}
