package Bai2;

import java.util.Scanner;

public class Person {
    protected String name;
    protected int age;
    protected String gender;
    protected String phone;

    Person () {

    }

    public Person(String name, int age, String gender, String phone) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.phone = phone;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void input() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap ten: ");
        name = sc.nextLine();
        System.out.println("Nhap tuoi: ");
        age = sc.nextInt();
        System.out.println("Nhap gioi tinh: ");
        gender = sc.nextLine();
        System.out.println("Nhap sdt: ");
        phone = sc.nextLine();
    }

    public void output() {
        System.out.printf("%-20s%-10d%-10s%-12s", name, age, gender, phone);
    }
}
