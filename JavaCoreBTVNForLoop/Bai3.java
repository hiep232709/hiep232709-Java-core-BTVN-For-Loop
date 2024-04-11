package JavaCoreBTVNForLoop;

import java.util.Scanner;

public class Bai3 {

//    Bài 3. Viết method truyền vào 1 chuỗi bất kỳ và 1 số nguyên dương n > 1,
//    hãy viết hàm có tác dụng sao chép đó chuỗi lên n lần, ngăn cách nhau bởi dấu gạch ngang.
//    Ví dụ: repeatString(“a”, 5) => Kết quả trả về là ‘a-a-a-a-a’


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap vao chuoi: ");
        String str = sc.nextLine();
        System.out.print("Nhap vao so lan lap: ");
        int count = sc.nextInt();
        sc.close();
        String dash = "-";
        for (int i = 0; i < (count - 1); i++) {
            System.out.print(str + dash);
        }
        System.out.print(str);
    }
}
