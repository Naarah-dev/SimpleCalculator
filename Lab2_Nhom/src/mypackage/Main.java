package mypackage;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("=== SIMPLE CALCULATOR ===");
        System.out.println("1. Cong");
        System.out.println("2. Tru");
        System.out.println("3. Nhan");
        System.out.println("4. Chia");
        System.out.print("Chon chuc nang: ");
        int choice = sc.nextInt();
        System.out.print("Nhap so a: ");
        double a = sc.nextDouble();
        System.out.print("Nhap so b: ");
        double b = sc.nextDouble();
        switch (choice) {
            case 1:
                Addition add = new Addition();
                System.out.println("Ket qua: " + add.calculate(a, b));
                break;
            case 2:
                Subtraction sub = new Subtraction();
                System.out.println("Ket qua: " + sub.calculate(a, b));
                break;
            case 3:
                Multiplication mul = new Multiplication();
                System.out.println("Ket qua: " + mul.calculate(a, b));
                break;
            case 4:
                Division div = new Division();
                System.out.println("Ket qua: " + div.calculate(a, b));
                break;
            default:
                System.out.println("Lua chon khong hop le!");
        }
        sc.close();
    }
}