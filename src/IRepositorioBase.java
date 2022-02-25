import java.util.List;

public interface IRepositorioBase <T>{

    void Inserir(T obj);
    void Alterar(T obj);
    void Deletar(T obj);
    List<T> Ler();
    T ObterPorId(long id);

}
