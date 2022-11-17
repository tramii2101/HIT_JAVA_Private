package NV;

import NhanVien.NhanVien;

import java.util.Scanner;

public class NV {
    private String name;
    private int age;
    private String gender;
    private String address;
    private int hoursWorked;
    private int hourlyRate;

    NV() {
    }

    public NV(String name, int age, String gender, String address, int hoursWorked, int hourlyRate) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.address = address;
        this.hoursWorked = hoursWorked;
        this.hourlyRate = hourlyRate;
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

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getHoursWorked() {
        return hoursWorked;
    }

    public void setHoursWorked(int hoursWorked) {
        this.hoursWorked = hoursWorked;
    }

    public int getHourlyRate() {
        return hourlyRate;
    }

    public void setHourlyRate(int hourlyRate) {
        this.hourlyRate = hourlyRate;
    }

    public void input() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap ten nhan vien: ");
        name = sc.nextLine();
        System.out.println("Nhap tuoi: ");
        age = sc.nextInt();
        sc.nextLine();
        System.out.println("Nhap gioi tinh: ");
        gender = sc.nextLine();
        System.out.println("Nhap dia chi: ");
        address = sc.nextLine();
        System.out.println("Nhap so gio lam viec: ");
        hoursWorked = sc.nextInt();
        System.out.println("Nhap so tien tra theo gio: ");
        hourlyRate = sc.nextInt();
    }

    public float paidHours() {
        if (hoursWorked <= 45) return hoursWorked;
        else return 45 + (hoursWorked - 45) * (float) 3 / 2;
    }

    public double salary() {
        return paidHours() * hourlyRate;
    }

    public double tax() {
        if (salary() > 300) return salary() * (float) 20 / 100;
        else return 0;
    }

    public void output() {
        System.out.printf("%-15s%-8d%-12s%-15s%-15d%-15d%-15f%-15f%n", name, age, gender, address, hoursWorked, hourlyRate, salary(), tax());
    }
}
