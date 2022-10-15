import java.util.Scanner;

public class Test {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        System.out.println("How many Student are going to be added to database?");
        System.out.println("Enter: ");
        int numberOfStudent = Integer.parseInt(scanner.nextLine());


        for (int i = 0; i < numberOfStudent; i++) {


            System.out.println("Enter Student Name: ");
            String name = scanner.nextLine();
            System.out.println("Enter Year Of Student: ");
            int year = Integer.parseInt(scanner.nextLine());

            Student student = new Student(name,year);
        }

    }
}
