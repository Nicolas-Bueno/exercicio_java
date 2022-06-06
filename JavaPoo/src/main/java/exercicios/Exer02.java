/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercicios;

/**
 *
 * @author Nicolas
 */
public class Exer02 {
    public static void main (String[] args){
        ContaCorrente conta = new ContaCorrente();
        conta.cliente = "Nicolas";
        conta.numero = 1234567;
        conta.especial = true;
        conta.valorEspecialUsado = 0;
        conta.saldo = 10;
        conta.limiteEspecial = 1200;
        
        conta.saque(100);       
        conta.verificarSaldo();
        
        conta.depositar(950);   
        conta.verificarSaldo();
    }
    
            
}
