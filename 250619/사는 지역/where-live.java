import java.util.Scanner;
import java.util.Arrays;

class Person {
    String names;
    String addresses;
    String regions;

    public Person(String names, String addresses, String regions) {
        this.names = names;
        this.addresses = addresses;
        this.regions = regions;
    }
}
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        Person[] person = new Person[n];

        int index = 0;
        
        for (int i = 0; i < n; i++) {

            String name = sc.next();
            String addresse = sc.next();
            String region = sc.next();
            person[i] = new Person(name, addresse, region);
            

            if(person[i].names.compareTo(person[index].names) > 0) {
                index = i;
            }
        }
       
        System.out.println("name " + person[index].names);
        System.out.println("addr " + person[index].addresses);
        System.out.println("city " + person[index].regions);
      
    }
}