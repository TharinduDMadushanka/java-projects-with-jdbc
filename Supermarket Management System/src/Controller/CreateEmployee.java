package Controller;

import Model.Database;
import Model.Employee;

public class CreateEmployee {

    public CreateEmployee(Employee e , Database database) {

        String insert="INSERT INTO employees VALUES(?,?,?,?,?,?,?,?)";

    }
}
