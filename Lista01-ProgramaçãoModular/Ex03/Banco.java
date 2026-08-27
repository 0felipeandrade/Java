public class Banco{

    Conta[] contas;
    public int qtdContas;

    public Banco(){

        contas = new Conta[10];
        qtdContas = 0;

    }

    public Conta[] AcessaContaUsuario(){

        return contas;

    }

    public void CadastroDeConta(Conta contaNova){

        contas[qtdContas++] = contaNova;

    }
}
