package Day1_btvn;
import java.util.Scanner;
public class C83 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        float a, b;
        System.out.print("Nhap a,b: ");
        a = in.nextFloat();
        b = in.nextFloat();
        in.close();

        if((a >= 0 && b >= 0) || (a < 0 && b < 0)) {
            System.out.printf("%.2f va %.2f cung dau", a, b);
        }
        System.out.printf("%.1f va %.1f trai dau", a, b);
    }
}

