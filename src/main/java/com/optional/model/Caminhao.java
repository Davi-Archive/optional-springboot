package com.optional.model;

public class Caminhao {
    private String modelo;
    private String seguro;

    public Caminhao(String modelo, String seguro) {
        this.modelo = modelo;
        this.seguro = seguro;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getSeguro() {
        return seguro;
    }

    public void setSeguro(String seguro) {
        this.seguro = seguro;
    }
}
