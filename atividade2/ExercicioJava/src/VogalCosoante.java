import java.util.Scanner;

public class VogalCosoante {
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);

        System.out.println("Digite uma letra");
        char letra = scan.nextLine().charAt(0);

        switch (letra) {
            case 'a':
                System.out.println("Você digitou uma vogal " + letra);
            break;
            case 'e':
                System.out.println("Você digitou uma vogal " + letra);
            break;
            case 'i':
                System.out.println("Você digitou uma vogal " + letra);
            break;
            case 'o':
                System.out.println("Você digitou uma vogal " + letra);
            break;
            case 'u':
                System.out.println("Você digitou uma vogal " + letra);
            break;

            default: 
                System.out.println("Você digitou uma cosoante! ");
        }

        scan.close();
    }
}
