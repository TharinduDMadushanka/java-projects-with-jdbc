package Controller;

import Model.Employee;

public class Login {
    private String email;
    private String password;
    private Employee employee;

    public Login(String email, String password, Employee employee) {
        this.email = email;
        this.password = password;
        this.employee = employee;
    }
}
