package entities;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class cadastroClientePF extends JFrame{
    private JPanel cadastroClientePF;
    private JTextField txtEmail;
    private JTextField txtTelefone;
    private JTextField txtRua;
    private JTextField txtNumeroCasa;
    private JTextField txtRendaMensal;
    private JTextField txtProfissao;
    private JLabel lblRua;
    private JLabel lbltelefone;
    private JLabel lblEmail;
    private JLabel lblBairro;
    private JTextField txtBairro;
    private JLabel lblNumero;
    private JLabel lblRendaMensal;
    private JLabel lblProfissao;
    private JLabel lblCPF;
    private JTextField txtCPF;
    private JPasswordField pswSenha;
    private JLabel lblSenha;
    private JButton btnCadastar;
public cadastroClientePF() {
    iniciarComponentes();
    createListener();
}

    public void iniciarComponentes(){
        setTitle("Menu");
        setSize(300,300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setContentPane(cadastroClientePF);
        setVisible(true);
    }
public void createListener(){

    btnCadastar.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {

        }
    });
}
}

