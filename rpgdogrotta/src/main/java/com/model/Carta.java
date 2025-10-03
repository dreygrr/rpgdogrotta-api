package com.model;

import lombok.Data;

@Data
public class Carta {
    private String Nome;
    private float Vida;
    private float Dano;
    private String Foto;

    public Carta(String nome, float vida, float dano, String foto) {
        super();
        Nome = nome;
        Vida = vida;
        Dano = dano;
        Foto = foto;
    }
}
