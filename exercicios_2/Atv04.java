/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercicios_2;

import java.util.Scanner;

/**
 *
 * @author Nicolas
 */
public class Atv04 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        JogoDaVelha jogoDaVelha = new JogoDaVelha();

        System.out.println("Jogador 1 --> X");
        System.out.println("Jogador 2 --> O");

        boolean ganhou = false;
        int linha = 0, coluna = 0;
        char sinal;

        while (!ganhou) {
            if (jogoDaVelha.vezJogador1()) {
                System.out.println("Vez do jogador 1");
                System.out.println("Escolha linha e coluna (1-3).");
                sinal = 'X';

            } else {
                System.out.println("Vez do jogador 2");
                System.out.println("Escolha linha e coluna (1-3).");
                sinal = 'O';
            }

            linha = valor("Linha", scan);
            coluna = valor("Coluna", scan);

            if (!jogoDaVelha.validarJogada(linha, coluna, sinal)) {
                System.out.println("Posição já usada, tente novamente");
            }

            jogoDaVelha.imprimirTabuleiro();

            if (jogoDaVelha.verificarGanhador('X')) {
                ganhou = true;
                System.out.println("Parabens, jogador 1 ganhou!");
            } else if (jogoDaVelha.verificarGanhador('O')) {
                ganhou = true;
                System.out.println("Parabens, jogador 2 ganhou!");
            } else if (jogoDaVelha.getJogada() > 9) {
                ganhou = true;
                System.out.println("Ninguém ganhou essa partida!");
            }
        }
    }
    
    static int valor(String tipoValor, Scanner scan) {
        int valor = 0;
        boolean valorValido = false;
        while (!valorValido) {
            System.out.println("Entre com a " + tipoValor + "(1, 2 ou 3)");
            valor = scan.nextInt();

            if (valor >= 1 && valor <= 3) {
                valorValido = true;
            } else {
                System.out.println("Entreda invalida, tente novamente");
            }
        }
        valor--;
        return valor;
    }
}
