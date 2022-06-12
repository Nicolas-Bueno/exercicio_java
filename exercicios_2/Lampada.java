/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercicios_2;

/**
 *
 * @author Nicolas
 */
public class Lampada {
    
    private String modelo;
    private String tensao;
    private int potencia;
    private String cor;
    private int garantiaMeses;
    private String[] tipos;
    private boolean ligada;
    
    public Lampada() {
    }

    public Lampada(String modelo, String tensao, int potencia, String cor, int garantiaMeses, String[] tipos, boolean ligada) {
        this.modelo = modelo;
        this.tensao = tensao;
        this.potencia = potencia;
        this.cor = cor;
        this.garantiaMeses = garantiaMeses;
        this.tipos = tipos;
        this.ligada = ligada;
    }

    /**
     * @return the modelo
     */
    public String getModelo() {
        return modelo;
    }

    /**
     * @param modelo the modelo to set
     */
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    /**
     * @return the tensao
     */
    public String getTensao() {
        return tensao;
    }

    /**
     * @param tensao the tensao to set
     */
    public void setTensao(String tensao) {
        this.tensao = tensao;
    }

    /**
     * @return the potencia
     */
    public int getPotencia() {
        return potencia;
    }

    /**
     * @param potencia the potencia to set
     */
    public void setPotencia(int potencia) {
        this.potencia = potencia;
    }

    /**
     * @return the cor
     */
    public String getCor() {
        return cor;
    }

    /**
     * @param cor the cor to set
     */
    public void setCor(String cor) {
        this.cor = cor;
    }

    /**
     * @return the garantiaMeses
     */
    public int getGarantiaMeses() {
        return garantiaMeses;
    }

    /**
     * @param garantiaMeses the garantiaMeses to set
     */
    public void setGarantiaMeses(int garantiaMeses) {
        this.garantiaMeses = garantiaMeses;
    }

    /**
     * @return the tipos
     */
    public String[] getTipos() {
        return tipos;
    }

    /**
     * @param tipos the tipos to set
     */
    public void setTipos(String[] tipos) {
        this.tipos = tipos;
    }

    /**
     * @return the ligada
     */
    public boolean isLigada() {
        return ligada;
    }

    /**
     * @param ligada the ligada to set
     */
    public void setLigada(boolean ligada) {
        this.ligada = ligada;
    }

    public void ligar(){
        setLigada(true);
    }
    
    public void desligar(){
         setLigada(false);
    }
    
    public void mostrarEstado(){
        if(isLigada()){
            System.out.println("Lâmpada está ligada !");
        }else{
            System.out.println("Lâmpada está apagada !");
        }
    }
    
    public void mudarEstado(){
        if(isLigada()){
            desligar();
        }else {
            ligar();
        }
    }

    
}
