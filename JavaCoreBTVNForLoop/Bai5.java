package JavaCoreBTVNForLoop;

import java.util.Scanner;

public class Bai5 {
//    V= 4/3 x π x r^3
//    Bài 5: Viết method tính thể tích hình cầu, với tham số truyền vào là bán kính của hình cầu.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap ban kinh khoi cau: ");
        double radius = sc.nextDouble();
        sc.close();
        double volume = (4 * Math.PI * Math.pow(radius, 3))/3;
        System.out.println("The tich khoi cau la: " + volume);
    }
}
