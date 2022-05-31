import java.util.Scanner;

public class Problema3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int opcao;
        String[] hospede = new String[15];
        String nome;

        for(int i=0; i<15; i++){
            hospede[i] = "";
        }

        System.out.println("======== Bem vindo  ========");
        System.out.println("======== Pousada NB ========");
        System.out.println("-------- Menu --------");

        for(int i=0; i<15; i++) {
            System.out.println("(1)cadastrar | (2)pesquisar | (3)sair");
            opcao = scan.nextInt();

            switch(opcao) {
                case 1:
                    System.out.println("Informe o nome para o cadastro: ");
                    hospede[i] = scan.next();
                    System.out.println(hospede[i] + " cadastrado com sucesso!");
                break;

                case 2:
                    System.out.println("Informe o nome do hospede: ");
                    nome = scan.next();
                    boolean achou = false;

                    for(int j=0; j<15; j++) {
                        if(hospede[j].equalsIgnoreCase(nome)) {
                            System.out.println("Hospede " + nome + " encontrado !");
                            achou = true;
                            break;
                        }
                    }
                    if(achou == false){
                        System.out.println("Hospede nao encontrado em nosso cadastro !");
                        break;
                    }
                break;
            }

            if(opcao == 3) {
                System.out.println("Programa encerrado");
                break;
            }

        }

        scan.close();

    }
}
