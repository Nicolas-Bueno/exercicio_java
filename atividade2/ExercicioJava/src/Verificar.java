import java.util.Scanner;

public class Verificar {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Qual seu genero (F|M): ");
        char genero = scan.next().charAt(0);

        if(genero == 'F'){
            System.out.println("Seu genero è femenino ");
        }else if (genero == 'M') {
            System.out.println("Seu genero é masculino");
        }else {
            System.out.println("Erro 033 ");
        }
        
        scan.close();
    }
    
}
