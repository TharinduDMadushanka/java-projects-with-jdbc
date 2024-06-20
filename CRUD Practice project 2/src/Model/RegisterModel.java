package Model;

import Db.DBConnection;

import java.sql.Connection;
import java.sql.SQLException;

public class RegisterModel {
    private final Connection connection;

    public RegisterModel() throws ClassNotFoundException, SQLException {
        this.connection= DBConnection.getInstance().getConnection();
    }

}
