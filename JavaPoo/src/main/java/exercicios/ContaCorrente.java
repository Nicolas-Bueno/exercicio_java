/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercicios;

/**
 *
 * @author Nicolas
 */
public class ContaCorrente {
    String cliente;
    int numero;
    double saldo;
    double valorEspecialUsado;
    boolean especial;
    double limiteEspecial;
    
    boolean saque(double saque){
        if(saldo >= saque) {
            System.out.println("Você tem saldo de " + saldo);
            saldo -= saque;
            System.out.println("Você sacou: -" + saque);
            return true;
        }else {
            if(especial){
                double limite = limiteEspecial + saldo;
                if(limite >= saque){
                    saldo -= saque;
                    return true;
                }else{
                    System.out.println("Saldo insuficiente " + saldo);
                    return false;
                }
            }else {
                System.out.println("Saldo insuficiente " + saldo);
                return false;
            }
        }
    }
    
    void depositar(double deposito) {
        saldo += deposito;
        System.out.println("Você depositou +" + deposito);
    }
    
    void verificarSaldo(){
        System.out.println("Seu saldo: " + saldo);
        if(especial){
            System.out.println("Sua conta é especial. ");
        }else {
            System.out.println("Sua conta não é especial. ");
        }
            
    }
    
}
