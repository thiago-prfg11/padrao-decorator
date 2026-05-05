package Classes;

import Interfaces.Carro;

public class BancoDeCouro extends DecoradorAcessorios {
    public BancoDeCouro(Carro carro) {
        super(carro);
    }

    @Override
    public String getDescricao() {
        return carro.getDescricao() + " + Banco de Couro";
    }

    @Override
    public double getPreco() {
        return carro.getPreco() + 4400.00;
    }

}