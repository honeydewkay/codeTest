import java.util.Scanner;

public class Main {

    public static void gcd(int n, int m) {
        int val = 0;
        for(int i = 2; i < 100; i++) {
            if(i <= n && i < m) {
                if(n % i == 0 && m % i == 0) {
                    val = i;
                }
            }
        }
        System.out.print(val);
        
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        gcd(n,m);

    }
}