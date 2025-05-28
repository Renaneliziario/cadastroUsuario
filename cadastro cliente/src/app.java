

import model.Cliente;
import service.ClienteService;

public class app {
    public static void main(String[] args) {
        // 1. Instancia o serviço (que já cria o DAO automaticamente)
        ClienteService clienteService = new ClienteService();
        
        // 2. Cria alguns clientes de exemplo
        Cliente cliente1 = new Cliente(
                "João Silva",
                "123.456.789-00",
                "(11) 9999-9999",
                "Rua das Flores",
                "100",
                "São Paulo",
                "SP"
        );
        
        Cliente cliente2 = new Cliente(
                "Maria Oliveira",
                "987.654.321-00",
                "(21) 8888-8888",
                "Avenida Brasil",
                "200",
                "Rio de Janeiro",
                "RJ"
        );

        // 3. Cadastra os clientes
        System.out.println("Cadastrando clientes...");
        clienteService.cadastrarCliente(cliente1);
        clienteService.cadastrarCliente(cliente2);

        // 4. Lista todos os clientes
        System.out.println("\nClientes cadastrados:");
        clienteService.listarTodosClientes().forEach(System.out::println);

        // 5. Busca um cliente por CPF
        System.out.println("\nBuscando cliente por CPF:");
        Cliente clienteEncontrado = clienteService.buscarClientePorCpf("123.456.789-00");
        System.out.println(clienteEncontrado != null ? clienteEncontrado : "Cliente não encontrado");

        // 6. Atualiza um cliente
        System.out.println("\nAtualizando cliente...");
        Cliente clienteAtualizado = new Cliente(
                "João Silva Junior",
                "123.456.789-00",  // Mesmo CPF para atualizar
                "(11) 7777-7777",
                "Rua das Flores",
                "101",  // Número alterado
                "São Paulo",
                "SP"
        );
        clienteService.atualizarCliente(clienteAtualizado);

        // 7. Mostra a lista atualizada
        System.out.println("\nLista após atualização:");
        clienteService.listarTodosClientes().forEach(System.out::println);

        // 8. Remove um cliente
        System.out.println("\nRemovendo cliente...");
        clienteService.deletarCliente("987.654.321-00");

        // 9. Lista final
        System.out.println("\nLista final:");
        clienteService.listarTodosClientes().forEach(System.out::println);
    }
}