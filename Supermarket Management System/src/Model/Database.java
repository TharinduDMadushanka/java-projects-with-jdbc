package Model;

import java.sql.*;

public class Database {

    private String user="root";
    private String pass="Thariya920@";
    private String url="jdbc:mysql://localhost:3306/market";
    private Statement statement;

    public Database(){
        try{
            Connection connection= DriverManager.getConnection(url,user,pass);
            statement=connection.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_READ_ONLY);

        }catch (SQLException e){
            e.printStackTrace();
        }
    }
    public Statement getStatement(){
        return statement;
    }
}
