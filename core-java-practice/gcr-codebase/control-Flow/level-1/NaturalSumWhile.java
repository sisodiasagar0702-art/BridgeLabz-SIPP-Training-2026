import java.util.Scanner;

public class NaturalSumWhile {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a natural number: ");
        int number = input.nextInt();

        if (number > 0) {
            int formulaSum = number * (number + 1) / 2;
            int loopSum = 0;
            int counter = 1;

            while (counter <= number) {
                loopSum += counter;
                counter++;
            }

            System.out.println("Sum using formula is " + formulaSum);
            System.out.println("Sum using while loop is " + loopSum);
            System.out.println("Both computations are correct? " + (formulaSum == loopSum));
        } else {
            System.out.println("The number " + number + " is not a natural number");
        }

        input.close();
    }
}
