package supermarket;

import Controller.CreateEmployee;
import Model.Database;
import Model.Employee;
import View.Login;

import java.sql.SQLException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws SQLException, ClassNotFoundException {

        new Login().oper(null, new Scanner(System.in),new Database());
    }
}

//try {
//Employee admin = new Employee("Admin", "Perera", "123@gmail.com", "077 3152079", "Galle", 50000, "123") {
//    @Override
//    public int getDepartment() {
//        return 0;
//    }
//};
//Database database = new Database();
//            new CreateEmployee(admin, database);
//        } catch (SQLException | ClassNotFoundException e) {
//        e.printStackTrace();
//        }