import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (n<0) {
            System.out.print("ice");
        }
        else if ((0 <= n) && (n < 100)) {
            System.out.print("water");
        }
        else if (n >= 100){
            System.out.print("vapor");
        }
        
    }
}