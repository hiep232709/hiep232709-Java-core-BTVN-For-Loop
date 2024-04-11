package JavaCoreBTVNForLoop;

import java.util.Scanner;

public class Bai1 {

    //    Bài 1. Viết method truyền vào 1 chuỗi bất kỳ, hãy sao chép chuỗi đó lên 10 lần.
    //    Ví dụ : repeatString(“a”) => Kết quả trả về là “aaaaaaaaaa”

// CACH 1
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Nhap vao chuoi: ");
//        String string = sc.nextLine();
//        sc.close();
//        int count = 10;
//        System.out.println(string.repeat(count));
//    }

// CACH 2
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap vao chuoi: ");
        String str = sc.nextLine();
        sc.close();
        for (int i = 0; i < 10; i++){
            System.out.println(str);
        }
    }
}
