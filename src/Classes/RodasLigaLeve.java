package Classes;

import Interfaces.Carro;

public class RodasLigaLeve extends DecoradorAcessorios {
    public RodasLigaLeve(Carro carro) {
        super(carro);
    }

    @Override
    public String getDescricao() {
        return carro.getDescricao() + " + Rodas de Liga Leve";
    }

    @Override
    public double getPreco() {
        return carro.getPreco() + 6000.00;
    }

}
