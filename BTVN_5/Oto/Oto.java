package Oto;

import java.util.Scanner;

public class Oto {
    private String chusohuu;
    private String tenxe;
    private String hang;
    private long gia;
    private int nammua;

    public String getChusohuu() {
        return chusohuu;
    }

    public void setChusohuu(String chusohuu) {
        this.chusohuu = chusohuu;
    }

    public String getTenxe() {
        return tenxe;
    }

    public void setTenxe(String tenxe) {
        this.tenxe = tenxe;
    }

    public String getHang() {
        return hang;
    }

    public void setHang(String hang) {
        this.hang = hang;
    }

    public long getGia() {
        return gia;
    }

    public void setGia(long gia) {
        this.gia = gia;
    }

    public int getNammua() {
        return nammua;
    }

    public void setNammua(int nammua) {
        this.nammua = nammua;
    }

    public void input() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap ten chu xe: ");
        chusohuu = sc.nextLine();
        System.out.println("Nhap ten xe: ");
        tenxe = sc.nextLine();
        System.out.println("Nhap hang: ");
        hang = sc.nextLine();
        System.out.println("Nhap gia: ");
        gia = sc.nextLong();
        System.out.println("Nhap nam: ");
        nammua = sc.nextInt();
    }

    public int getNamSuDung() {
        return 2022 - getNammua();
    }

    public int getPercent() {
        if (getGia() < 1000000000) return 7;
        else if (getGia() <= 2000000000) return 5;
        else return 3;
    }

    public double getGiaTriHienTai() {
        return (getGia() - (getGia() * (float) getPercent() / 100 * getNamSuDung()));
    }

    public void output() {
        System.out.printf("%-15s %-15s %-15s %-15d %-10d %-18f %n", chusohuu, tenxe, hang, gia, getNamSuDung(), getGiaTriHienTai());
    }
}
