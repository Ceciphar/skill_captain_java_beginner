public class Day6 {
    public static void main(String[] args) {
        // prints out i from 1 to 10
        for (int i = 1; i < 11; i++) {
            System.out.print(i + " ");
        }
        System.out.println();

        // print out even numbers between 1 and 20 (including 20).
        int x = 1;
        while (x <= 20) {
            if (x % 2 == 0) {
                System.out.print(x + " ");
            }
            x++;
        }
        System.out.println();

        // number valdiation between 1 and 10;
        int userNumber = 3;
        boolean allowBreak = false;
        do {
            //check if the userNum is between 1 AND and 10
            if (userNumber >= 1 && userNumber <= 10){
                System.out.println("You entered "+ userNumber);
                // if the loop is entered then we allow the doWhile loop to break
                allowBreak = true;
            }
        } while (allowBreak == false);
    }
}