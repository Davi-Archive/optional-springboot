package com.optional.model;

public class Motorista {

    private String name;
    private Integer idade;
    private Caminhao caminhao;

    public Motorista(String name, Integer idade, Caminhao caminhao) {
        this.name = name;
        this.idade = idade;
        this.caminhao = caminhao;
    }

    public Integer getIdade() {
        return idade;
    }

    public void setIdade(Integer idade) {
        this.idade = idade;
    }

    public Caminhao getCaminhao() {
        return caminhao;
    }

    public void setCaminhao(Caminhao caminhao) {
        this.caminhao = caminhao;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
