package Model;

public class Cashier extends Employee{

    public Cashier() {
        this.option=new Option[] {};

    }

    public Cashier(String firstName, String lastName, String email, String phoneNumber, String address, double salary,String password) {
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
