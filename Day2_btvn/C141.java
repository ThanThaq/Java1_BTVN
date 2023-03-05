package Day2_btvn;

import java.util.Random;
import java.util.Scanner;

public class C141 {
    public static void main(String[] args) {
        int n;
        System.out.print("Nhap kich thuoc Mang: ");
        Scanner in = new Scanner(System.in);
        n = in.nextInt();
        in.close();

        if(n < 1){
            System.out.print("Kich thuoc mang khong hop le!");
        }else{
            int[] arr = new int[n];
            Random random = new Random();
            for (int i =0; i< n; i++){
                arr[i] = random.nextInt(200);
                System.out.printf("%d \n",arr[i]);
            }

            int  min = arr[0];
            int a = 0;
            for (int i = 0; i < arr.length; i++) {
                if(arr[i]  >  0){
                    if (min > arr[i]) {
                        min = arr[i];
                        a = i;
                    }
                }
            }
            System.out.printf("\nGia tri Min dung vi tri thu %d co gia tri = %d\n", a, min);
        }
    }
}