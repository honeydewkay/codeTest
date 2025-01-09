import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        sc.useDelimiter("\\.");
        int yy = sc.nextInt();
        int mm = sc.nextInt();
        int dd = sc.nextInt();
        int first;
        int second;
        int third;
        first = mm;
        second = dd;
        third = yy;
        System.out.printf("%d-%d-%d", first, second, third);
    }
}