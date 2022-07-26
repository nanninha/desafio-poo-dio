import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Mentoria;

import java.time.LocalDate;

public class Main {
    public static void main (String[] args){

        Curso curso1=new Curso();
        curso1.setTitulo("Java");
        curso1.setDescricao("aprendendo java");
        curso1.setCargaHoraria(8);

        Curso curso2=new Curso();
        curso2.setTitulo("Java");
        curso2.setDescricao("curso javascript");
        curso2.setCargaHoraria(4);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria Java");
        mentoria.setDescricao("descrição mentoria java");
        mentoria.setData(LocalDate.now());


        System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(mentoria);
    }
}
