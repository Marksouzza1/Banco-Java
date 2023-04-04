package entities;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class listaDeClientes extends JFrame {
    private JTable tblListaClientes;
    private JButton excluirButton;

    final String URL = "jdbc:mysql://localhost:3306/capitol";
    final String USER = "root";
    final String PASSWORD = "root99";
    final String INSERIR_PF = "INSERT INTO INSERIR_PF(email,telefone,endereco,bairro,razaoSocial,CNPJ) VALUES (?,?,?,?,?,?,?,?,?,?)";
    final String CONSULTA = "select * from  clientePJ IS NOT NULL" ;
    final String EXCLUIR_PF = "DELETE FROM clientePessoaJuridica WHERE nome =?";




public listaDeClientes() {}


public void addListener(){

DefaultTableModel clientePJ = new DefaultTableModel();
clientePJ.addColumn("email");
clientePJ.addColumn("telefone");
clientePJ.addColumn("bairro");
clientePJ.addColumn("RazaoSocial");
clientePJ.addColumn("cnpj");
tblListaClientes.setModel(clientePJ);

    Connection connection = null;
    try {
        connection = DriverManager.getConnection(URL, USER, PASSWORD);
        Statement stmt = null;
        stmt = connection.createStatement();

        ResultSet rs = null;

        rs = stmt.executeQuery(CONSULTA);

        while (rs.next()){
            Object[] row = new Object[10];
            row[0] = rs.getObject(1);
            row[1] = rs.getObject(2);
            row[2] = rs.getObject(3);
            row[3] = rs.getObject(4);
            row[4] = rs.getObject(5);
            row[5] = rs.getObject(6);
            row[6] = rs.getObject(7);
            row[7] = rs.getObject(8);
            row[8] = rs.getObject(9);
            row[9] = rs.getObject(10);
            clientePJ.addRow(row);

        }


    } catch (SQLException ex){
        throw new RuntimeException(ex);
    }

}

}

