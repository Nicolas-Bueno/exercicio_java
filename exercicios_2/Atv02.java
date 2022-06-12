/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercicios_2;

/**
 *
 * @author Nicolas
 */
public class Atv02 {
    public static void main (String[] args){
        ContaCorrente conta = new ContaCorrente();
        conta.setNumero(1234567);
        conta.setCliente("Nicolas");
        conta.setEspecial(true);
        conta.setValorEspecialUsado(0);
        conta.setSaldo(10);
        conta.setLimiteEspecial(1200);
        
        conta.saque(100);       
        conta.verificarSaldo();
        
        conta.depositar(950);   
        conta.verificarSaldo();
    }
}
