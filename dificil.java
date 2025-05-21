import java.time.LocalTime;
import java.util.Scanner;

public class dificil {
    public static void main(String[] args) {
         LocalTime horashow = LocalTime.now();
         Scanner scanner = new Scanner(System.in);


        System.out.println("Seu nome");
         String nome = scanner.nextLine();

        System.out.println("sua idade");
         int idade = scanner.nextInt();

         System.out.println("Seu curso");
         String curso = scanner.nextLine();
        
        System.out.println("suas aulas");
         String aulas_assistidas = scanner.nextLine(); 
        
         System.out.println("Aluno:\n" +
         "nome;" + nome+"\n" +
         "idade:" + idade + "\n"+
         "curso" + curso + "\n" +
         "Quantidade de aulas" + aulas_assistidas + "\n");

        int hora = horashow.getHour();

      
    }
public class comprimento extends dificil {
    LocalTime horashow = LocalTime.now();
    int hora = horashow.getHour();

    

    if (hora >= 6 && hora <= 12 ) {
        System.out.printf("Bom Dia", nome);           
        }
        else if (hora >= 13 && hora <= 18){
            System.out.printf("boa tarde", nome);
        
        }
        else if (hora >= 19 && hora <= 23){
            System.out.printf("Boa noite", nome);
        } else {
           System.out.printf("vá dormir", nome);
        }

}
}
