import java.util.Scanner;

public class JogoDaVelha {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        char[][] jogoVelha = new char[3][3];

        System.out.println("Jogador 1 --> X");
        System.out.println("Jogador 2 --> O");

        boolean ganhou = false;
        int linha = 0, coluna = 0; 
        int jogada = 1;
        char sinal;

        while(!ganhou) {
            if(jogada % 2 == 1) { //jogador1
                System.out.println("Vez do jogador 1");
                System.out.println("Escolha linha e coluna (1-3).");
                sinal = 'X';

            }else{
                System.out.println("Vez do jogador 2");
                System.out.println("Escolha linha e coluna (1-3).");
                sinal = 'O';
            }

            boolean linhaValida = false;
            while(!linhaValida) {
                System.out.println("Entre com a linha (1, 2 ou 3)");
                linha = scan.nextInt();
                
                if(linha >= 1 && linha <=3){
                    linhaValida = true;
                }else{
                    System.out.println("Entreda invalida, tente novamente");
                }
            }

            boolean colunaValida = false;
            while(!colunaValida) {
                System.out.println("Entre com a coluna (1, 2 ou 3)");
                coluna = scan.nextInt();
                
                if(coluna >= 1 && coluna <=3){
                    colunaValida = true;
                }else{
                    System.out.println("Entrada invalida, tente novamente");
                }
            }
            
            linha--;
            coluna--;

            if(jogoVelha[linha][coluna] == 'X' || jogoVelha[linha][coluna] == 'O') {
                System.out.println("Posicao ja usada tente novamente");
            }else {// jogada valida
                jogoVelha[linha][coluna] = sinal;
                jogada++;
            }

            //tabuleiro
            for(int i=0; i < jogoVelha.length; i++) {
                for(int j=0; j< jogoVelha[i].length; j++){
                    System.out.print(jogoVelha[i][j] + "  |  ");
                }
                System.out.println();
            }

            //verificar se ganhou
            if(
            (jogoVelha[0][0] == 'X' && jogoVelha[0][1] == 'X' && jogoVelha[0][2] == 'X') ||  //LINHA 1
            (jogoVelha[1][0] == 'X' && jogoVelha[1][1] == 'X' && jogoVelha[1][2] == 'X') ||  //LINHA 2
            (jogoVelha[2][0] == 'X' && jogoVelha[2][1] == 'X' && jogoVelha[2][2] == 'X') ||  //LINHA 3
            (jogoVelha[0][0] == 'X' && jogoVelha[1][0] == 'X' && jogoVelha[2][0] == 'X') ||  //COLUNA 1
            (jogoVelha[0][1] == 'X' && jogoVelha[1][1] == 'X' && jogoVelha[2][1] == 'X') ||  //COLUNA 2
            (jogoVelha[0][2] == 'X' && jogoVelha[1][2] == 'X' && jogoVelha[2][2] == 'X') ||  //COLUNA 3
            (jogoVelha[0][0] == 'X' && jogoVelha[1][1] == 'X' && jogoVelha[2][2] == 'X')     //DIAGONAL
            ){
                ganhou = true;
                System.out.println("Parabens, jogador 1 GANHOU !");
            } else if (
                (jogoVelha[0][0] == 'O' && jogoVelha[0][1] == 'O' && jogoVelha[0][2] == 'O') ||  //LINHA 1
                (jogoVelha[1][0] == 'O' && jogoVelha[1][1] == 'O' && jogoVelha[1][2] == 'O') ||  //LINHA 2
                (jogoVelha[2][0] == 'O' && jogoVelha[2][1] == 'O' && jogoVelha[2][2] == 'O') ||  //LINHA 3
                (jogoVelha[0][0] == 'O' && jogoVelha[1][0] == 'O' && jogoVelha[2][0] == 'O') ||  //COLUNA 1
                (jogoVelha[0][1] == 'O' && jogoVelha[1][1] == 'O' && jogoVelha[2][1] == 'O') ||  //COLUNA 2
                (jogoVelha[0][2] == 'O' && jogoVelha[1][2] == 'O' && jogoVelha[2][2] == 'O') ||  //COLUNA 3
                (jogoVelha[0][0] == 'O' && jogoVelha[1][1] == 'O' && jogoVelha[2][2] == 'O')     //DIAGONAL
            ){
                ganhou = true;
                System.out.println("Parabens, jogador 2 GANHOU !");
            } else if ( jogada > 9){
                ganhou = true;
                System.out.println("Deu velha tente novamente! ");
            }
        }
        scan.close();
    }
}
