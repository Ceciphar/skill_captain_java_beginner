import java.util.Scanner;
public class Day3 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);


        System.out.print("Enter your name: ");
        String userName = scanner.nextLine();

        System.out.print("Enter your age: ");
        int age = scanner.nextInt();



        System.out.printf("Hello, %s! You are  %d years old.", userName, age);

    }
}