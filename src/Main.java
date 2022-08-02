import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
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


        /*System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(mentoria);*/
        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java");
        bootcamp.setDescricao("descrição bootcamp java");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devNana = new Dev();
        devNana.setNome("Nana");
        devNana.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos Incritos" + devNana.getConteudosInscritos());
        devNana.progredir();
        System.out.println("Conteudos Incritos" + devNana.getConteudosInscritos());
        System.out.println("Conteudos Concluidos" + devNana.getConteudosConcluidos());
        System.out.println("XP" + devNana.calcularTotalXp());

        Dev devRafa = new Dev();
        devRafa.setNome("Rafa");
        devRafa.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos Incritos" + devRafa.getConteudosInscritos());
        devRafa.progredir();
        devRafa.progredir();
        devRafa.progredir();
        System.out.println("Conteudos Incritos" + devRafa.getConteudosInscritos());

        System.out.println("Conteudos Concluidos" + devRafa.getConteudosConcluidos());

        System.out.println("XP" + devRafa.calcularTotalXp());
    }
}
