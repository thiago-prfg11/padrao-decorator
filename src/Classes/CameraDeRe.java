package Classes;

import Interfaces.Carro;

public class CameraDeRe extends DecoradorAcessorios {
    public CameraDeRe(Carro carro) {
        super(carro);
    }

    @Override
    public String getDescricao() {
        return carro.getDescricao() + " + Câmera de Ré";
    }

    @Override
    public double getPreco() {
        return carro.getPreco() + 3000.00;
    }

}
