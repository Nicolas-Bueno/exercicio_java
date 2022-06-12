/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercicios_2;

/**
 *
 * @author Nicolas
 */
public class Atv01 {
    public static void main(String[] args){
        Lampada lampada = new Lampada();
        
        // ligado
        lampada.ligar();
        lampada.mostrarEstado();
        
        // desligado
        lampada.desligar();
        lampada.mostrarEstado();
        
        lampada.mudarEstado();
        lampada.mostrarEstado();

        
    }
}
