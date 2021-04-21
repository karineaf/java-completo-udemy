package acesso.banco.dados.jdbc;

import java.sql.Connection;

public class Application {
    public static void main(String[] args) {
        Connection connection = DB.getConn();
        DB.closeConn();
    }
}
