package javaLevel1.lesson5;

public class Employee {
    private String fullName;
    private String position;
    private int age;
    private int salary;
    private String phoneNumber;
    private String email;

    public Employee(String fullName, String position, int age, int salary, String phoneNumber, String email) {
        this.setFullName(fullName);
        this.setPosition(position);
        this.setAge(age);
        this.setSalary(salary);
        this.setPhoneNumber(phoneNumber);
        this.setEmail(email);
    }

    public void employeeInfo() {
        System.out.printf("full name: %s%nposition: %s%nage: %s%nsalary: %s%nphoneHumber: %s%nemail: %s%n", getFullName(), getPosition(), getAge(), getSalary(), getPhoneNumber(), getEmail());
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
