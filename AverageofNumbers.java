package array;

public class AverageofNumbers {
    public static void main(String[] args) {
        double[] numArray = { 5, 10, 15};
        double sum = 0.0;

        for (double num: numArray) {
            sum += num;
        }

        double average = sum / numArray.length;
        System.out.format("The average is: %.2f", average);
    }
}

