package DAO;
import java.sql.*;

public class Conecta {

    public Connection con = null;

    public Connection getConexao() {
        try {
            if (con == null) {                               
                Class.forName("com.mysql.cj.jdbc.Driver");                
                con =  DriverManager.getConnection("jdbc:mysql://localhost:3306/coper?useTimezone=true&serverTimezone=UTC","root","mavo51706*");
                return con;
            } else {
                return con;
            }
        } catch (ClassNotFoundException | SQLException e) {
            System.out.println(e.getMessage()+ "Erro Conexão");
            
        }
        return con;
    }

    public void stopConexao() {
        try {
            con.close();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
}

