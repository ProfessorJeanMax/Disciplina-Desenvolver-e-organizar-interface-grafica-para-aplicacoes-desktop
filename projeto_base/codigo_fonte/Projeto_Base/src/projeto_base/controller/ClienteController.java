package projeto_base.controller;

import projeto_base.model.Cliente;
import projeto_base.view.TelaCliente;

public class ClienteController {

    private TelaCliente view;

    public ClienteController(TelaCliente view) {
        this.view = view;
    }

    public void salvarCliente() {
        String nome = view.getNome();
        String email = view.getEmail();

        Cliente cliente = new Cliente(nome, email);

        if (!cliente.isValido()) {
            view.mostrarMensagem("Preencha todos os campos!");
            return;
        }

        // Aqui futuramente entra banco de dados
        view.mostrarMensagem("Cliente cadastrado com sucesso!");

        view.limparCampos();
    }
}
