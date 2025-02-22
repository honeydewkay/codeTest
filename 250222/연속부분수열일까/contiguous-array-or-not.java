import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int arr1[] = new int[101];
        int arr2[] = new int[101];
        int N1 = sc.nextInt();
        int N2 = sc.nextInt();

        
        for(int i = 0; i < N1; i++) {
            arr1[i] = sc.nextInt();
        }
        for (int i = 0; i < N2; i++) {
            arr2[i] = sc.nextInt();
        }
        for(int i = 0; i < N1; i++) {
            boolean perfect = true;

            for(int j = 0; j < N2; j++) {
                
                if(i + j >= N1) {
                    perfect = false;
                    break;
                }
            
                if(arr1[i + j] != arr2[j]) {
                    perfect = false;
                    break;
                }
            }
            if(perfect) {
                System.out.print("Yes");
                System.exit(0);
            }
        }
        System.out.print("No");
    }
}

