/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercicios;

/**
 *
 * @author Nicolas
 */
public class Aluno {
    String nome;
    String matricula;
    String nomeCurso;
    String[] nomeDiciplinas;
    double[][] notasDiciplinas;
    
    boolean verificarAprovado(int indice){
       double soma = 0;
        for(int i=0; i<notasDiciplinas[indice].length; i++){
            soma+= notasDiciplinas[indice][i];
        }
        double media = soma / 4;
        
        if(media >= 7){
            return true;
        }
        return false;
    }
    
    
    
    void mostrarInfo(){
      System.out.println("Nome: " + nome);
      System.out.println("Matrícula: " + matricula);
      System.out.println("Nome do curso "+ nomeCurso);
      
      for(int i=0; i<notasDiciplinas.length; i++){
        System.out.println("Notas da diciplina " + nomeDiciplinas[i]);
        for (int j=0; j<notasDiciplinas[i].length; j++){
            System.out.print(notasDiciplinas[i][j] + " ");
        }
           System.out.println();
      }
    }
    
    
    
}
