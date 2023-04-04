package entities;
import aplication.TipoConta;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

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
    private JButton btnCadastar;
    private JButton btnVoltar;

    final String URL = "jdbc:mysql://localhost:3306/capitol";
    final String USER = "root";
    final String PASSWORD = "root99";
    final String INSERIR_PF = "INSERT INTO INSERIR_PF(email,telefone,endereco,bairro,razaoSocial,CNPJ) VALUES (?,?,?,?,?,?,?,?,?,?)";
    final String CONSULTA = "select * from  clientePJ IS NOT NULL" ;
    final String EXCLUIR_PF = "DELETE FROM clientePessoaJuridica WHERE nome =?";

    public cadastroClientePJ() {
    iniciarComponentes();
    createListener();
        Conecta();


    }

public void iniciarComponentes(){
    setTitle("Menu");
    setSize(600,600);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setContentPane(cadastroClientePJ);
    setVisible(true);

    }
    public void Conecta(){
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection connection = DriverManager.getConnection(URL,USER,PASSWORD);
            System.out.println("Conectado");

            final PreparedStatement stmtInserir;
            stmtInserir = connection.prepareStatement(INSERIR_PF);

            btnCadastar.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {

                    String email = txtEmail.getText();
                    String telefone = txtTelefone.getText();
                    String endereco = txtEndereco.getText();
                    String bairro = txtBairro.getText();
                    String razaoSocial = txtRazaoSocial.getText();
                    String cnpj = txtCNPJ.getText();



                    try {


                        stmtInserir.setString(1, email );
                        stmtInserir.setString(2, telefone);
                        stmtInserir.setString(3, endereco);
                        stmtInserir.setString(5, bairro);
                        stmtInserir.setString(6, razaoSocial);
                        stmtInserir.setString(7, cnpj);

                        stmtInserir.executeUpdate();
                        System.out.println("Dados inseridos!");
                        JOptionPane.showMessageDialog(btnCadastar,"Dados Inseridos");




                    }catch (Exception ex){
                        System.out.println("Erro ao inserir dados no banco");
                    }
                }
            });

        }catch (Exception ex){
            System.out.println("Erro ao conectar ao banco de dados!");
        }
    }

public void createListener(){

    btnVoltar.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            TipoConta tipoConta = new TipoConta();
        }
    });


    btnCadastar.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {


        }

    });


}
}
