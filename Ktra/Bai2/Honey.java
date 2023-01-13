package Bai2;

import java.util.ArrayList;
import java.util.Scanner;

public class Honey extends Person{
    private static int count = 0;
    private int id;
    private byte status;

    private ArrayList<Favorite> listFavourite = new ArrayList<>();

    public void Honey() {
        count++;
        id = count;
    }

    public static int getCount() {
        return count;
    }

    public static void setCount(int count) {
        Honey.count = count;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public byte getStatus() {
        return status;
    }

    public void setStatus(byte status) {
        this.status = status;
    }

    public void input() {
        super.input();
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("Nhap trang thai: ");
            status = sc.nextByte();
        } while ((status != 0) && (status != 1));
    }

    public void output() {
        String trangthai = "";
        if (id == 0) trangthai = "Dang doi";
        if (id == 1) trangthai = "Dang yeu";

        System.out.printf("%-6s%-15s\n", id, trangthai);
    }

    public void addFavorite() {
        Favorite a = new Favorite();
        a.input();
        listFavourite.add(a);
    }
}
