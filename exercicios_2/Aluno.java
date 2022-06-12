/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercicios_2;

/**
 *
 * @author Nicolas
 */
public class Aluno {
    
   private String nome;
   private String matricula;
   private String nomeCurso;
   private String[] nomeDiciplinas;
   private double[][] notasDiciplinas;

    public Aluno() {
        nomeDiciplinas = new String[3];
        notasDiciplinas = new double[3][4];
    }

    public Aluno(String nome, String matricula, String nomeCurso, String[] nomeDiciplinas, double[][] notasDiciplinas) {
        this.nome = nome;
        this.matricula = matricula;
        this.nomeCurso = nomeCurso;
        this.nomeDiciplinas = new String[3];
        this.notasDiciplinas = new double[3][4];
    }

    /**
     * @return the nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * @return the matricula
     */
    public String getMatricula() {
        return matricula;
    }

    /**
     * @param matricula the matricula to set
     */
    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    /**
     * @return the nomeCurso
     */
    public String getNomeCurso() {
        return nomeCurso;
    }

    /**
     * @param nomeCurso the nomeCurso to set
     */
    public void setNomeCurso(String nomeCurso) {
        this.nomeCurso = nomeCurso;
    }

    /**
     * @return the nomeDiciplinas
     */
    public String[] getNomeDiciplinas() {
        return nomeDiciplinas;
    }

    /**
     * @param nomeDiciplinas the nomeDiciplinas to set
     */
    public void setNomeDiciplinas(String[] nomeDiciplinas) {
        this.nomeDiciplinas = nomeDiciplinas;
    }

    /**
     * @return the notasDiciplinas
     */
    public double[][] getNotasDiciplinas() {
        return notasDiciplinas;
    }

    /**
     * @param notasDiciplinas the notasDiciplinas to set
     */
    public void setNotasDiciplinas(double[][] notasDiciplinas) {
        this.notasDiciplinas = notasDiciplinas;
    }
    
    public void mostrarInfo(){
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
    
    public boolean verificarAprovado(int indice){
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
    
    public void setNomeDiciplinaPos(int pos, String nomeDiciplina){
        this.nomeDiciplinas[pos] = nomeDiciplina;
    }
    
    public void setNomePosIJ(int posI, int posJ, double nota){
        this.notasDiciplinas[posI][posJ]= nota;
    }
   
   
}
