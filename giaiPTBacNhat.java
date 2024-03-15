import java.util.Scanner;

public class giaiPTBacNhat{
    public static void main(String[] args) {
        double a,b,x;
        //PTBN : ax+b = 0
        Scanner sc=new Scanner(System.in);
        System.out.println(" nhap a : ");
        a=sc.nextDouble();
        System.out.println(" Nhap b : ");
        b= sc.nextDouble();


        if( a== 0){
            if(b == 0){
                System.out.println(" phuong trinh vo so ngiem ");
            }else {
                System.out.println(" phuong trinh vo nghiem");
            }
        }else {
            x= -b/a;
            System.out.println(" co nghiem x = "+x);
        }
    }

}