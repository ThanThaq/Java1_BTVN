package Day2_btvn;

import java.util.Random;
import java.util.Scanner;

public class C138 {
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
                System.out.printf("%d ",arr[i]);
            }

            boolean isEvenNumber = false;
            int pos = -1 ;

            for (int i =0; i< arr.length; i++){
                if(arr[i] % 2 == 0){
                    pos = i;
                    System.out.printf("\nSo chan dau tien: %d va tai vi tri: %d", arr[i],pos);
                    isEvenNumber = true;
                    break;
                }
            }

            if(!isEvenNumber){
                System.out.printf("\n%d",pos);
            }

        }
    }
}