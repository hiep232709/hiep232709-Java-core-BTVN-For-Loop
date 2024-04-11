package JavaCoreBTVNForLoop;

import java.util.Scanner;

public class Bai4 {

//    Bài 4. Viết method tính tổng các số chia hết cho 5 từ 0 -> 100

//    TINH TONG CAC SO CHIA HET CHO 5 trong mot khoang bat ky

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap so dau tien cua day so: ");
        int firstnumb = sc.nextInt();
        System.out.print("Nhap so cuoi cung cua day so: ");
        int lastnumb = sc.nextInt();
        sc.close();
        int sum = 0;
        for (int i = firstnumb; i <= lastnumb; i++){
            if (i % 5 == 0){
                sum = sum + i;
            }
       }
        System.out.println("Tong cac so chia het cho 5 trong khoang tu " + firstnumb + " den " + lastnumb + " la: " + sum);
    }
}
