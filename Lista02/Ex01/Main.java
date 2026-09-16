
import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        
        Funcionarios[] funcionarios = new Funcionarios[3];

        Scanner leitor = new Scanner(System.in);

        String nome,email,matricula,turno;
        double salario;


        while(true){

            System.out.println("Digite o Nome, o email do Assistente e a matricula: ");
            System.out.print("Nome: ");
            nome = leitor.nextLine();
            System.out.print("\nEmail: ");
            email = leitor.nextLine();
            System.out.print("\nMatricula: ");
            matricula = leitor.nextLine();

            funcionarios[0] = new Assistente(nome,email,matricula);

            System.out.println("\nAgora digite o Nome, o email do Assistente ADM,a matricula, o turno e o salario: ");
            System.out.print("\nNome: ");
            nome = leitor.nextLine();
            System.out.print("\nEmail: ");
            email = leitor.nextLine();
            System.out.print("\nMatricula: ");
            matricula = leitor.nextLine();
            System.out.print("\nTurno: ");
            turno = leitor.nextLine();
            System.out.print("\nSalario: ");
            salario = leitor.nextDouble();
            leitor.nextLine();

            funcionarios[1] = new AssistenteAdm(nome,email,matricula,turno,salario);

            System.out.println("\nAgora digite o Nome, o email do Assistente Tecnico,a matricula e o salario: ");
            System.out.print("\nNome: ");
            nome = leitor.nextLine();
            System.out.print("\nEmail: ");
            email = leitor.nextLine();
            System.out.print("\nMatricula: ");
            matricula = leitor.nextLine();
            System.out.print("\nSalario: ");
            salario = leitor.nextDouble();
            leitor.nextLine();

            funcionarios[2] = new AssistenteTec(nome,email,matricula,salario);


            System.out.println(funcionarios[0].exibeDados());
            System.out.println(funcionarios[1].exibeDados());
            System.out.println(funcionarios[2].exibeDados());

            System.out.println("Deseja Continuar cadastrando funcionarios ou sair?S/N");
            nome = leitor.nextLine();

            if(nome.equals("S")){


            }else if(nome.equals("N")){

                break;
            }

        }

        leitor.close();
    }
}
