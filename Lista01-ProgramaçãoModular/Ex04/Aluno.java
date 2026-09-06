public class Aluno{

    String registroAluno;
    String nomeAluno;

    public Aluno(String nomeAluno,String registroAluno){

        this.registroAluno = registroAluno;
        this.nomeAluno = nomeAluno;
    }

    public String toString(){

        return "Registro Aluno: " + registroAluno + "\nNome do Aluno: " + nomeAluno;
    }
}
