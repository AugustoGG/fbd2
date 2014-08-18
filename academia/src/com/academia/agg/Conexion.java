/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.academia.agg;

/**
 *
 * @author campitos
 */

import java.sql.*;
public class Conexion {
    
    public static Connection conectarse()throws Exception{
       //La siguiente es la cadena de direccion a ORACLE       
        String url="jdbc:oracle:thin:@localhost:1521:XE";
        //jdbc=java data base conectivity
       
        //Se carga el driver (es un paquete que contiene una clase que nos
        //ayuda a conectarnos a ORACLE desde java)
       Class.forName("oracle.jdbc.OracleDriver");
       
       //La siguiente es la cadena de autenticacion.
       Connection con=DriverManager.getConnection(url,"system","system");
       //
       return con;
    }
    
}
