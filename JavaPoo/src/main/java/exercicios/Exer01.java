/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercicios;

/**
 *
 * @author Nicolas
 */
public class Exer01 {
    public static void main(String[] args){
        Lampada lampada = new Lampada();
        
        lampada.modelo = "Rsmart";
        lampada.cor = "Branca";
        lampada.garantiaMeses = 6;
        lampada.potencia = 9;
        lampada.tensao = " bivolte";
        lampada.tipos = new String[3];
        lampada.tipos[0] = "Abajur";
        lampada.tipos[1] = "Lampioes";
        lampada.tipos[2] = "Led";
        
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
