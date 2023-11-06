public class Day7 {
    public static void main(String[] args) {
        int[] arrayOne = new int[] {10, 5, 15, 7, 20};

        int sum = 0;
        int runCount = 0;
        int maxValue = arrayOne[0];
        int minValue = arrayOne[0];
        for (int i = 0; i < arrayOne.length; i++){
            sum = sum + arrayOne[i];

            runCount++;

            if (arrayOne[i] > maxValue){
                maxValue = arrayOne[i];
            }

            if (arrayOne[i] < minValue){
                minValue = arrayOne[i];
            }
        }
        System.out.println("Sum: " + sum);
        System.out.println(("Average: " + (double) sum / runCount));
        System.out.println("Maximum: " + maxValue);
        System.out.println("Minimum: " + minValue);

    }
}