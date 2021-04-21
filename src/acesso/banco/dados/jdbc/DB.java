package acesso.banco.dados.jdbc;

import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class DB {

    private static Connection conn = null;

    public static  Connection getConn(){
        if(conn == null){
            try {
                Properties properties = loadProperties();
                String url = properties.getProperty("dburl");
                conn = DriverManager.getConnection(url, properties);
            } catch (SQLException throwables) {
                throw new DBException(throwables.getMessage());
            }

        }
        return conn;
    }

    public static void closeConn(){
        if(conn != null){
            try{
                conn.close();
            }catch (SQLException e){
                throw new DBException(e.getMessage());
            }
        }
    }

    private static Properties loadProperties(){
        try (FileInputStream fs = new FileInputStream("db.properties")){
            Properties properties = new Properties();
            properties.load(fs);
            return properties;
        } catch (IOException e) {
            throw new DBException(e.getMessage());
        }
    }
}
