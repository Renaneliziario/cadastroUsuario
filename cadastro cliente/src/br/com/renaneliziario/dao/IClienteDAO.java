/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.renaneliziario.dao;

import br.com.renaneliziario.domain.Cliente;

import java.util.Collection;

/**
 *
 * @author rodrigo.pires
 */
public interface IClienteDAO {
    
    public Boolean cadastrar(Cliente cliente);
    
    public void excluir(Long cpf);
    
    public void alterar(Cliente cliente);
    
    public Cliente consultar(Long cpf);

    public Collection<Cliente> buscarTodos();
}