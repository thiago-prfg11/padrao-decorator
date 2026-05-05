package Classes;

import Interfaces.Carro;

public class ArCondicionado extends DecoradorAcessorios {
    public ArCondicionado(Carro carro) {
        super(carro);
    }

    @Override
    public String getDescricao() {
        return carro.getDescricao() + " + Ar Condicionado";
    }

    @Override
    public double getPreco() {
        return carro.getPreco() + 2500.00;
    }

}
