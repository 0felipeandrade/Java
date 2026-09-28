import java.util.ArrayList;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class Dijkistra{

    
    ArrayList<String[]> dados = new ArrayList<>();

    public void learquivo(){
        
        try{

        File arquivo = new File("arquivo.txt");
        Scanner leitor = new Scanner(arquivo);
            

        while(leitor.hasNextLine()){

            String linha = leitor.nextLine();

            String[] colunas = linha.trim().split("\\s+");

            if(colunas.length == 3){

                dados.add(colunas);
            }


        }

        for(String[] par : dados){
            
            System.out.println("Coluna1: " + par[0] + " Coluna 2: " + par[1] + " Peso: " + par[2]);
        }

        leitor.close();

        }catch(FileNotFoundException e){

            System.out.println("Nao encontrou arquivo");
            e.printStackTrace();
        }

        
    }

    

}
