import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Period;
import java.util.ArrayList;
import java.util.Scanner;

public class Aluno {

    String nome;
    String curso;
    LocalDate idade;
    ArrayList <String> aulasAssistidas = new ArrayList<>();

    public Aluno (String nome, String curso , LocalDate idade){
        this.nome = nome;
        this.curso = curso;
        this.idade = idade;
    }
 /*
  public Aluno (Scanner leitor) {
    System.out.println("digite seu nome: ");
    String nome = leitor.nextLine();
    System.out.println("digite seu curso: ");
    String curso = leitor.nextLine();
    System.out.println("digite seu idade: "); 
    idade = Integer.parseInt(leitor.nextLine());

} 
  */
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

}
