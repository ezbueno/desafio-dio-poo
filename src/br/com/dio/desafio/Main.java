package br.com.dio.desafio;

import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

import java.time.LocalDate;
import java.util.Arrays;

public class Main {
    private static final String CONTEUDOS_INSCRITOS = "Conteúdos inscritos: ";
    private static final String CONTEUDOS_CONCLUIDOS = "Conteúdos concluídos: ";
    private static final String XP = "XP: ";

    public static void main(String[] args) {
        var c1 = new Curso();
        c1.setTitulo("Curso de Java");
        c1.setDescricao("Descrição do curso de Java");
        c1.setCargaHoraria(8);

        var c2 = new Curso();
        c2.setTitulo("Curso de JavaScript");
        c2.setDescricao("Descrição do curso de JavaScript");
        c2.setCargaHoraria(4);

        var mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria de Java");
        mentoria.setDescricao("Descrição da mentoria de Java");
        mentoria.setData(LocalDate.now());

        var bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição do Bootcamp Java Developer");
        bootcamp.getConteudos().addAll(Arrays.asList(c1, c2, mentoria));

        var dev1 = new Dev();
        dev1.setNome("Ezandro");
        dev1.inscreverBootcamp(bootcamp);
        System.out.println(CONTEUDOS_INSCRITOS + dev1.getConteudosInscritos());
        dev1.progredir();
        dev1.progredir();
        System.out.println("-");
        System.out.println(CONTEUDOS_INSCRITOS + dev1.getConteudosInscritos());
        System.out.println(CONTEUDOS_CONCLUIDOS + dev1.getConteudosConcluidos());
        System.out.println(XP + dev1.calcularTotalXP());

        System.out.println("-------------------");

        var dev2 = new Dev();
        dev2.setNome("Bueno");
        dev2.inscreverBootcamp(bootcamp);
        System.out.println(CONTEUDOS_INSCRITOS + dev2.getConteudosInscritos());
        dev2.progredir();
        dev2.progredir();
        dev2.progredir();
        System.out.println("-");
        System.out.println(CONTEUDOS_INSCRITOS + dev2.getConteudosInscritos());
        System.out.println(CONTEUDOS_CONCLUIDOS + dev2.getConteudosConcluidos());
        System.out.println(XP + dev2.calcularTotalXP());
    }
}
