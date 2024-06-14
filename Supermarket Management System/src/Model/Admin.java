package Model;

public class Admin extends Employee{

    public Admin() {
        this.option=new Option[] {};
    }

    public Admin(String firstName, String lastName, String email, String phoneNumber, String address, double salary,String password) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.address = address;
        this.salary = salary;
        this.password = password;
        this.option=new Option[] {};

    }
}
