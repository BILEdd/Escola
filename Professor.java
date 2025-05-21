import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;

public class Professor extends Aluno {
    ArrayList<String> ministrarAula = new ArrayList<>();
    String disciplina;
    ArrayList<String> Formacoes = new ArrayList<>();
    public Professor(String nome, String curso, LocalDate idade, String disciplina) {
        super(nome, curso, idade);
        this.disciplina = disciplina;
    }
    @Override
    public void Aula(String aula) {
        this.ministrarAula.add(aula);
        System.out.println("ministrei " + aula);
    }

   @Override
    public String Aulas() {
        String aulasMinistradas = "";
        aulasMinistradas += ministrarAula + " ";
        return "eu ministrei essas " +aulasMinistradas;
    }


@Override
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
        @Override
        public String saudacao (Professor professor) {
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



 
}