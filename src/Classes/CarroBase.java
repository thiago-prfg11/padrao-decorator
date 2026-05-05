package Classes;

import Interfaces.Carro;

public class CarroBase implements Carro {
    private String modelo;
    private double precoBase;

    public CarroBase(String modelo, double precoBase) {
        this.modelo = modelo;
        this.precoBase = precoBase;
    }

    @Override
    public String getDescricao() {
        return modelo;
    }

    @Override
    public double getPreco() {
        return precoBase;
    }

}
