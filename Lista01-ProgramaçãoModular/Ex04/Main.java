
import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class Main{

    private List<Aluno> alunosMatriculados;
    private List<Disciplina> disciplinasCurso;
    private List<Matricula> matriculas;

    public Main(){

        alunosMatriculados = new ArrayList<>();
        disciplinasCurso = new ArrayList<>();
        matriculas = new ArrayList<>();

    }
    public Aluno retornaAlunoMatriculado(List<Aluno> listaAlunos, String registroAluno){

        Aluno temp = null;

        for(int i = 0; i < alunosMatriculados.size(); i++){

            if(listaAlunos.get(i).registroAluno.equals(registroAluno)){

                temp = listaAlunos.get(i);
                break;

            }
        }

        return temp;

    }

    public void retornaInformacoesdeMatricula(List<Matricula> listaMatricula, String registroAluno){

        Matricula temp = null;

        for(int i = 0; i < matriculas.size(); i++){

            if(listaMatricula.get(i).alunoProcurado.registroAluno.equals(registroAluno)){

                temp = listaMatricula.get(i);
                break;
            }
        }

        if(temp != null){

            System.out.println(temp.alunoProcurado);
            System.out.println(temp.cursando);
            
            System.out.println("Situacao do aluno:");

            for(String materia : temp.disciplinasENotas.keySet()){

                Double nota = temp.disciplinasENotas.get(materia);

                System.out.println("Disciplina: " + materia + "Notas: " + nota);

            }


            System.out.println("Soma total das notas: " + temp.calculaTotal()); 
        }
    }

    public void adicionaCurso(List<Disciplina> listaCurso, Disciplina novoCurso){

        listaCurso.add(novoCurso);

    }

    public void adicionaAluno(List<Aluno> listaAlunos, Aluno novoAluno){
        
        listaAlunos.add(novoAluno);
    }

    public void adicionaMatricula(List<Matricula> listaMatricula, Matricula novaMatricula){

        listaMatricula.add(novaMatricula);
    }

    public Disciplina retornaDisciplinaCurso(List<Disciplina> listaDisciplina, String nomeCurso){

        Disciplina temp = null;

        for(int i = 0; i < disciplinasCurso.size(); i++){

            if(listaDisciplina.get(i).nomeCurso.equals(nomeCurso)){

                temp = listaDisciplina.get(i);
                break;

            }
        }

        return temp;

    }

    public static void main(String[] args) {
        
        Scanner leitor = new Scanner(System.in);

        Main criaLista = new Main();

        boolean verdade = true;
        int flag;
        String flagRegistroAluno,flagNomeAluno,flagNomeMateria,flagNomeDisciplinas;
        Aluno temporario;
        Disciplina temporarioDisciplina;
        Matricula temporarioMatricula;
        

        System.out.println("Ola, seja bem vindo a plataforma principal da faculdade To pros Krai - FTPK");
    
        while(verdade){
            
            System.out.println("\n\nDeseja acessar qual das opcoes?");
            System.out.println("1-Alunos matriculados 2-Disciplinas por Curso 3- lista de matriculas 4-Cadastrar Materia 5-Cadastrar Aluno 6- Cadastrar Matricula 7-Sair\n\n");
            flag = leitor.nextInt();

            if(flag == 1){

                if(criaLista.alunosMatriculados.isEmpty()){ // o isEmpty diz que se a lista estiver vazia faça algo

                    System.out.println("Ainda nao temos alunos cadastrados");

                }else{

                    System.out.println("Digite o registro de Aluno para podermos localizá-lo:");

                    leitor.nextLine(); //limpar o buffer do teclado
                    flagRegistroAluno = leitor.nextLine(); // o flagRegistroAluno é para ler a string Registro aluno

                    temporario = criaLista.retornaAlunoMatriculado(criaLista.alunosMatriculados,flagRegistroAluno);

                    if(temporario != null){

                        System.out.println("\nNome:" + temporario.nomeAluno + "\nRegistro: " + temporario.registroAluno);
                        
                    }else{

                        System.out.println("Aluno nao encontrado!!");
                    }

                     
                    
                    

                }

            }else if(flag == 2){

                if(criaLista.disciplinasCurso.isEmpty()){

                    System.out.println("Ainda nao temos disciplinas cadastradas");

                }else{

                    System.out.println("Digite o nome do Curso desejado para acessar as disciplinas disponiveis");

                    leitor.nextLine();
                    flagNomeMateria = leitor.nextLine();

                    temporarioDisciplina = criaLista.retornaDisciplinaCurso(criaLista.disciplinasCurso, flagNomeMateria);

                    if(temporarioDisciplina != null){

                        System.out.println("\nNome do Curso: " + temporarioDisciplina.nomeCurso + "\nDisciplinas Referente ao curso: " + temporarioDisciplina.disciplinasCurso);

                    }else{

                        System.out.println("Curso nao localizado");
                    }

                }


            }else if(flag == 3){

                System.out.println("Deseja consultar qual matricula? - Digite o numero de registro para acessar as informações completas");
                leitor.nextLine();
                flagRegistroAluno = leitor.nextLine();

                criaLista.retornaInformacoesdeMatricula(criaLista.matriculas, flagRegistroAluno);



                


            }else if(flag == 4){

                System.out.println("Para acessar essa opcao, voce deve ser algum servidor cadastrado. Digite a senha para acessar: ");

                leitor.nextLine();
                String senhaDeAcesso = leitor.nextLine();
                

                int contadorSenhasErradas = 0;

                while(!senhaDeAcesso.equals("ServidoresFTPK123")){
                    contadorSenhasErradas++;

                    if(contadorSenhasErradas == 3){

                        System.out.println("Numero de tentativas excedidas");
                        break;
                    }

                    System.out.println("Senha errada, digite novamente: ");
                    senhaDeAcesso = leitor.nextLine();
        

                }


                if(senhaDeAcesso.equals("ServidoresFTPK123")){

                    System.out.println("Digite o nome da Materia que deseja cadastrar:");
                    flagNomeMateria = leitor.nextLine();
                   
                    System.out.println("Digite as Disciplinas que Deseja Cadastrar separadas por espaco");
                    flagNomeDisciplinas = leitor.nextLine();

                    temporarioDisciplina = new Disciplina(flagNomeMateria,flagNomeDisciplinas);

                    criaLista.adicionaCurso(criaLista.disciplinasCurso, temporarioDisciplina);

                    System.out.println("\nDisciplina Cadastrada com sucesso!!");

                }
                



            }else if(flag == 5){

                System.out.println("Para acessar essa opcao, voce deve ser algum servidor cadastrado. Digite a senha para acessar: ");

                leitor.nextLine();
                String senhaDeAcesso = leitor.nextLine();
                

                int contadorSenhasErradas = 0;

                while(!senhaDeAcesso.equals("ServidoresFTPK123")){
                    contadorSenhasErradas++;

                    if(contadorSenhasErradas == 3){

                        System.out.println("Numero de tentativas excedidas");
                        break;
                    }

                    System.out.println("Senha errada, digite novamente: ");
                    senhaDeAcesso = leitor.nextLine();
        

                }


                if(senhaDeAcesso.equals("ServidoresFTPK123")){

                    System.out.println("Digite o nome do Aluno que deseja cadastrar:");
                    flagNomeAluno = leitor.nextLine();
                   
                    System.out.println("Digite o Registro que deseja cadastrar: ");
                    flagRegistroAluno = leitor.nextLine();

                    temporario = new Aluno(flagNomeAluno,flagRegistroAluno);

                    criaLista.adicionaAluno(criaLista.alunosMatriculados, temporario);

                    System.out.println("\nAluno Cadastrado com sucesso!!");

                }


            }else if(flag ==6){


                //FUNCIONALIDADE PARA CADASTRAR MATRICULA; NAO SEI SE PRECISA, POR QUE NESSE CASO FICARIA MEIO CONFUSO SE CADASTRASSE SEPARADO DAS FUNCIONALIDADES ALUNO E MATERIAS;
                //ACHO QUE SERIA INTERESSANTE REAPROVEITAR A FUNCIONALIDADE DO ALUNO CADASTRADO E SOMENTE ADICIONAR A MATERIA QUE ELE CURSA. ENTÃO IMPRIMIRIAMOS UM "DIGITE A MATRICULA QUE 
                // DESEJA ACESSAR? E SE ENCONTRASSE, "DIGITE A MATERIA QUE DESEJA CADASTRA-LO" E "DIGITE AS DISCIPLINAS QUE ELE ESTÁ CURSANDO E AS SUAS RESPECTIVAS NOTAS. EX.: ALGORITMOS 20"

                  System.out.println("Digite o registro de Aluno para podermos localizá-lo:");

                    leitor.nextLine(); //limpar o buffer do teclado
                    flagRegistroAluno = leitor.nextLine(); // o flagRegistroAluno é para ler a string Registro aluno

                    temporario = criaLista.retornaAlunoMatriculado(criaLista.alunosMatriculados,flagRegistroAluno);

                    if(temporario != null){

                        System.out.print("Obaa, aluno encontrado. Agora digite a materia que deseja cadastrá-lo: ");
                        flagNomeMateria =leitor.nextLine();

                        temporarioMatricula = new Matricula(flagNomeMateria, temporario);
                        temporarioMatricula.setNotas();
                        
                        criaLista.adicionaMatricula(criaLista.matriculas, temporarioMatricula);

                        System.out.println("Matricula aceita");


                    }

                    



            }else if(flag == 7){

                verdade = false;
            }

        }


        leitor.close();
    }


}
