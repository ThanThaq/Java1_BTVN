package Day2_btvn;

import java.util.Scanner;
import java.util.Random;

public class C135  {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Nhap kich thuoc Mang: ");
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

        System.out.println("In ra mảng vừa tạo");
        for (int value : arr) {
            System.out.print(value + "\t");
        }
        System.out.println();

        for(int i =0; i< arr.length; i++){
            if(arr[i]  >  0){
                System.out.println("so duong dau tien la:" + arr[i]);
                break;
            }
            System.out.println("Mang vua nhap khong co so Duong");
            break;
        }
    }
}