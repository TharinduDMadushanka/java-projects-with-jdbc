package Model;

import Db.DBConnection;
import Dto.RegisterDto;

import java.sql.Connection;
import java.sql.SQLException;

public class RegisterModel {
    private final Connection connection;

    public RegisterModel() throws ClassNotFoundException, SQLException {
        this.connection= DBConnection.getInstance().getConnection();
    }

    public String saveStudent(RegisterDto registerDto) throws Exception{

        String sql="INSERT INTO details VALUES (?,?,?,?,?,?,?,?)";

    }
}
