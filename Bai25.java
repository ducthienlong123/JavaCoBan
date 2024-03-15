import java.util.Scanner;

public class Bai25 {
    public static void main(String[] args) {
    int n =1;
        Scanner sc = new Scanner(System.in);
        do{
            System.out.println("Nhap n < 0");
            n= sc.nextInt();
        }while (n<=0);
    }
}
