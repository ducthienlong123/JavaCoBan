import java.util.Scanner;

public class Bai22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n ;

        System.out.println(" Nhap n ");
        n=sc.nextInt();
        for (int i=2; i<n;i++){
            for(int j=1;j<=10;j++){
                System.out.println(i+"x"+j+"="+(i*j));
            }
        }
    }
}
