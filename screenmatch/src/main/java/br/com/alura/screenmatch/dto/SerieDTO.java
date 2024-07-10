package br.com.alura.screenmatch.dto;

import br.com.alura.screenmatch.model.Categoria;
import jakarta.persistence.Column;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;

public record SerieDTO(Long id,
                       String titulo,
                       Integer totalTemporadas,
                       Categoria genero,
                       String atores,
                       String imagem,
                       String sinopse,
                       double avaliacao) {
}
