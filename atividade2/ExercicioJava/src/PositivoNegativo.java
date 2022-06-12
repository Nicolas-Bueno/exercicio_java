import java.util.Scanner;

public class PositivoNegativo {
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);

        System.out.println("Informe um numero: ");
        int num = scan.nextInt();

        if(num > 0) {
            System.out.println("O numero que você digitou é POSITIVO" + num);
        }else{
            System.out.println("O numero que você digitou é NEGATIVO" + num);
        }
        
        scan.close();
    }    
}
