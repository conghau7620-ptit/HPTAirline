/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
jdbc:sqlserver://;databaseName=HPT_AIRLINES
jdbc:sqlserver://;databaseName=HPT_AIRLINES [sa on SA
 */
package connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author conghau
 */
public class DataConnection {
    
    static Connection connection;
    private static Statement statement;

    
    public static ResultSet retrieveData(String sqlCommand) {
        try {
            createStatement();
            ResultSet resultSet = statement.executeQuery(sqlCommand);
            return resultSet;
        } catch (SQLException ex) {
            Logger.getLogger(DataConnection.class.getName()).log(Level.SEVERE, 
                    null, ex);
            return null;
        }
    }
    
    public static Connection createStatement() {
        
        String url = "jdbc:sqlserver://;databaseName=HPT_AIRLINES";
        
        String user = "sa";
        String pass = "123";
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            connection = DriverManager.getConnection(url,user,pass);
            statement = connection.createStatement();

        } catch (ClassNotFoundException ex) {
            Logger.getLogger(DataConnection.class.getName()).log(Level.SEVERE, 
                    null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(DataConnection.class.getName()).log(Level.SEVERE, 
                    null, ex);
        }
        return connection;
    }
}
