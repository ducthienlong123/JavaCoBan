import java.util.Scanner;

public class Bai16 {
    public static void main(String[] args) {
            double a,b;
        Scanner sc = new Scanner(System.in);
        System.out.println(" Nhap a =");
        a = sc.nextDouble();
        System.out.println(" Nhap b= ");
        b= sc.nextDouble();

        // Ham tri tuyet doi
        System.out.println(" |a|= "+Math.abs(a));
        //ham tim min
        System.out.println(" min (a , b) = " +Math.min(a,b));
        // ham tim max
        System.out.println(" max (a , b) = " +Math.max(a,b));
        // Ham tim ceil
        System.out.println(" ceil (a ) = " +Math.ceil(a));
        // ham floor
        System.out.println(" flor (a ) = " +Math.floor(a));
        System.out.println(" sqrt (a) = " +Math.sqrt(a));
        //ham a^b
        System.out.println("  a^b = " +Math.pow(a,b));



    }
}
