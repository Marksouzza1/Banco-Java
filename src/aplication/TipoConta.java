package aplication;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TipoConta extends JFrame {
    private JButton btnContaPessoal;
    private JButton btnContaJuridia;
    private JLabel lblconta;
    private JPanel pnlTipoConta;

    public TipoConta() {
        iniciarComponentes();
        createListener();
    }

    public void createListener(){
    btnContaPessoal.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
                telaInicial telaInicial = new telaInicial();
            
        }
    });
}

    public void iniciarComponentes(){
        setTitle("Menu");
        setSize(300,300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setContentPane(pnlTipoConta);
        setVisible(true);
    }

    public static void main(String[] args) {
        TipoConta tipoConta = new TipoConta();
    }

}
