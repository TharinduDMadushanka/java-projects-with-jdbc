package Model;

public class Storekeeper extends Employee{

    public Storekeeper() {
        this.option=new Option[] {};

    }

    public Storekeeper(String firstName, String lastName, String email, String phoneNumber, String address, double salary,String password) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.address = address;
        this.salary = salary;
        this.password = password;
        this.option=new Option[] {};

    }
    public int getDepartment() {
        return 2;
    }
}
