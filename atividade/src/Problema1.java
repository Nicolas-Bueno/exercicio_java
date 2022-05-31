import java.util.Scanner;

public class Problema1 {
    public static void main(String[] args) {
    
        Scanner scan = new Scanner(System.in);

        String[] suite = new String[25];
        int numeroSuite;
        char opcao;
        boolean continuar = false;

        for(int i=0; i < suite.length; i++){
            suite[i] = "SUITE DESOCUPADA";
        }

        System.out.println("==== POUSADA NB ==== ");

        do{
            System.out.println("Insira qual o numero da suite: ");
            numeroSuite = scan.nextInt();
            System.out.println("A suite está ocupada ou desocupada:(L/O)");
            opcao = scan.next().charAt(0);

            if(numeroSuite == 25) {
                numeroSuite -= 1;
            }

            if(suite[numeroSuite] == "SUITE OCUPADA") {
                System.out.println("Suite ocupada já esta ocupada!");
                System.out.println("Deseja marca como livre: (L/O)");
                opcao = scan.next().charAt(0);
                
                if(opcao == 'L'){
                    suite[numeroSuite] = "SUITE DESOCUOPADA";
                }
            }

            if(opcao == 'O') {
                suite[numeroSuite] = "SUITE OCUPADA";
            }

            System.out.println("Deseja continuar: (S/N)");
            opcao = scan.next().charAt(0);

            if(opcao == 'S') {
                continuar = false;
            }else {
                continuar = true;
            }
    
        }while(!continuar);

        System.out.println("==== SUITES ====");
        for(int i=0; i < suite.length; i++){
            int p = i + 1;
            System.out.println("suite " + p + " ___ " + suite[i]);
        }

        scan.close();
    }
}
