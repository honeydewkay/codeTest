import java.util.Scanner;

public class Main {
    public static int divide(int N) {
        int sum = 0;
        for(int i = 1; i <= N; i++) {
            sum += i;
        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        int totalNum = divide(N) / 10;
        System.out.println(totalNum);
    }
}