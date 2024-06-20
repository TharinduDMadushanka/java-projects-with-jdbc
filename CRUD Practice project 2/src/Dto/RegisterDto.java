package Dto;

public class RegisterDto {

    private String firstName;
    private String lastName;
    private String id;
    private String grade;
    private int age;
    private String district;
    private String province;
    private String phoneNumber;

    public RegisterDto() {

    }

    public RegisterDto(String firstName, String lastName, String id, String grade, int age, String district, String province, String phoneNumber) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.id = id;
        this.grade = grade;
        this.age = age;
        this.district = district;
        this.province = province;
        this.phoneNumber = phoneNumber;
    }
}
