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

        String insert = "INSERT INTO employees (first_name, last_name, email, phone_number, address, salary, department, password) VALUES (?, ?, ?, ?, ?, ?, ?, ?)";

        PreparedStatement statement =connection.prepareStatement(insert);
        statement.setString(1, e.getFirstName());
        statement.setString(2, e.getLastName());
        statement.setString(3, e.getEmail());
        statement.setString(4, e.getPhoneNumber());
        statement.setString(5, e.getAddress());
        statement.setDouble(6, e.getSalary());
        statement.setInt(7, e.getDepartment());
        statement.setString(8, e.getPassword());

        try{
            statement.executeUpdate();
            System.out.println("Employee added successfully");
        }catch (Exception ex){
            ex.printStackTrace();
        }
    }
}
