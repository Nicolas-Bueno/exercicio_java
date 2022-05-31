import java.util.Scanner;

public class Problema2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String[] homem = new String[5];
        String[] mulher = new String[5];
        String nome;
        char sexo;

        for(int i=0; i<5; i++) {
            System.out.println("Digite seu nome: ");
            nome = scan.next();
            System.out.println("Qual seu sexo: ");
            sexo = scan.next().charAt(0);
            
            if(sexo == 'F') {
                mulher[i] = nome;
            }else if(sexo == 'M') {
                homem[i] = nome;
            }
        }

        System.out.println("--- MULHERES ---");
        for(int i=0; i<5; i++) {
            if(mulher[i] != null) {
                System.out.println(mulher[i] + ", ");
            }
        }

        System.out.println("--- HOMENS ---");
        for(int i=0; i<5; i++) {
            if(homem[i] != null) {
                System.out.println(homem[i] + ", ");
            }  
        }

        scan.close();
    }
}
