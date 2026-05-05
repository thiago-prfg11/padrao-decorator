package Classes;

import Interfaces.Carro;

public class VidrosEletricos extends DecoradorAcessorios {
    public VidrosEletricos(Carro carro) {
        super(carro);
    }

    @Override
    public String getDescricao() {
        return carro.getDescricao() + " + Vidros Elétricos";
    }

    @Override
    public double getPreco() {
        return carro.getPreco() + 1720.00;
    }

}
