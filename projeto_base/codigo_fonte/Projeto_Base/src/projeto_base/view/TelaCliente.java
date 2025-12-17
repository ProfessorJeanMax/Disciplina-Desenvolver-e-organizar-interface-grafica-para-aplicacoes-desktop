package projeto_base.view;

import projeto_base.controller.ClienteController;

import javax.swing.*;
import java.awt.*;

public class TelaCliente extends JFrame {

    private JTextField txtNome;
    private JTextField txtEmail;
    private JButton btnSalvar;

    private ClienteController controller;

    public TelaCliente() {
        controller = new ClienteController(this);
        initComponents();
    }

    private void initComponents() {
        setTitle("Cadastro de Cliente");
        setSize(400, 200);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);

        JLabel lblNome = new JLabel("Nome:");
        JLabel lblEmail = new JLabel("Email:");

        txtNome = new JTextField(20);
        txtEmail = new JTextField(20);

        btnSalvar = new JButton("Salvar");

        // EVENTO → chama o controller
        btnSalvar.addActionListener(e -> controller.salvarCliente());

        JPanel panel = new JPanel(new GridLayout(3, 2, 5, 5));
        panel.add(lblNome);
        panel.add(txtNome);
        panel.add(lblEmail);
        panel.add(txtEmail);
        panel.add(new JLabel());
        panel.add(btnSalvar);

        add(panel);
    }

    // Métodos usados pelo Controller
    public String getNome() {
        return txtNome.getText().trim();
    }

    public String getEmail() {
        return txtEmail.getText().trim();
    }

    public void mostrarMensagem(String msg) {
        JOptionPane.showMessageDialog(this, msg);
    }

    public void limparCampos() {
        txtNome.setText("");
        txtEmail.setText("");
    }
}
