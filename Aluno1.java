

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

import javax.swing.JOptionPane;

public class Aluno1 {
        String nome;
    String curso;
    LocalDate idade;
    ArrayList <String> aulasAssistidas = new ArrayList<>();

    public Aluno1 (String nome, String curso , LocalDate idade){
        this.nome = nome;
        this.curso = curso;
        this.idade = idade;
    }




  public int calcularIdade() {
    return Period.between(idade, LocalDate.now()).getYears();
  }

public  void Aula(String aula) {
   
    this.aulasAssistidas.add(aula);
    System.err.println("eu assisti " + aula);
}

 public String Aulas(){
    String aulas = "";
    aulas += aulasAssistidas + " ";
    return "eu assisti essas" + aulas;
    
 }
 
 public String saudacao (Aluno aluno) {
    LocalTime horashow = LocalTime.now();
    int hora = horashow.getHour();

    if (hora >= 6 && hora <= 12 ) {
        return("Bom Dia Senhor "+ nome);           
        }
        else if (hora >= 13 && hora <= 18){ 
            return("boa tarde Senhor "+ nome);
        
        }
        else if (hora >= 19 && hora <= 23){
            return("Boa noite Senhor " +nome);
        } else {
            return("vá dormir Senhor " + nome);
        }
    }

 public String saudacao (Professor professor) {
    LocalTime horashow = LocalTime.now();
    int hora = horashow.getHour();

    if (hora >= 6 && hora <= 12 ) {
        return("Bom Dia "+ nome);           
        }
        else if (hora >= 13 && hora <= 18){ 
            return("boa tarde "+ nome);
        
        }
        else if (hora >= 19 && hora <= 23){
            return("Boa noite " +nome);
        } else {
            return("vá dormir " + nome);
        }
    
    }
    public static void main(String[] args) {

        JOptionPane.showMessageDialog(null, "digite seu nome: ");
        String nome = JOptionPane.showInputDialog("digite seu nome: ");
        JOptionPane.showMessageDialog(null, "digite seu curso: ");
        String curso = JOptionPane.showInputDialog("digite seu curso: ");
        JOptionPane.showMessageDialog(null, "digite sua data de nascimento: ");
       String idades = JOptionPane.showInputDialog("digite sua idadde (ano, mes, dia )");
       DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
     LocalDate idade = LocalDate.parse(idades, formatter);   
       Aluno1 eu = new Aluno1(nome, curso, idade);
  
       JOptionPane.showMessageDialog(null, "seu nome é: " + eu.nome+"\n"+
        "seu curso é: " + eu.curso +"\n "+ 
        "sua idade é:"  + eu.calcularIdade());



    }

}
