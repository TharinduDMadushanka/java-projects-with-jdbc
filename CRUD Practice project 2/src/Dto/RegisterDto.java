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

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Override
    public String toString() {
        return "RegisterDto{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", id='" + id + '\'' +
                ", grade='" + grade + '\'' +
                ", age=" + age +
                ", district='" + district + '\'' +
                ", province='" + province + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                '}';
    }
}
