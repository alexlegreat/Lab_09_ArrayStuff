import java.util.Scanner;
import java.util.Random;

public class Main {

    static int[] dataPoints = new int[100];
    static double avg = 0;
    static double sum = 0;

    public static double getAverage(int values[]){
      double sum = 0;
      for (int value : values) {
          sum += value;
      }
        return sum / values.length;
    }


    public static void main(String[] args) {

        int[] dataPoints = new int[100];
        Random gen = new Random();

        for (int i = 0; i < dataPoints.length; i++) {
            dataPoints[i] = gen.nextInt(100) + 1;
        }
        System.out.println();

        for (int i = 0; i < dataPoints.length; i++) {
            System.out.print(dataPoints[i] + " | ");
        }
        System.out.println();

        double average = 0;
        double sum = 0;
        Scanner in = new Scanner(System.in);

        for (int i = 0; i < dataPoints.length; i++) {
            sum += dataPoints[i];
            average = sum / dataPoints.length;
        }
        System.out.println("The Sum is " + sum + ", The average is " + average);

        int target = SafeInput.getRangedInt(in, "Input number between 1 and 100", 1, 100);
        int count = 0;
        for (int i = 0; i < dataPoints.length; i++) {
            if (dataPoints[i] == target) {
                count++;
            }
        }


        if (count > 0) {
            System.out.println("The value " + target + " was found " + count + " times in the array.");
        } else {
            System.out.println("The value " + target + " was not found in the array.");
        }

        int foundLocus = -1;

        for (int i = 0; i < dataPoints.length; i++) {
            if (dataPoints[i] == target) {
                foundLocus = i;
                break;
            }
        }
        if (foundLocus != -1) {
            System.out.println("The value " + target + " was found at index " + foundLocus + ".");
        } else {
            System.out.println("The value " + target + " was not found in the array.");
        }

        int minVal = dataPoints[0];
        int maxVal = dataPoints[0];

        for (int i = 1; i < dataPoints.length; i++) {
            if (dataPoints[i] < minVal) {
                minVal = dataPoints[i];
            }
            if (dataPoints[i] > maxVal) {
                maxVal = dataPoints[i];
            }
        }

        System.out.println("The minimum value is " + minVal + " and the maximum value is " + maxVal);

        System.out.println("Average of the dataPoints is: " + getAverage(dataPoints));
    }

}