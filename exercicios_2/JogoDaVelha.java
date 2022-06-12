/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercicios_2;

/**
 *
 * @author Nicolas
 */
public class JogoDaVelha {
   private char[][] jogoVelha;
   private int jogada;

    public JogoDaVelha() {
        jogoVelha = new char [3][3];
        jogada = 1;
    }

    /**
     * @return the jogoVelha
     */
    public char[][] getJogoVelha() {
        return jogoVelha;
    }

    /**
     * @param jogoVelha the jogoVelha to set
     */
    public void setJogoVelha(char[][] jogoVelha) {
        this.jogoVelha = jogoVelha;
    }

    /**
     * @return the jogada
     */
    public int getJogada() {
        return jogada;
    }

    /**
     * @param jogada the jogada to set
     */
    public void setJogada(int jogada) {
        this.jogada = jogada;
    }
    
    public boolean validarJogada(int linha, int coluna, char sinal) {
        if (jogoVelha[linha][coluna] == sinal || jogoVelha[linha][coluna] == 'O') {
            System.out.println("Posicao já usada tente novamente");
            return false;

        } else { // jogada valida
            jogoVelha[linha][coluna] = sinal;
            jogada++;
            return true;
        }
    }
    
    public void imprimirTabuleiro() {
        for (int i = 0; i < jogoVelha.length; i++) {
            for (int j = 0; j < jogoVelha[i].length; j++) {
                System.out.print(jogoVelha[i][j] + " | ");
            }
            System.out.println();
        }
    }
    
   public boolean verificarGanhador(char sinal) {
        if ((jogoVelha[0][0] == sinal && jogoVelha[0][1] == sinal && jogoVelha[0][2] == sinal)
                || //LINHA 1
                (jogoVelha[1][0] == sinal && jogoVelha[1][1] == sinal && jogoVelha[1][2] == sinal)
                || //LINHA 2
                (jogoVelha[2][0] == sinal && jogoVelha[2][1] == sinal && jogoVelha[2][2] == sinal)
                || //LINHA 3
                (jogoVelha[0][0] == sinal && jogoVelha[1][0] == sinal && jogoVelha[2][0] == sinal)
                || //COLUNA 1
                (jogoVelha[0][1] == sinal && jogoVelha[1][1] == sinal && jogoVelha[2][1] == sinal)
                || //COLUNA 2
                (jogoVelha[0][2] == sinal && jogoVelha[1][2] == sinal && jogoVelha[2][2] == sinal)
                || //COLUNA 3
                (jogoVelha[0][0] == sinal && jogoVelha[1][1] == sinal && jogoVelha[2][2] == sinal) //DIAGONAL
                ) {
            return true;
        }
        return false;
    }
    
    public boolean vezJogador1(){
        if(jogada % 2 == 1){
            return true;
        }
        return false;
    }

   
}
