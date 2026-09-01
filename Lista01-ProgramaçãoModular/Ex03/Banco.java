public class Banco{

    Conta[] contasDoBancoPOOMaster;
    private int quantidadeContasAbertas;


    public Banco(){

        contasDoBancoPOOMaster = new Conta[10];
        quantidadeContasAbertas = 0;

    }

    public Conta[] acessoUsuario(){

        return contasDoBancoPOOMaster;

    }

    public void cadastrarContas(Conta contaNova){

        contasDoBancoPOOMaster[quantidadeContasAbertas++] = contaNova;

    }

    public int getRetornaInteiroQuantidadeContas(){

        return this.quantidadeContasAbertas;
    }
}
