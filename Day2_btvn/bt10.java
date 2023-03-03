package Day2.Loop;

import java.util.Scanner;

public class bt10 {
    public static void main(String[] args) {
        // Bước 1: Nhập dữ liệu
        Scanner in = new Scanner(System.in);
        System.out.print("Nhap x,n = ");
        double x = in.nextDouble();
        double n = in.nextDouble();
        in.close();

        if(n == 0){
            System.out.println("N khong hop le");
            System.exit(0);
        }
        double T = 1;
        for (long i = 1; i <= n; i++) {
            T = T*x;
            }
        System.out.printf("Bieu thuc T(x,n) = %.2f)", T);
    }
}
