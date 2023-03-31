package entities;

import aplication.TipoConta;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

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
    private JButton btnCadastar;
    private JButton btnVoltar;
    private JTextField txtNome;

    final String URL = "jdbc:mysql://localhost:3306/capitol";
    final String USER = "root";
    final String PASSWORD = "root99";
    final String INSERIR_PF = "INSERT INTO INSERIR_PF(nome, cpf,profissao,renda,bairro,rua,numeroCasa) VALUES (?,?,?,?,?,?,?,?,?,?)";
    final String CONSULTA = "select * from clientePessoaFisica + clientePJ IS NOT NULL" ;
    final String EXCLUIR_PF = "DELETE FROM clientePessoaFisica WHERE nome =?";


    public cadastroClientePF() {
    iniciarComponentes();
    createListener();
        btnVoltar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                TipoConta tipoConta = new TipoConta();
                dispose();
            }
        });

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
                            String nome = txtNome.getText();
                            String email = txtEmail.getText();
                            String telefone = txtTelefone.getText();
                            String Rua = txtRua.getText();
                            String bairro = txtBairro.getText();
                            String numeroCasa = txtNumeroCasa.getText();
                            String renda = txtRendaMensal.getText();
                            String proficao = txtProfissao.getText();
                            String cpf = txtCPF.getText();



                    try {

                        stmtInserir.setString(1, nome );
                        stmtInserir.setString(2, email );
                        stmtInserir.setString(3, telefone);
                        stmtInserir.setString(4, Rua);
                        stmtInserir.setString(5, bairro);
                        stmtInserir.setString(6, numeroCasa);
                        stmtInserir.setString(7, renda);
                        stmtInserir.setString(8, proficao);
                        stmtInserir.setString(9, cpf);


                        stmtInserir.executeUpdate();
                        System.out.println("Dados inseridos!");
                        JOptionPane.showMessageDialog(btnCadastar,"Dados Inseridos");
                        txtNome.setText("");



                    }catch (Exception ex){
                        System.out.println("Erro ao inserir dados no banco");
                    }
                }
            });

        }catch (Exception ex){
            System.out.println("Erro ao conectar ao banco de dados!");
        }
    }

    public void iniciarComponentes(){
        setTitle("Menu");
        setSize(600,600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setContentPane(cadastroClientePF);
        setVisible(true);
    }
public void createListener(){

    btnCadastar.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            dispose();

        }
    });
}
}

