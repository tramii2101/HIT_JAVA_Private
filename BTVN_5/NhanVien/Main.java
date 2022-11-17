package NhanVien;

public class Main {
    public static void main(String[] args) {
        NhanVien[] nv = new NhanVien[5];
        for (int i = 0; i < 5; i++) {
            nv[i] = new NhanVien();
            nv[i].input();
        }

        System.out.printf("%-5s %-15s %-15s %-15s %-10s %-15s %-15s %-15s %n", "ID", "Ho ten", "Kieu NV", "So ngay lam", "Nam vao", "Luong", "Phu cap", "Tong tien");
        for (int i = 0; i < 5; i++)
            nv[i].output();
    }
}
