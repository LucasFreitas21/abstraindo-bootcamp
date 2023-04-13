import br.com.dio.desafio.dominio.*;

import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("Curso Java");
        curso1.setDescricao("Descrição do curso de Java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("Curso JavaScript");
        curso2.setDescricao("Descrição do curso de JavaScript");
        curso2.setCargaHoraria(5);


        Mentoria mentoria1 = new Mentoria();
        mentoria1.setTitulo("Mentoria Java");
        mentoria1.setDescricao("Descrição da mentoria");
        mentoria1.setData(LocalDate.now());

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria1);

        Dev devLucas = new Dev();
        devLucas.setNome("Lucas");
        devLucas.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos inscritos Dev Lucas: " + devLucas.getConteudosInscritos());
        devLucas.progressoBootcamp();
        System.out.println("-");
        System.out.println("Conteúdos inscritos Dev Lucas: " + devLucas.getConteudosInscritos());
        System.out.println("Conteúdos concluídos Dev Lucas: " + devLucas.getConteudosConcluido());
        System.out.println("XP: " + devLucas.calcularTotalXp());

        System.out.println("-------------------");

        Dev devDavi = new Dev();
        devDavi.setNome("Davi");
        devDavi.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos inscritos Dev Davi: " + devDavi.getConteudosInscritos());
        devDavi.progressoBootcamp();
        devDavi.progressoBootcamp();
        devDavi.progressoBootcamp();
        System.out.println("-");
        System.out.println("Conteúdos inscritos Dev Davi: " + devDavi.getConteudosInscritos());
        System.out.println("Conteúdos concluídos Dev Davi: " + devDavi.getConteudosConcluido());
        System.out.println("XP: " + devDavi.calcularTotalXp());



    }
}
