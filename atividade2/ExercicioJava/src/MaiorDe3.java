import java.util.Scanner;

public class MaiorDe3 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Informe um numero: ");
        int num1 = scan.nextInt();

        System.out.println("Informe outro numero: ");
        int num2 = scan.nextInt();

        System.out.println("Informe outro numero: ");
        int num3 = scan.nextInt();

        if(num1 > num2 && num1 > num3) {
            System.out.println("Seu maior numero é " + num1 );
        }else if(num2 > num1 && num2 > num3) {
            System.out.println("Seu maior numero é " + num2 );
        }else{
            System.out.println("Seu maior numero é " + num3 );
        }

        scan.close();
        
    }
}
