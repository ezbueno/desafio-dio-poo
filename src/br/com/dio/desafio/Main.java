package br.com.dio.desafio;

import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Mentoria;

import java.time.LocalDate;

public class Main {
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

        System.out.println(c1);
        System.out.println(c2);
        System.out.println(mentoria);
    }
}
