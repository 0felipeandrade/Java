public class Assistente extends Funcionarios {

    protected String matricula;

    public Assistente(){

        super(null,null);
        this.matricula = null;

    }
    public Assistente(String nome, String email, String matricula){

        super(nome,email);
        this.matricula = matricula;

    }
    

    public String exibeDados(){

        return "\nNome: " + nome + "\nEmail: " + email + "\nMatricula: " + matricula;

    }

}
