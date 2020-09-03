/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author marconesio
 */
public class daoColaborador {
    Conecta C = new Conecta();
    Connection con = C.getConexao();
    Statement st = null;
    ResultSet rs = null;
    boolean status = false;
    DefaultTableModel rsTable;
    
    public boolean inserirColaborador(DTO.dtoColaborador cadColaborador) {
        
        try {
            st = con.createStatement();
            st.execute("insert into coper.colaboradores(nome,cpf,matricula,barracao,status) values('" + cadColaborador.getNome()+ "','" + cadColaborador.getCPF()+ "','" + cadColaborador.getMatricula()+ "','" + cadColaborador.getBarracao()+ "','" + cadColaborador.getStatus()+ "');");            
                status = true;
            st.close();
        } catch (HeadlessException | SQLException e) {
            JOptionPane.showMessageDialog(null, e);
            status = false;
        }
        return status;
    }
    public boolean atualizarColaborador(DTO.dtoColaborador cadColaborador) {
        
        try {
            st = con.createStatement();
            st.execute("update coper.colaboradores set matricula = '" + cadColaborador.getMatricula()+ "',nome='" + cadColaborador.getNome()+ "',cpf='" + cadColaborador.getCPF()+ "',barracao='" + cadColaborador.getBarracao()+ "',status='" + cadColaborador.getStatus()+ "' where id = " + cadColaborador.getID()+ ";");
                status = true;
            st.close();
        } catch (HeadlessException | SQLException e) {
            JOptionPane.showMessageDialog(null, e);
            status = false;
        }
        return status;
    }    
        public boolean excluirColaborador(DTO.dtoColaborador cadColaborador) {
        
        try {
            st = con.createStatement();
            st.execute("delete from coper.colaboradores where id = " + cadColaborador.getID()+ ";");            
                status = true;
            st.close();
        } catch (HeadlessException | SQLException e) {
            JOptionPane.showMessageDialog(null, e);
            status = false;
        }
        return status;
    }
    
    public DefaultTableModel listarColaborador(DefaultTableModel model) {      
        if (model.getRowCount() > 0) {
    for (int i = model.getRowCount() - 1; i > -1; i--) {
        model.removeRow(i);
    }    
}        
        try {
            st = con.createStatement();
            rs = st.executeQuery("select ID,MATRICULA,NOME,CPF,BARRACAO,STATUS from coper.colaboradores;");                         
            while(rs.next()){
                model.addRow(new Object[]{rs.getString(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5),rs.getString(6)});                
            }
            st.close();            
        } catch (HeadlessException | SQLException e) {
            JOptionPane.showMessageDialog(null, e);
            status = false;
        }
        return model;
    }
}
