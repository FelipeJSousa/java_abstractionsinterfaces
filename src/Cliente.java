import java.util.List;

public class Cliente extends Pessoa implements ICliente{

    private List<IVeiculo> Veiculo;

    public List<IVeiculo> getVeiculo() {
        return Veiculo;
    }

    public void setVeiculo(List<IVeiculo> veiculo) {
        Veiculo = veiculo;
    }

    @Override
    public void AdicionarVeiculo(IVeiculo veiculo) {
        Veiculo.add(veiculo);
        System.out.println("Adicionado o veículo " + veiculo.ObterNome() + " do cliente " + getNome() + ". ");
    }

    @Override
    public void RemoverVeiculo(IVeiculo veiculo) {
        Veiculo.remove(veiculo);
        System.out.println("Removido o veículo " + veiculo.ObterNome() + " do cliente " + getNome() + ". ");
    }
}
