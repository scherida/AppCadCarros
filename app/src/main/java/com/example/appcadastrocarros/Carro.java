package com.example.appcadastrocarros;

public class Carro {

    private String Marca;
    private String Modelo;
    private int AnoFab;
    private String Cor;
    private String Motor;
    private String Combustivel;
    private double ValorFipe;
    private Carro carro;

    public Carro(String marca, String modelo, int anoFab,
                 String cor, String motor, String combustivel,
                 Double valorFipe) {
        Marca = marca;
        Modelo = modelo;
        AnoFab = anoFab;
        Cor = cor;
        Motor = motor;
        Combustivel = combustivel;
        ValorFipe = valorFipe;
    }

    public Carro() {
    }

    public String getMarca() {
        return Marca;
    }

    public void setMarca(String marca) {
        Marca = marca;
    }

    public String getModelo() {
        return Modelo;
    }

    public void setModelo(String modelo) {
        Modelo = modelo;
    }

    public int getAnoFab() {
        return AnoFab;
    }

    public void setAnoFab(int anoFab) {
        AnoFab = anoFab;
    }

    public String getCor() {
        return Cor;
    }

    public void setCor(String cor) {
        Cor = cor;
    }

    public String getMotor() {
        return Motor;
    }

    public void setMotor(String motor) {
        Motor = motor;
    }

    public String getCombustivel() {
        return Combustivel;
    }

    public void setCombustivel(String combustivel) {
        Combustivel = combustivel;
    }

    public Double getValorFipe() {
        return ValorFipe;
    }

    public void setValorFipe(Double valorFipe) {
        ValorFipe = valorFipe;
    }

    public void SalvarCarro(Carro carro){
        this.carro = carro;
    }

    public Carro getCarro() {
        return carro;
    }

    @Override
    public String toString() {
        return "Carro{" +
                "Marca='" + Marca + '\'' +
                ", Modelo='" + Modelo + '\'' +
                ", AnoFab='" + AnoFab + '\'' +
                ", Cor='" + Cor + '\'' +
                ", Motor='" + Motor + '\'' +
                ", Combustivel='" + Combustivel + '\'' +
                ", ValorFipe=" + ValorFipe +
                '}';
    }

}
