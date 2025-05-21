import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import javax.swing.JOptionPane;

public class exe {
    public static void main(String[] args){


        
        String nome = JOptionPane.showInputDialog("digite seu nome aluno: ");
       
        String curso = JOptionPane.showInputDialog("digite seu curso: ");
        JOptionPane.showMessageDialog(null, "digite sua data de nascimento: ");
       String idades = JOptionPane.showInputDialog("digite sua data de nascimento ( yyyy-MM-dd)");

       DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
     LocalDate idade = LocalDate.parse(idades, formatter);   
       
  

        
        Aluno eu= new Aluno(nome,curso,idade);
          JOptionPane.showMessageDialog(null, "seu nome é: " + eu.nome+"\n"+
        "seu curso é: " + eu.curso +"\n "+ 
        "sua idade é:"  + eu.calcularIdade());
       String nomePRo = JOptionPane.showInputDialog("digite seu nome professor: ");
    String cursoPro = JOptionPane.showInputDialog("digite seu curso professor: ");

        String idadesPro = JOptionPane.showInputDialog("digite sua data de nascimento professor( yyyy-MM-dd)");

        LocalDate idadePro = LocalDate.parse(idades, formatter); 
        String disciplina = JOptionPane.showInputDialog("digite sua disciplina professor: ");
        Professor professor = new Professor(nomePRo, cursoPro, idadePro, disciplina);
  

    
     }
}
