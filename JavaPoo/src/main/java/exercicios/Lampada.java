/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercicios;

/**
 *
 * @author Nicolas
 */
public class Lampada {
    
    String modelo;
    String tensao;
    int potencia;
    String cor;
    int garantiaMeses;
    String[] tipos;
    
    boolean ligada;
    
    void ligar(){
        ligada = true;
    }
    
    void desligar(){
        ligada = false;
    }
    
    void mostrarEstado(){
        if(ligada){
            System.out.println("Lâmpada está ligada !");
        }else{
            System.out.println("Lâmpada está apagada !");
        }
    }
    
    void mudarEstado(){
        if(ligada){
            desligar();
        }else {
            ligar();
        }
    }
    
}
