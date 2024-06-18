package supermarket;

import Controller.CreateEmployee;
import Model.Database;
import Model.Employee;

import java.sql.SQLException;

public class Main {
    public static void main(String[] args) {
        try {
            Employee admin = new Employee("Admin", "Perera", "123@gmail.com", "077 3152079", "Galle", 50000, "123") {
                @Override
                public int getDepartment() {
                    return 0;
                }
            };
            Database database = new Database();
            new CreateEmployee(admin, database);
        } catch (SQLException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}