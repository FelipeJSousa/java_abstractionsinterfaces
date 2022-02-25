import java.util.List;

public class ControleVagas extends Vaga implements IControleVagas{

    private List<IVaga> Vagas;
    private List<ICliente> Clientes;

    @Override
    public void AdicionarCliente(ICliente cliente) {
        Clientes.add(cliente);
    }

    @Override
    public void RemoverCliente(ICliente cliente) {
        Clientes.remove(cliente);
    }

    @Override
    public void LocalizarCliente(int index) {
        Clientes.get(index);
    }

    @Override
    void AlocarVaga(IVaga vaga) {
        Vagas.add(vaga);
    }

    @Override
    void LiberarVaga(IVaga vaga) {
        Vagas.remove(vaga);
    }
}
