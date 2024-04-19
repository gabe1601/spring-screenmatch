package br.com.alura.screenmatch.model;

import com.fasterxml.jackson.annotation.JsonAlias;

import java.util.OptionalDouble;

public class Serie {

    private String titulo;
    private Integer totalTemporadas;
    private Categoria genero;
    private String atores;
    private String imagem;
    private String sinopse;
    private double avaliacao;

    public Serie(DadosSerie dadosSerie){
        this.titulo= dadosSerie.titulo();
        this.totalTemporadas = dadosSerie.totalTemporadas();
        this.atores = dadosSerie.atores();
        this.imagem = dadosSerie.imagem();
        this.sinopse= dadosSerie.sinopse();
        this.avaliacao = OptionalDouble.of(Double.valueOf(dadosSerie.avaliacao())).orElse(0);
        this.genero = Categoria.fromString(dadosSerie.genero().split(",")[0].trim());
    }

}
