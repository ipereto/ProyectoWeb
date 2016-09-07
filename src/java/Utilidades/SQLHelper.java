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
public class SQLHelper {

    public SQLHelper() {

    }

    public static String insertarRegistro() {
        return "INSERT INTO IPERETO.USUARIOS (USUARIO, DOCUMENTO) VALUES (?, ?)";
    }
}
