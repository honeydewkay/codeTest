import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        final int INT_MAX = Integer.MAX_VALUE;
        Scanner sc = new Scanner(System.in);
        
        int arr[] = new int[10];
        int up = INT_MAX;
        int down = 0;
        

        for(int i = 0; i < 10; i++) {
            arr[i]= sc.nextInt();
        }
        for(int i = 0; i < 10; i++) {
            if(arr[i] > 500 && up > arr[i]) {
                up = arr[i];
                
            }
            else if(arr[i] < 500 && down < arr[i]) {
                down = arr[i];
            }
        }
        System.out.print(down+ " " + up);

    }
}
