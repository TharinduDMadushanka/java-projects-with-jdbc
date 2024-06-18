package Model;

import java.sql.*;

public class Database {

    private static Database dBConnection;
    private Connection connection;

    private Database() throws ClassNotFoundException, SQLException{
        Class.forName("com.mysql.cj.jdbc.Driver");
        connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/market", "root", "Thariya920@");
    }

    public static Database getInstance() throws ClassNotFoundException, SQLException{
        if(dBConnection == null){
            dBConnection = new Database();
        }
        return dBConnection;
    }

    public Connection getConnection(){
        return connection;
    }
}
