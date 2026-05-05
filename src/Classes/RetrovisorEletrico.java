package Classes;

import Interfaces.Carro;

public class RetrovisorEletrico extends DecoradorAcessorios {
    public RetrovisorEletrico(Carro carro) {
        super(carro);
    }

    @Override
    public String getDescricao() {
        return carro.getDescricao() + " + Retrovisor Elétrico";
    }

    @Override
    public double getPreco() {
        return carro.getPreco() + 7850.00;
    }

}
