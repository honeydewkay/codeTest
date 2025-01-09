import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int ga = sc.nextInt();
        int se = sc.nextInt();
        ga += 8;
        se *= 3;
        int nerbi = ga * se;
        System.out.println(ga);
        System.out.println(se);
        System.out.println(nerbi);
    }
}