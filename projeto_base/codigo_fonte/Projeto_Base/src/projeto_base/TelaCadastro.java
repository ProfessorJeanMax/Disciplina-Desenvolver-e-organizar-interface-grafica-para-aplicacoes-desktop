/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package projeto_base;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author tsije
 */

//
public class TelaCadastro extends javax.swing.JFrame {

//    public TelaCadastro() {;
//        initComponents();
//    }
//
//
//    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    // ===== Componentes =====
    private JLabel lblNome, lblEmail, lblTelefone, lblCpf, lblEndereco;
    private JTextField txtNome, txtEmail, txtTelefone, txtCpf, txtEndereco;
    private JButton btnSalvar, btnLimpar, btnSair;

    // ===== Construtor =====
    public TelaCadastro() {
        configurarJanela();
        inicializarComponentes();
        organizarLayout();
        adicionarEventos();
    }

    // ===== Passo 3 – Propriedades do JFrame =====
    private void configurarJanela() {
        setTitle("Sistema Comercial - Cadastro de Cliente");
        setSize(500, 350);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);
    }

    // ===== Passo 4 e 5 – Criar componentes e botões =====
    private void inicializarComponentes() {
        lblNome = new JLabel("Nome:");
        lblEmail = new JLabel("Email:");
        lblTelefone = new JLabel("Telefone:");
        lblCpf = new JLabel("CPF:");
        lblEndereco = new JLabel("Endereço:");

        txtNome = new JTextField(20);
        txtEmail = new JTextField(20);
        txtTelefone = new JTextField(20);
        txtCpf = new JTextField(20);
        txtEndereco = new JTextField(20);

        btnSalvar = new JButton("Salvar");
        btnLimpar = new JButton("Limpar");
        btnSair = new JButton("Sair");
    }

        // ===== Passo 6 – Layout =====
    private void organizarLayout() {
        setLayout(new BorderLayout());

        JPanel painelCampos = new JPanel(new GridLayout(5, 2, 10, 10));
//        painelCampos.setBackground(Color.red);;
        painelCampos.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));

        painelCampos.add(lblNome);
        painelCampos.add(txtNome);
        
        painelCampos.add(lblEmail);
        painelCampos.add(txtEmail);

        painelCampos.add(lblTelefone);
        painelCampos.add(txtTelefone);

        painelCampos.add(lblCpf);
        painelCampos.add(txtCpf);

        painelCampos.add(lblEndereco);
        painelCampos.add(txtEndereco);
       
//        painelCampos.add(lblCpf);;
//        painelCampos.add(txtEndereco);

        
        JPanel painelBotoes = new JPanel(new FlowLayout());
        painelBotoes.add(btnSalvar);
        painelBotoes.add(btnLimpar);
        painelBotoes.add(btnSair);

        add(painelCampos, BorderLayout.CENTER);
        add(painelBotoes, BorderLayout.SOUTH);
    }
        // ===== Passo 5 – Eventos =====
    private void adicionarEventos() {

        btnSalvar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                if (txtNome.getText().trim().isEmpty() ||
                    txtEmail.getText().trim().isEmpty() ||
                    txtTelefone.getText().trim().isEmpty() ||
                    txtCpf.getText().trim().isEmpty() ||
                    txtEndereco.getText().trim().isEmpty()) {

                    JOptionPane.showMessageDialog(
                            TelaCadastro.this,
                            "Preencha todos os campos!",
                            "Erro",
                            JOptionPane.ERROR_MESSAGE
                    );
                    return;
                }

                JOptionPane.showMessageDialog(
                        TelaCadastro.this,
                        "Cliente cadastrado com sucesso!",
                        "Sucesso",
                        JOptionPane.INFORMATION_MESSAGE
                );
            }
        });

        btnLimpar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                txtNome.setText("");
                txtEmail.setText("");
                txtTelefone.setText("");
                txtCpf.setText("");
                txtEndereco.setText("");
                txtNome.requestFocus();
            }
        });

        btnSair.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
    }
    
    
    // ===== Main =====
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaCadastro().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
