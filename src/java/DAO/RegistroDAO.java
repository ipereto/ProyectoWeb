/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Utilidades.SQLHelper;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author Iván
 */
public class RegistroDAO {

    public RegistroDAO() {
    }

    public static String insertarRegistro(Connection con, String nombre, String documento) throws SQLException {
        String respuesta;
        respuesta = "";
        PreparedStatement pr = con.prepareStatement(SQLHelper.insertarRegistro());
        pr.setString(1, nombre);
        pr.setString(2, documento);
        pr.executeUpdate();
        if (pr.getUpdateCount() == 1) {
            respuesta = "El usuario se registro exitosamente";
        } else {
            respuesta = "El usuario no se registro";
        }
        return respuesta;
    }
}
