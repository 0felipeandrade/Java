public class AssistenteTec extends Assistente {
    
    protected double bonusSalarial;
    protected double salario;

    public AssistenteTec(){

        super(null,null,null);
        this.salario = 0.0;
        this.bonusSalarial = 0.0;
    }

    public AssistenteTec(String nome, String email, String matricula, double salario){

        super(nome,email,matricula);
        this.salario = salario;
        this.bonusSalarial = 20.0;

    }

    public String exibeDados(){

        return "\nNome: " + nome + "\nEmail: " + email + "\nMatricula: " + matricula + "\nBonus Salarial: " + bonusSalarial;
    }
}
