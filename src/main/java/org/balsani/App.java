package org.balsani;


import org.balsani.banco.domain.cliente.ClienteDto;
import org.balsani.banco.services.CadastrarCliente;
import org.balsani.banco.services.ClienteRepositoryEmMemoria;

public class App {
    public static void main( String[] args ) {
        String nome = "Glauber Balsani";
        String cpf = "132.456.789-10";
        String email = "glauber@gmail.com";

        CadastrarCliente cadastrarCliente =
                new CadastrarCliente(new ClienteRepositoryEmMemoria());
        cadastrarCliente.cadastrar(new ClienteDto(nome,cpf,email));

        ClienteRepositoryEmMemoria repositoryEmMemoria = new ClienteRepositoryEmMemoria();
        repositoryEmMemoria.listarClientes();

    }
}
