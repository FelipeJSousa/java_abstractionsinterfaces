public class Carro extends Veiculo{

    @Override
    public String ObterNome() {
        return "Carro - " + getNome();
    }

    @Override
    public String ObterModelo() {
        return "Carro - " + getModelo();
    }
}
