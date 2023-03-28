package aplication;
import  entities.*;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class loginPJ extends JFrame {
    private JPanel loginPJ;
    private JLabel lblEmail;
    private JLabel lblSenha;
    private JPasswordField pswSenha;
    private JTextField txtEmail;
    private JButton btnLogar;
    private JButton btnCriarConta;
public loginPJ() {
    iniciarComponentes();
    createListener();

}

    public void iniciarComponentes(){
        setTitle("Menu");
        setSize(600,600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setContentPane(loginPJ);
        setVisible(true);
    }
public void createListener(){

    btnCriarConta.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            cadastroClientePJ cadastroClientePJ = new cadastroClientePJ();
        }
    });

    btnLogar.addActionListener(new ActionListener() {

        @Override
        public void actionPerformed(ActionEvent e) {

        }
    });
}
}
