import java.util.Scanner;

public class Main {

    public static void lcm(int n, int m) {
        int val = 0;
        int val2 = 0;
        for(int i = 1; i <= 100; i++) {
            if(i <= n && i <= m) {
                if(n % i == 0 && m % i == 0) {
                    val = i;
                    val2 = (n / val) * (m / val);
                }
            }
        }
        System.out.print(val * val2);
        
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        lcm(n,m);

    }
}