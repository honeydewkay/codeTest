import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int diff;
        if (a>b) {
            diff = a-b;
        }  else {
            diff = b-a;
        }
        System.out.printf("%d", diff);
    }
}