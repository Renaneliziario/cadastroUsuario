package service;

import dao.IClienteDAO;
import dao.ClienteDAOImpl;
import model.Cliente;
import java.util.List;

public class ClienteService {
    private IClienteDAO clienteDAO;

    public ClienteService() {
        this.clienteDAO = new ClienteDAOImpl();
    }

    public void cadastrarCliente(Cliente cliente) {
        clienteDAO.cadastrar(cliente);
    }

    public Cliente buscarClientePorCpf(String cpf) {
        return clienteDAO.buscarPorCpf(cpf);
    }

    public List<Cliente> listarTodosClientes() {
        return clienteDAO.listarTodos();
    }

    public void atualizarCliente(Cliente cliente) {
        clienteDAO.atualizar(cliente);
    }

    public void deletarCliente(String cpf) {
        clienteDAO.deletar(cpf);
    }
}