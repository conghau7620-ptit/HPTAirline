/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author MY PC
 */
public class ketNoiSQL {
        public static Connection layKetNoi(){
        Connection ketNoi = null;
        
        String url = "jdbc:sqlserver://;databaseName=HPT_AIRLINES";
        String userName = "sa";
        String password = "123";
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            ketNoi = DriverManager.getConnection(url,userName,password);
            System.err.println("Ket noi thanh cong");
        }
        catch(ClassNotFoundException | SQLException ex){
            System.err.println("ket noi khong thanh cong");
        }
        return ketNoi;
    }
}
