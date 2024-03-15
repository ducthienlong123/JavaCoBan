import java.util.Scanner;

public class Bai14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a ,b;
        System.out.println(" nhap a =");
        a= sc.nextInt();
        System.out.println(" nhap b");
        b= sc.nextInt();
        System.out.println(a+ "= "+b + " : "+ (a==b));
        System.out.println(a+ "!= "+b + " : "+ (a!=b));
        System.out.println(a+ "< "+b + " : "+ (a< b));
        System.out.println(a+ "<= "+b + " : "+ (a<=b));
        System.out.println(a+ "> "+b + " : "+ (a>b));
        System.out.println(a+ ">= "+b + " : "+ (a>=b));
        System.out.println(" ------ ");
        System.out.println(" ca hai so la so chan : "+(a%2==0 && b%2==0 ));
        System.out.println(" co 1 so la so chan : "+(a%2==0 || b%2==0 ));


    }
}
