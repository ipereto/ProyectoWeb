/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Negocio;

/**
 *
 * @author Iván
 */

import DAO.RegistroDAO;
import Utilidades.Conexion;
import java.sql.Connection;
import java.sql.SQLException;
public class RegistroNegocio {
    
    public String validarRegistro(String nombre, String documento) throws SQLException
    {
        String respuesta;
        respuesta="";
        
        if (nombre.equals("")||nombre == null) {
            respuesta += "Ingrese nombre <br>";
        }
        
        if (documento.equals("")||nombre == null) {
            respuesta += "Ingrese dcumento <br>";
        }
        
        if(respuesta.equals(""))
        {
            RegistroDAO dao = new RegistroDAO();
            Connection con = Conexion.abrirConexion();
            respuesta = dao.insertarRegistro(con, nombre, documento);
        }
        
        return respuesta;
    }
}
