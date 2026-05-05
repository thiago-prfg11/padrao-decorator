package Classes;

import Interfaces.Carro;

public class Multimidia extends DecoradorAcessorios {
    public Multimidia(Carro carro) {
        super(carro);
    }

    @Override
    public String getDescricao() {
        return carro.getDescricao() + " + Multimidia";
    }

    @Override
    public double getPreco() {
        return carro.getPreco() + 5200.00;
    }

}
