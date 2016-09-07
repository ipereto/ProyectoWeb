/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Utilidades;

/**
 *
 * @author Iván
 */

  import java.sql.*;
public class Conexion {
   
  public static void main (String args []) throws SQLException
  {    

    DriverManager.registerDriver (new oracle.jdbc.driver.OracleDriver());
    Connection conn = DriverManager.getConnection
          ("jdbc:oracle:thin:@localhost:1521:XE", "IPERETO", "1234");
         // driver@machineName:port:SID           ,  userid,  password
    Statement stmt = conn.createStatement();
    ResultSet rset = 
              stmt.executeQuery("select * from IPERETO.USUARIOS");
    while (rset.next()){
         System.out.println ("Usuario: " + rset.getString(1) + " Documento: "+ rset.getString(2));   // Print col 1
    }
    stmt.close();

  }
  
  public static Connection abrirConexion() throws SQLException
    {
        DriverManager.registerDriver (new oracle.jdbc.driver.OracleDriver());
        Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", "IPERETO", "1234");
        return con;
    }
  
    public static void cerrarConexion(Connection con) throws SQLException{
        con.close();
    }
        
 } 

