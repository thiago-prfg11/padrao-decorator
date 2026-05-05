package Classes;

import Interfaces.Carro;

public class TravasEletricas extends DecoradorAcessorios {
    public TravasEletricas(Carro carro) {
        super(carro);
    }

    @Override
    public String getDescricao() {
        return carro.getDescricao() + " + Travas Elétricas";
    }

    @Override
    public double getPreco() {
        return carro.getPreco() + 800.00;
    }

}
