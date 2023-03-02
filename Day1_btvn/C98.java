package Day1_btvn;
import java.util.Scanner;
public class C98 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        float a,b,c,d,e,f;
        System.out.print("Nhap a,b,c,d,e,f: ");
        a = in.nextFloat();
        b = in.nextFloat();
        c = in.nextFloat();
        d = in.nextFloat();
        e = in.nextFloat();
        f = in.nextFloat();
        in.close();

        float x,y;
        float D = a * e - d * b;
        float Dx = c * e - f * b;
        float Dy = a * f - d * c;
        if(D == 0) {
            if (Dx + Dy == 0) {
                System.out.print("He phuong trinh vo so nghiem");
            }
            else {
                System.out.print("He phuong trinh vo nghiem");
            }
        } else {
            x = Dx / D;
            y = Dy / D;
            System.out.printf("He phuong trinh co nghiem (x, y) = (%.1f, %.1f)", x, y);
        }
    }
}
