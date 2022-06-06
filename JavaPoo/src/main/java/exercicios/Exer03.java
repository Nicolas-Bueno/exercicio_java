/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercicios;

import java.util.Scanner;

/**
 *
 * @author Nicolas
 */
public class Exer03 {
    public static void main(String[] args) {
        Aluno aluno = new Aluno();
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Entre com o nome do aluno:");
        aluno.nome = scan.nextLine();
        
        System.out.println("Entre com o nome do curso:");
        aluno.nomeCurso = scan.nextLine();
        
        System.out.println("Entre com o nome do matricula:");
        aluno.matricula = scan.next();
        
        aluno.nomeDiciplinas = new String[3];
        
        for(int i=0; i<aluno.nomeDiciplinas.length; i++){
            System.out.println("Entre com o nome da diciplina:" + (i+1));
            aluno.nomeDiciplinas[i] = scan.next();
        }
        
        aluno.notasDiciplinas = new double[3][4];
        for (int i=0; i< aluno.notasDiciplinas.length; i++){
            System.out.println("Obtendo notas da diciplina " + aluno.nomeDiciplinas[i]);
             for (int j=0; j<aluno.notasDiciplinas[i].length; j++){
                System.out.println("Entre com a nota " + (j+1));
                aluno.notasDiciplinas[i][j] = scan.nextDouble();
             }
        }
        
        aluno.mostrarInfo();
        
        for(int i=0; i<aluno.nomeDiciplinas.length; i++){
            if(aluno.verificarAprovado(i)){
                System.out.println("Diciplina " + aluno.nomeDiciplinas[i] + " - foi APROVADO");
            }else{
                System.out.println("Diciplina " + aluno.nomeDiciplinas[i] + " - foi REPROVADO");
            }
        }
    }
}
