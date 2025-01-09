import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c; 
        double d;
        c = a+b;
        d = (double)(a+b)/2;

        System.out.printf("%d %.1f", c, d );
    }
}