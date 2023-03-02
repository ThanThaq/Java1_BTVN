package Day1_btvn;
import java.util.Scanner;
public class C96 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        float x;
        System.out.print("Nhap x: ");
        x = in.nextFloat();
        in.close();

        float f;
        if(x >= 5) {
            f = 2*x*x + 5*x +9 ;
            System.out.printf("Gia tri cua ham so la: %.2f", f);
        }else {
            f = (-2)*x*x + 4*x - 9;
            System.out.printf("Gia tri cua ham so la: %.2f", f);
        }
    }
}
