package dao;

import model.Cliente;
import java.util.List;

public interface IClienteDAO {
    void cadastrar(Cliente cliente);
    Cliente buscarPorCpf(String cpf);
    List<Cliente> listarTodos();
    void atualizar(Cliente cliente);
    void deletar(String cpf);
}