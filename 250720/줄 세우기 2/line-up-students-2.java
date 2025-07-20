import java.util.Scanner;
import java.util.Arrays;

class Student implements Comparable<Student> {
    int height, weight, index;


    public Student(int height, int weight, int index) {
        this.height = height;
        this.weight = weight;
        this.index = index;
    }

    @Override
    public int compareTo(Student student) {
        if (student.height == this.height) {
            return student.weight - this.weight;
        }
        return this.height - student.height;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
  
        Student[] students = new Student[n]; 
       
        for (int i = 0; i < n; i++) {
            int height = sc.nextInt();
            int weight = sc.nextInt();
            int index = i + 1;
           
            students[i] = new Student(height, weight, index);
        }
        Arrays.sort(students);
        
        for (int i = 0; i < n; i++) {
            
            System.out.print(students[i].height + " ");
            System.out.print(students[i].weight + " ");
            System.out.print(students[i].index + " ");
            System.out.println();
        }
    }
}
