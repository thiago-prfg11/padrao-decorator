package Testes;

import Classes.*;
import Interfaces.Carro;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CarroTeste {

    @Test
    void carroBaseDeveTerDescricaoCorreta() {
        Carro carro = new CarroBase("Onix LT", 75000.00);
        assertEquals("Onix LT", carro.getDescricao());
    }

    @Test
    void carroBaseDeveTerPrecoCorreto() {
        Carro carro = new CarroBase("Onix LT", 75000.00);
        assertEquals(75000.00, carro.getPreco());
    }

    @Test
    void deveAdicionarArCondicionado() {
        Carro carro = new ArCondicionado(new CarroBase("Onix LT", 75000.00));
        assertEquals("Onix LT + Ar Condicionado", carro.getDescricao());
        assertEquals(77500.00, carro.getPreco());
    }

    @Test
    void deveAdicionarBancoDeCouro() {
        Carro carro = new BancoDeCouro(new CarroBase("Onix LT", 75000.00));
        assertEquals("Onix LT + Banco de Couro", carro.getDescricao());
        assertEquals(79400.00, carro.getPreco());
    }

    @Test
    void deveAdicionarCameraDeRe() {
        Carro carro = new CameraDeRe(new CarroBase("Onix LT", 75000.00));
        assertEquals("Onix LT + Câmera de Ré", carro.getDescricao());
        assertEquals(78000.00, carro.getPreco());
    }

    @Test
    void deveAdicionarMultimidia() {
        Carro carro = new Multimidia(new CarroBase("Onix LT", 75000.00));
        assertEquals("Onix LT + Multimidia", carro.getDescricao());
        assertEquals(80200.00, carro.getPreco());
    }

    @Test
    void deveAdicionarRetrovisorEletrico() {
        Carro carro = new RetrovisorEletrico(new CarroBase("Onix LT", 75000.00));
        assertEquals("Onix LT + Retrovisor Elétrico", carro.getDescricao());
        assertEquals(82850.00, carro.getPreco());
    }

    @Test
    void deveAdicionarRodasLigaLeve() {
        Carro carro = new RodasLigaLeve(new CarroBase("Onix LT", 75000.00));
        assertEquals("Onix LT + Rodas de Liga Leve", carro.getDescricao());
        assertEquals(81000.00, carro.getPreco());
    }

    @Test
    void deveAdicionarTravasEletricas() {
        Carro carro = new TravasEletricas(new CarroBase("Onix LT", 75000.00));
        assertEquals("Onix LT + Travas Elétricas", carro.getDescricao());
        assertEquals(75800.00, carro.getPreco());
    }

    @Test
    void deveAdicionarVidrosEletricos() {
        Carro carro = new VidrosEletricos(new CarroBase("Onix LT", 75000.00));
        assertEquals("Onix LT + Vidros Elétricos", carro.getDescricao());
        assertEquals(76720.00, carro.getPreco());
    }

    @Test
    void deveComporMultiplosAcessorios() {
        Carro carro = new ArCondicionado(
                new BancoDeCouro(
                        new VidrosEletricos(
                                new CarroBase("Onix LT", 75000.00))));
        assertEquals("Onix LT + Vidros Elétricos + Banco de Couro + Ar Condicionado", carro.getDescricao());
        assertEquals(83620.00, carro.getPreco());
    }

    @Test
    void deveTerPrecoAcumuladoCorretamenteComTodosOsAcessorios() {
        Carro carro = new ArCondicionado(
                new BancoDeCouro(
                        new CameraDeRe(
                                new Multimidia(
                                        new RetrovisorEletrico(
                                                new RodasLigaLeve(
                                                        new TravasEletricas(
                                                                new VidrosEletricos(
                                                                        new CarroBase("Onix LT", 75000.00)))))))));
        assertEquals(106470.00, carro.getPreco());
    }
}