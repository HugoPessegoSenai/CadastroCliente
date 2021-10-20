/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.cliente.utils;


import java.sql.Connection;
import java.sql.SQLException;
import java.sql.DriverManager;


public class Conector {
    //jdbc:mysql:/ = Dados de conector ao banco e qual banco conectar
    //localhost = Nome do servidor a conectar
    //cadastrocliente = Nome da minha base de dados
    public static String url = "jdbc:mysql://localhost/cadastrocliente";
    public static String usuario = "root";
    public static String senha = "root";
    public static Connection con;
    
    
public static Connection getConexao() throws SQLException{
    try {
        //Class.forName("org.gjt.mm.mysql.Driver");
        if(con==null){
            con = (Connection) DriverManager.getConnection(url,usuario,senha);
        }
        
        return con;
        
    } catch (SQLException e) {
        throw new SQLException(e.getMessage());
    }
    


}    
    
}

