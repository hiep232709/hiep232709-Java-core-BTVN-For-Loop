package JavaCoreBTVNForLoop;

import java.util.Scanner;

public class Bai2 {

//    Bài 2. Viết method truyền vào 1 chuỗi bất kỳ,
//    hãy viết hàm có tác dụng sao chép đó chuỗi lên 10 lần, ngăn cách nhau bởi dấu gạch ngang.
//    Ví dụ: repeatString(“a”) => Kết quả trả về là “a-a-a-a-a-a-a-a-a-a”


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap vao chuoi: ");
        String str = sc.nextLine();
        sc.close();
        for (int i = 0; i < 9; i++) {
            String dash = "-";
            System.out.print(str+dash);
        }
        System.out.print(str);
    }
}