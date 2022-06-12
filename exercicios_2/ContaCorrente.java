/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercicios_2;

/**
 *
 * @author Nicolas
 */
public class ContaCorrente {
    private String cliente;
    private int numero;
    private double saldo;
    private double valorEspecialUsado;
    private boolean especial;
    private double limiteEspecial;

    public ContaCorrente() {
    }

    public ContaCorrente(String cliente, int numero, double saldo, double valorEspecialUsado, boolean especial, double limiteEspecial) {
        this.cliente = cliente;
        this.numero = numero;
        this.saldo = saldo;
        this.valorEspecialUsado = valorEspecialUsado;
        this.especial = especial;
        this.limiteEspecial = limiteEspecial;
    }

    /**
     * @return the cliente
     */
    public String getCliente() {
        return cliente;
    }

    /**
     * @param cliente the cliente to set
     */
    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    /**
     * @return the numero
     */
    public int getNumero() {
        return numero;
    }

    /**
     * @param numero the numero to set
     */
    public void setNumero(int numero) {
        this.numero = numero;
    }

    /**
     * @return the saldo
     */
    public double getSaldo() {
        return saldo;
    }

    /**
     * @param saldo the saldo to set
     */
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    /**
     * @return the valorEspecialUsado
     */
    public double getValorEspecialUsado() {
        return valorEspecialUsado;
    }

    /**
     * @param valorEspecialUsado the valorEspecialUsado to set
     */
    public void setValorEspecialUsado(double valorEspecialUsado) {
        this.valorEspecialUsado = valorEspecialUsado;
    }

    /**
     * @return the especial
     */
    public boolean isEspecial() {
        return especial;
    }

    /**
     * @param especial the especial to set
     */
    public void setEspecial(boolean especial) {
        this.especial = especial;
    }

    /**
     * @return the limiteEspecial
     */
    public double getLimiteEspecial() {
        return limiteEspecial;
    }

    /**
     * @param limiteEspecial the limiteEspecial to set
     */
    public void setLimiteEspecial(double limiteEspecial) {
        this.limiteEspecial = limiteEspecial;
    }
    
    public boolean saque(double saque){
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
    
  public void depositar(double deposito) {
        saldo += deposito;
        System.out.println("Você depositou +" + deposito);
    }
    
   public void verificarSaldo(){
        System.out.println("Seu saldo: " + saldo);
        if(especial){
            System.out.println("Sua conta é especial. ");
        }else {
            System.out.println("Sua conta não é especial. ");
        }
            
    }
    
    
    
}
