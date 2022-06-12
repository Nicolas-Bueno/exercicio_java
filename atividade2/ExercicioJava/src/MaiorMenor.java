import java.util.Scanner;

public class MaiorMenor {
    public static void main (String [] args) { 
    
    Scanner scan = new Scanner(System.in);

    System.out.println("Informe um número: ");
    int num1 = scan.nextInt();

    System.out.println("Informe outro numero");
    int num2 = scan.nextInt();

    if(num1 > num2) {
        System.out.println("Numero maior " + num1);
    }else {
        System.out.println("Numero maior " + num2);
    }

    scan.close();

}
}
