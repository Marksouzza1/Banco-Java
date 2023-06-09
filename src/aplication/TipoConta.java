package aplication;
import entities.*;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TipoConta extends JFrame {
    private JButton btnContaPessoal;
    private JButton btnContaJuridia;
    private JLabel lblconta;
    private JPanel pnlTipoConta;
    private JButton listarCadastradosButton;

    public TipoConta() {
        iniciarComponentes();
        createListener();
    }

    public void createListener(){
    btnContaPessoal.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
                cadastroClientePF cadastroClientePF = new cadastroClientePF();
            dispose();
        }
    });

   btnContaJuridia.addActionListener(new ActionListener() {
       @Override
       public void actionPerformed(ActionEvent e) {
               cadastroClientePJ cadastroClientePJ = new cadastroClientePJ();
           dispose();

       }
   });

}

    public void iniciarComponentes(){
        setTitle("Menu");
        setSize(600,600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setContentPane(pnlTipoConta);
        setVisible(true);

    }

    public static void main(String[] args) {
        TipoConta tipoConta = new TipoConta();

    }

}
