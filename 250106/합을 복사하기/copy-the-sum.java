public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.

        int a = 1;
        int b = 2;
        int c = 3;
        int d = a+b+c;

        a = d;
        b = d;
        c = d;

        System.out.printf("%d %d %d", a, b, c);
    }
}