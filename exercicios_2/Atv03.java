/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercicios_2;

import java.util.Scanner;

/**
 *
 * @author Nicolas
 */
public class Atv03 {
     public static void main(String[] args) {
        Aluno aluno = new Aluno();
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Entre com o nome do aluno:");
        aluno.setNome(scan.nextLine());
        
        System.out.println("Entre com o nome do curso:");
        aluno.setNomeCurso(scan.nextLine());
        
        System.out.println("Entre com o nome do matricula:");
        aluno.setMatricula(scan.next());
        
        
        for(int i=0; i<aluno.getNomeDiciplinas().length; i++){
            System.out.println("Entre com o nome da diciplina:" + (i+1));
            aluno.setNomeDiciplinaPos(i, scan.next());
        }
        
        for (int i=0; i< aluno.getNotasDiciplinas().length; i++){
            System.out.println("Obtendo notas da diciplina " + aluno.getNomeDiciplinas()[i]);
             for (int j=0; j<aluno.getNotasDiciplinas()[i].length; j++){
                System.out.println("Entre com a nota " + (j+1));
                aluno.setNomePosIJ(i, j, scan.nextDouble());
             }
        }
        
        aluno.mostrarInfo();
        
        for(int i=0; i<aluno.getNomeDiciplinas().length; i++){
            if(aluno.verificarAprovado(i)){
                System.out.println("Diciplina " + aluno.getNomeDiciplinas()[i] + " - foi APROVADO");
            }else{
                System.out.println("Diciplina " + aluno.getNomeDiciplinas()[i] + " - foi REPROVADO");
            }
        }
    }
}
