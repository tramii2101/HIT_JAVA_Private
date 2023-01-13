package Bai2;

import java.util.Scanner;

public class Favorite {
    private static int count = 0;
    private int id;
    private String name;

    public Favorite(){
        count++;
        id = count;
    }

    public Favorite(String name) {
        this.name = name;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void input(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap so thich: ");
        name = sc.nextLine();
    }

    public void output() {
        System.out.printf("%-6d%-15s", id, name);
    }
}
