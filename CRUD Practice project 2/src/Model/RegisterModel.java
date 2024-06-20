package Model;

import Db.DBConnection;
import Dto.RegisterDto;
import java.sql.PreparedStatement;
import java.sql.Connection;
import java.sql.SQLException;

public class RegisterModel {
    private final Connection connection;

    public RegisterModel() throws ClassNotFoundException, SQLException {
        this.connection= DBConnection.getInstance().getConnection();
    }

    public String saveStudent(RegisterDto registerDto) throws Exception{

        String sql="INSERT INTO details VALUES (?,?,?,?,?,?,?,?)";

        PreparedStatement statement  = connection.prepareStatement(sql);
        statement.setString(1, registerDto.getFirstName());
        statement.setString(2, registerDto.getLastName());
        statement.setString(3, registerDto.getId());
        statement.setString(4, registerDto.getGrade());
        statement.setInt(5, registerDto.getAge());
        statement.setString(6, registerDto.getDistrict());
        statement.setString(7, registerDto.getProvince());
        statement.setString(8, registerDto.getPhoneNumber());

        return statement.executeUpdate() >0 ? "Success" : "Fail";

    }
}
