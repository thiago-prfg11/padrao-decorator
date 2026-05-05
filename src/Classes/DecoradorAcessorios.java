package Classes;

import Interfaces.Carro;

public abstract class DecoradorAcessorios implements Carro {

    protected Carro carro;

    public DecoradorAcessorios(Carro carro) {
        this.carro = carro;
    }

    @Override
    public String getDescricao() {
        return carro.getDescricao();
    }

    @Override
    public double getPreco() {
        return carro.getPreco();
    }

}
