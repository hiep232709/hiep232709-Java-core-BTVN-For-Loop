package JavaCoreBTVNForLoop;

import java.util.Scanner;

public class Bai6 {

    //    Bài 6: Viết method để in ra các số từ 1 đến 100.
//    Trong đó
//    Những số nào chia hết cho 3 thì in chữ “Fizz”
//    Những số chia hết cho 5 thì in chữ “Buzz”,
//    Còn những số chia hết cho cả 3 và 5 thì in chữ “FizzBuzz”

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap so dau tien cua day so: ");
        int firstnumb = sc.nextInt();
        System.out.print("Nhap so cuoi cung cua day so: ");
        int lastnumb = sc.nextInt();
        sc.close();
        System.out.println("Cac so trong khoang tu " + firstnumb + " den " + lastnumb + " : ");
        for (int i = firstnumb; i <= lastnumb; i = i + 1) {
            if (i % 5 == 0 && i % 3 == 0) {
                System.out.println(i + " FizzBuzz ");
            } else {
                if (i % 3 == 0) {
                    System.out.println(i + " Fizz ");
                } else if (i % 5 == 0) {
                    System.out.println(i + " Buzz ");
                } else {
                    System.out.println(i);
                }
            }
        }
    }
}
