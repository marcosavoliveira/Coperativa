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

/**
 *
 * @author marconesio
 */
public class daoLogin {
    Conecta C = new Conecta();
    Connection con = C.getConexao();
    Statement st = null;
    ResultSet rs = null;
    boolean status = false;
    
    
    public boolean logarUsuario(DTO.dtoLogin Login) {
        
        try {
            st = con.createStatement();
            rs = st.executeQuery("SELECT ID FROM USUARIOS WHERE LOGIN = '" + Login.getLogin() + "' AND SENHA = '" + Login.getSenha() + "'");           
            status = rs.next();
            st.close();
        } catch (HeadlessException | SQLException e) {
            JOptionPane.showMessageDialog(null, e);
            status = false;
        }
        return status;
    }
}
