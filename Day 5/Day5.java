import java.util.Scanner;
public class Day5{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the first number");
        int num1 = Integer.valueOf(scanner.nextLine());
        System.out.println("Enter the second number");
        int num2 = Integer.valueOf(scanner.nextLine());

        System.out.println("Enter the operator you wish to use ( *, /, +, -)");
        String operator = scanner.nextLine();
        System.out.println("________________________________________________");


        switch (operator) {
            case "*":
                System.out.printf("%d * %d = %d", num1, num2, num1 * num2);
                break;
            case "/":
                System.out.printf("%d / %d = %d", num1, num2, num1 / num2);
                break;
            case "+":
                System.out.printf("%d + %d = %d", num1, num2, num1 + num2);
                break;
            case "-":
                System.out.printf("%d - %d = %d", num1, num2, num1 - num2);
                break;
        }

    }
}