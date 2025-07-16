import java.util.*;

class Student {
    String name;
    int height;
    double weight;

    public Student(String name, int height, double weight) {
        this.name = name;
        this.height = height;
        this.weight = weight;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 5;
        Student students[] = new Student[n];
        
        for (int i = 0; i < n; i++) {
            String name = sc.next();
            int height = sc.nextInt();
            double weight = sc.nextDouble();

            students[i] = new Student(name, height, weight);
        }

        Comparator<Student> heightDesc = (a, b) -> b.height - a.height;
        Comparator<Student> nameAsc = (a, b) -> a.name.compareTo(b.name);

        Arrays.sort(students, nameAsc);

        System.out.println("name");
        for (int i = 0; i < n; i++) {
            System.out.print(students[i].name + " ");
            System.out.print(students[i].height + " ");
            System.out.printf("%.1f \n", students[i].weight);
        }
        System.out.println();
        Arrays.sort(students, heightDesc);

        System.out.println("height");
        for (int i = 0; i < n; i++) {
            System.out.print(students[i].name + " ");
            System.out.print(students[i].height + " ");
            System.out.printf("%.1f \n", students[i].weight);
        }
        
    }
}