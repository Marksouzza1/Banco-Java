package aplication;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import entities.*;

public class telaInicial extends JFrame {
    private JTextField txtEmail;
    private JPasswordField pswSenha;
    private JPanel telaIniciopf;
    private JLabel lblEmail;
    private JLabel lblSenha;
    private JButton btnLogar;
    private JButton btnCriarConta;
public telaInicial() {
    iniciarComponentes();
    createListener();

}
  public void iniciarComponentes(){
      setTitle("Menu");
      setSize(300,300);
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      setContentPane(telaIniciopf);
      setVisible(true);
  }
public void createListener(){

    btnLogar.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {

        }
    });

    btnCriarConta.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            cadastroClientePF cadastroPF = new cadastroClientePF();
        }
    });
}
}
