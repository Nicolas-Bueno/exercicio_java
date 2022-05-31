import java.util.Scanner;

public class Media {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Informe a primeira nota: ");
        double nota1 = scan.nextDouble();

        System.out.println("Informe a segunda nota: ");
        double nota2 = scan.nextDouble();

        System.out.println("Informe a terceira nota: ");
        double nota3 = scan.nextDouble();

        double media = (nota1 + nota2 + nota3) / 3;

        if(media == 10) {
            System.out.println("Parabéns você foi aprovado com distincao! ");
        }else if(media >= 7){
            System.out.println("Parabéns você foi aprovado! ");
        }else {
            System.out.println("Infelizmente você não foi aprovado, não desanime e tente outra vez ");
        }

        scan.close();
    }
}
