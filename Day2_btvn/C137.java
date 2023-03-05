package Day2_btvn;

import java.util.Random;
import java.util.Scanner;

public class C137 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Nhap kich thuoc mang: ");
        int n = in.nextInt();
        in.close();
        if (n < 1) {
            System.out.println("Kich thuoc mang khong hop le!");
            System.exit(0);
        }
        Random random = new Random();
        // Tao mang
        int[] arr = new int[n];

        // Lặp n lần
        // Mỗi lần lặp -> gán giá trị ngẫu nhiên cho mảng vừa nhập
        for (int i = 0; i < n; i++) {
            // 0 -> 9999
            arr[i] = random.nextInt(10000);
        }

        System.out.println("In ra mang vua tao");
        // Foreach
        for (int value : arr) {
            System.out.print(value + "\t");
        }
        System.out.println();

        System.out.println("In ra vi tri gia tri be nhat trong mang");
        int  min = arr[0];
        int a = 0;
        for (int i = 0; i < arr.length; i++) {
            if (min > arr[i]) {
                min = arr[i];
                a = i;
            }
        }
        System.out.printf("Gia tri Min dung vi tri thu %d co gia tri = %d\n", a, min);
    }
}