import java.util.Scanner;

public class problema4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String[][][] compromissos = new String[12][31][8];

        boolean sair = false;
        byte opcao;

        while(!sair) {

            System.out.println("Digite 1 para adicionar compromisso.");
            System.out.println("Digite 2 para verificar compromisso.");
            System.out.println("Digite 0 para sair.");

            opcao = scan.nextByte();

            if(opcao == 1) {
                boolean mesValido = false;
                int mes = 0;
                while(!mesValido) {
                    System.out.println("Entre com o mês: ");
                    mes = scan.nextInt();

                    if(mes > 0 && mes <= 12) {
                        mesValido = true;
                    }else {
                        System.out.println("Mes invalido, digite novamente");
                    }
                }

                boolean diaValido = false;
                int dia = 0;
                while(!diaValido) {
                    System.out.println("Entre com o dia do mês: ");
                    dia = scan.nextInt();

                    if(dia > 0 && dia <= 31) {
                        diaValido = true;
                    }else {
                        System.out.println("Dia invalido, digite novamente");
                    }
                }

                boolean horaValida = false;
                int hora = 0;
                while(!horaValida) {
                    System.out.println("Entre com a hora do compromisso ");
                    hora = scan.nextInt();

                    if(hora > 0 && hora <= 8) {
                        horaValida = true;
                    }else {
                        System.out.println("Hora invalida, digite novamente");
                    }
                }

                mes--;
                dia--;
                System.out.println("Digite o compromisso:");
                compromissos[mes][dia][hora] = scan.next();
          
            }else if(opcao == 2) {
                boolean mesValido = false;
                int mes = 0;
                while(!mesValido) {
                    System.out.println("Entre com o mês: ");
                    mes = scan.nextInt();

                    if(mes > 0 && mes <= 12) {
                        mesValido = true;
                    }else {
                        System.out.println("Mes invalido, digite novamente");
                    }
                }

                boolean diaValido = false;
                int dia = 0;
                while(!diaValido) {
                    System.out.println("Entre com o dia do mês: ");
                    dia = scan.nextInt();

                    if(dia > 0 && dia <= 31) {
                        diaValido = true;
                    }else {
                        System.out.println("Dia invalido, digite novamente");
                    }
                }

                boolean horaValida = false;
                int hora = 0;
                while(!horaValida) {
                    System.out.println("Entre com a hora do compromisso ");
                    hora = scan.nextInt();

                    if(hora > 0 && hora <= 8) {
                        horaValida = true;
                    }else {
                        System.out.println("Hora invalida, digite novamente");
                    }
                }

                mes--;
                dia--;
                System.out.println("O compromisso agendado é:");
                System.out.println(compromissos[mes][dia][hora]);
           
            }else if(opcao == 0) {
                sair = true;
            }else {
                System.out.println("Opcao invalida, digite novamente");
            }
        }

        scan.close();
    }
}