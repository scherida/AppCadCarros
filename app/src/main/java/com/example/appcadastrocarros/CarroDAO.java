package com.example.appcadastrocarros;

public class CarroDAO {

    private static Carro carro = new Carro();

    public void save(Carro carro){
        this.carro = carro;
    }

    public Carro getCarro(){
        return carro;
    }

}
