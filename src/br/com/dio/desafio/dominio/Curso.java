package br.com.dio.desafio.dominio;

public class Curso extends Conteudo {
    private Integer cargaHoraria;

    public Integer getCargaHoraria() {
        return this.cargaHoraria;
    }

    public void setCargaHoraria(Integer cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

    @Override
    public double calcularXP() {
        return XP_PADRAO * this.getCargaHoraria();
    }

    @Override
    public String toString() {
        return super.toString() + "Carga horária: " + this.getCargaHoraria();
    }
}
