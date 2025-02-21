import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int arr1[] = new int[101];
        int arr2[] = new int[101];
        int N1 = sc.nextInt();
        int N2 = sc.nextInt();

        
        for (int i = 0; i < N1; i++) {
            arr1[i] = sc.nextInt();
        }
        for (int i = 0; i < N2; i++) {
            arr2[i] = sc.nextInt();
        }

        boolean isSubsequence = false;  

        for (int i = 0; i <= N1 - N2; i++) {  
            boolean match = true;
            for (int j = 0; j < N2; j++) {
                if (arr1[i + j] != arr2[j]) {
                    match = false;
                    break;  
                }
            }
            if (match) {
                isSubsequence = true;  
                break;
            }
        }

       
        if (isSubsequence) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
