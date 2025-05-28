package dao;

import java.util.Collection;

import model.Cliente;


public interface IClienteDAO {

    public Boolean cadastrar(CLiente cliente);
    public void excluir (Long cpf);
    public void alterar (Cliente cliente);
    public Cliente consultar (Long cpf);
    public Collection<Cliente> buscarTodos();
    
}