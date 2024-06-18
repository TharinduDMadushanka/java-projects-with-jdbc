package Controller;

import Model.Database;
import Model.Employee;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class CreateEmployee {
    private final Connection connection;

    public CreateEmployee(Employee e , Database database) throws SQLException, ClassNotFoundException {
        this.connection=Database.getInstance().getConnection();

        String insert="INSERT INTO employees VALUES(?,?,?,?,?,?,?,?)";

        PreparedStatement statement =
    }
}
