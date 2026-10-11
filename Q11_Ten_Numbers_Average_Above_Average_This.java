import java.util.Scanner;
class NumberAnalyzer {
    private double[] numbers;
    public NumberAnalyzer(double[] numbers) { this.numbers = numbers; }
    public double calculateAverage() {
        double sum = 0;
        for (double number : this.numbers) sum += number;
        return sum / this.numbers.length;
    }
    public int countAboveAverage(double average) {
        int count = 0;
        for (double number : this.numbers) if (number > average) count++;
        return count;
    }
}
public class Q11_Ten_Numbers_Average_Above_Average_This {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[] numbers = new double[10];
        System.out.println("Enter 10 numbers:");
        for (int i = 0; i < numbers.length; i++) {
            System.out.print("Number " + (i + 1) + ": ");
            numbers[i] = scanner.nextDouble();
        }
        NumberAnalyzer analyzer = new NumberAnalyzer(numbers);
        double average = analyzer.calculateAverage();
        System.out.println("Average: " + average);
        System.out.println("Numbers above average: " + analyzer.countAboveAverage(average));
        scanner.close();
    }
}
