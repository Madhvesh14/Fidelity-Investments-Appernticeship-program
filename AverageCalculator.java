public class AverageCalculator {
    public static double calculateAverage(double[] numbers){
        if (numbers.length == 0){
            return 0;
        }
        double sum = 0;
        for (double num : numbers){sum += num;
        }
        return sum / numbers.length;
    }
    public static void main(String[] args) {
        double[] numbers = {10.5,20.0,30.75,40.25};
        double average = calculateAverage(numbers);
        System.out.println("the average of the numbers is " + average);
    }
}
