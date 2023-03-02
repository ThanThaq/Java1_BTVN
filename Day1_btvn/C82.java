package Day1_btvn;
import java.util.Scanner;
public class C82 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        float a, b, c;
        System.out.print("Nhap a,b,c: ");
        a = in.nextFloat();
        b = in.nextFloat();
        c = in.nextFloat();
        in.close();

        if(a>b && a>c){
            System.out.println(a + " la so lon nhat");
            System.exit(0);
        }else if (b>c){
            System.out.println(b + " la so lon nhat");
            System.exit(0);
        }
        System.out.println(c + " la so lon nhat");
    }
}