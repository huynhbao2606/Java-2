import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        SinhVien SinhVien = new SinhVien(1,"Huynh Bao",5,6);
        SinhVien SinhVien1 = new SinhVien(2,"Tran Hoang Huy",10,10);
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập ID : ");
        int ID = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Họ Tên : ");
        String HoTen = scanner.nextLine();
        System.out.println("Điểm Lý Thuyết : ");
        float DiemLT = scanner.nextFloat();
        System.out.println("Điểm Thực Hành : ");
        float DiemTH = scanner.nextFloat();
        SinhVien SinhVien2 = new SinhVien(ID,HoTen,DiemLT,DiemTH);
        System.out.println(SinhVien);
        System.out.println(SinhVien1);
        System.out.println(SinhVien2);
    }
}