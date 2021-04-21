package acesso.banco.dados.jdbc;

public class DBException extends RuntimeException{
    public DBException(String message){
        super(message);
    }
}
