public class App {
    public static void main(String[] args) {
        int[] numbers = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        int sum = 0;
        for (int number : numbers) {
            sum += number;
            //Write a code that shows me the increments of number variable
            System.out.println("Number: " + number);
            

        }
        System.out.println("The sum of the numbers is: " + sum);
    }
}