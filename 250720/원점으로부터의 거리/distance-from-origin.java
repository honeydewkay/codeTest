import java.util.Scanner;
import java.util.Arrays;

class Point implements Comparable<Point> {
    int x, y, length, index;

    public Point(int x, int y, int length, int index) {
        this.x = x;
        this.y = y;
        this.length = length;
        this.index = index;
    }

    @Override
    public int compareTo(Point point) {
        return this.length - point.length;
    } 
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        Point[] point = new Point[n];

        for (int i = 0; i < n; i++) {
            
           int x = sc.nextInt();
           int y = sc.nextInt();
           int length = Math.abs(x) + Math.abs(y);
           int index = i + 1;

            point[i] = new Point(x, y, length, index);
        }
        
        Arrays.sort(point);

        for(int i = 0; i < n; i++) {
            System.out.println(point[i].index);
            
        }
    }
}
