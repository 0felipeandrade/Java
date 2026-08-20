public class TerminalLinux {
    
    private String meuComando;

    private String explicacao;

    public TerminalLinux(String meuComando){

        this.meuComando = meuComando;

        this.RetornaExplicacao();

    }

    private void RetornaExplicacao(){

        

        if(meuComando.equals("ls")){

            explicacao = "O comando ls lista todos as pastas dentro do diretorio atual";

        }else if(meuComando.equals("cd")){

            explicacao = "O comando cd retorna ao diretorio raíz. Obs: Se quiser voltar o caminho de apenas uma pasta dê o comando 'cd..'";

        }else if(meuComando.equals("mkdir")){

            explicacao = "O comando mkdir cria uma nova pasta dentro da pasta atual";

        }else if(meuComando.equals("touch")){

            explicacao = "O comando touch + arquivo.extensao cria um novo arquivo dentro da pasta";

        }else{

            explicacao = "Ainda nao temos explicacao de comandos restantes. :/";
            
        }


    }

    public void ImprimeResultado(){

        System.out.println(meuComando);
        System.out.println(explicacao);

    }


}
