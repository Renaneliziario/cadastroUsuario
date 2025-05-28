package dao;

import model.Cliente;
import java.util.ArrayList;
import java.util.List;

public class ClienteDAOImpl implements IClienteDAO {
    private List<Cliente> clientes = new ArrayList<>();

    @Override
    public void cadastrar(Cliente cliente) {
        clientes.add(cliente);
    }

    @Override
    public Cliente buscarPorCpf(String cpf) {
        return clientes.stream()
                .filter(c -> c.getCpf().equals(cpf))
                .findFirst()
                .orElse(null);
    }

    @Override
    public List<Cliente> listarTodos() {
        return new ArrayList<>(clientes);
    }

    @Override
    public void atualizar(Cliente cliente) {
        Cliente clienteExistente = buscarPorCpf(cliente.getCpf());
        if (clienteExistente != null) {
            clienteExistente.setNome(cliente.getNome());
            clienteExistente.setTelefone(cliente.getTelefone());
            clienteExistente.setEndereco(cliente.getEndereco());
            clienteExistente.setNumero(cliente.getNumero());
            clienteExistente.setCidade(cliente.getCidade());
            clienteExistente.setEstado(cliente.getEstado());
        }
    }

    @Override
    public void deletar(String cpf) {
        clientes.removeIf(c -> c.getCpf().equals(cpf));
    }
}