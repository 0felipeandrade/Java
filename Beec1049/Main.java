

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        
        String palavra1,palavra2,palavra3;

        Scanner Leitor = new Scanner(System.in);

        palavra1 = Leitor.nextLine();
        palavra2 = Leitor.nextLine();
        palavra3 = Leitor.nextLine();


        ArrayList<String> nomes = new ArrayList<>();

        nomes.add("aguia");
        nomes.add("pomba");
        nomes.add("homem");
        nomes.add("vaca");
        nomes.add("pulga");
        nomes.add("lagarta");
        nomes.add("sanguessuga");
        nomes.add("minhoca");

        if(palavra1.equals("vertebrado")){
            
            if(palavra2.equals("ave")){

                if(palavra3.equals("carnivoro")){

                    System.out.println(nomes.get(0));


                }else{

                    System.out.println(nomes.get(1));


                }
            }else{

                if(palavra3.equals("onivoro")){

                    System.out.println(nomes.get(2));

                }else{

                    System.out.println(nomes.get(3));

                }


            }


        }else{


            if(palavra2.equals("inseto")){

                if(palavra3.equals("hematofago")){

                    
                    System.out.println(nomes.get(4));


                }else{

                    System.out.println(nomes.get(5));


                }
            }else{

                if(palavra3.equals("hematofago")){

                    System.out.println(nomes.get(6));

                }else{

                    System.out.println(nomes.get(7));

                }


            }

        }


        Leitor.close();
    }

    
    }

