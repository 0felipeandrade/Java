public class Funcionarios {
    
    protected String nome,email;

    public Funcionarios(String nome, String email){

        this.nome = nome;
        this.email = email;

    }

    public String exibeDados(){

        return "nome: " + nome + "Email: " + email;
    }

}
