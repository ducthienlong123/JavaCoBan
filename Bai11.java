import java.util.Scanner;

public class Bai11 {
    public static void main(String[] args) {
        int a,b;

        Scanner sc = new Scanner(System.in);
        System.out.println(" nhap vao a=" );
        a = sc.nextInt();
        System.out.println("nhap b=" );
        b = sc.nextInt();
        int tong = a+b;
        System.out.println(a+"+ "+b +" ="+tong);
        int hieu= a-b;
        System.out.println(a+"- "+b +" ="+hieu);
        float chia= (float) a/ b ;
        System.out.println(a+" /"+b +" ="+chia);

        int soDu = a% b;
        System.out.println(a+"% "+b +" ="+soDu);

    }
}
