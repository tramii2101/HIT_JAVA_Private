package Bai2;

import java.util.Scanner;

public class KhoiThi {
    Scanner sc = new Scanner(System.in);
    private float mon1;
    private float mon2;
    private float mon3;

    public KhoiThi(){}

    public KhoiThi(float mon1, float mon2, float mon3) {
        this.mon1 = mon1;
        this.mon2 = mon2;
        this.mon3 = mon3;
    }

    public float getMon1() {
        return mon1;
    }

    public void setMon1(float mon1) {
        this.mon1 = mon1;
    }

    public float getMon2() {
        return mon2;
    }

    public void setMon2(float mon2) {
        this.mon2 = mon2;
    }

    public float getMon3() {
        return mon3;
    }

    public void setMon3(float mon3) {
        this.mon3 = mon3;
    }

    public void input(){
        do{
            System.out.println("Nhap diem mon 1: ");
            mon1 = sc.nextFloat();
        } while((mon1 < 0 || mon1 > 10));

        do{
            System.out.println("Nhap diem mon 2: ");
            mon2 = sc.nextFloat();
        } while((mon2 < 0 || mon2 > 10));

        do{
            System.out.println("Nhap diem mon 2: ");
            mon2 = sc.nextFloat();
        } while((mon2 < 0 || mon2 > 10));
    }

    public void output(){
        System.out.printf("%-10.2f %-10.2f %-10.2f %n", mon1, mon2, mon3);
    }
}

