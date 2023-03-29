package entities;
import aplication.*;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class cadastroClientePJ extends JFrame {
    private JPanel cadastroClientePJ;
    private JLabel lblEmail;
    private JTextField txtEndereco;
    private JTextField txtRazaoSocial;
    private JTextField txtTelefone;
    private JTextField txtEmail;
    private JLabel lbltelefone;
    private JLabel lblEndereco;
    private JTextField txtBairro;
    private JLabel lblBairro;
    private JLabel lblRazaoSocial;
    private JLabel lblCNPJ;
    private JTextField txtCNPJ;
    private JPasswordField pswSenha;
    private JLabel lblSenha;
    private JButton btnCadastar;
public cadastroClientePJ() {
    iniciarComponentes();
    createListener();

}

public void iniciarComponentes(){
    setTitle("Menu");
    setSize(600,600);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setContentPane(cadastroClientePJ);
    setVisible(true);

    }


public void createListener(){
    btnCadastar.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            validarCadastro();
        }

        private void validarCadastro(){
            String Email = txtEmail.getText();
            String Endereco = txtEndereco.getText();
            String RazaoSocial = txtRazaoSocial.getText();
            String telefone = txtTelefone.getText();
            String Senha = new String((pswSenha.getPassword()));

            if (Email.equals("admin") && Senha.equals("admin") ){
                cadastroClientePJ cadPJ = new cadastroClientePJ();
                cadPJ.setVisible(true);
                dispose();





            }else {
                JOptionPane.showMessageDialog( btnCadastar,"Dados Cadastrados");}
        }

    });
}
}
