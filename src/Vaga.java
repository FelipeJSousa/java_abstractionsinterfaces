public abstract class Vaga implements IVaga {
    protected long id;
    abstract void AlocarVaga(IVaga vaga);
    abstract void LiberarVaga(IVaga vaga);
}
