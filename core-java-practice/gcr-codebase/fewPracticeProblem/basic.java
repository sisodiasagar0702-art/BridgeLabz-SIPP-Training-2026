import java.util.Scanner;

public class basic {
	private static final double PI = Math.PI;

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Choose a program to run:");
		System.out.println("1. Welcome to Bridgelabz");
		System.out.println("2. Add Two Numbers");
		System.out.println("3. Celsius to Fahrenheit Conversion");
		System.out.println("4. Area of a Circle");
		System.out.println("5. Volume of a Cylinder");
		System.out.println("6. Calculate Simple Interest");
		System.out.println("7. Perimeter of a Rectangle");
		System.out.println("8. Power Calculation");
		System.out.println("9. Calculate Average of Three Numbers");
		System.out.println("10. Convert Kilometers to Miles");
		System.out.print("Enter your choice: ");

		int choice = scanner.nextInt();

		switch (choice) {
			case 1:
				welcomeToBridgelabz();
				break;
			case 2:
				addTwoNumbers(scanner);
				break;
			case 3:
				celsiusToFahrenheit(scanner);
				break;
			case 4:
				areaOfCircle(scanner);
				break;
			case 5:
				volumeOfCylinder(scanner);
				break;
			case 6:
				simpleInterest(scanner);
				break;
			case 7:
				perimeterOfRectangle(scanner);
				break;
			case 8:
				powerCalculation(scanner);
				break;
			case 9:
				averageOfThreeNumbers(scanner);
				break;
			case 10:
				kilometersToMiles(scanner);
				break;
			default:
				System.out.println("Invalid choice");
		}

		scanner.close();
	}

	private static void welcomeToBridgelabz() {
		System.out.println("Welcome to Bridgelabz!");
	}

	private static void addTwoNumbers(Scanner scanner) {
		System.out.print("Enter first number: ");
		double firstNumber = scanner.nextDouble();
		System.out.print("Enter second number: ");
		double secondNumber = scanner.nextDouble();
		System.out.println("Sum: " + (firstNumber + secondNumber));
	}

	private static void celsiusToFahrenheit(Scanner scanner) {
		System.out.print("Enter temperature in Celsius: ");
		double celsius = scanner.nextDouble();
		double fahrenheit = (celsius * 9 / 5) + 32;
		System.out.println("Temperature in Fahrenheit: " + fahrenheit);
	}

	private static void areaOfCircle(Scanner scanner) {
		System.out.print("Enter radius: ");
		double radius = scanner.nextDouble();
		double area = PI * radius * radius;
		System.out.println("Area of circle: " + area);
	}

	private static void volumeOfCylinder(Scanner scanner) {
		System.out.print("Enter radius: ");
		double radius = scanner.nextDouble();
		System.out.print("Enter height: ");
		double height = scanner.nextDouble();
		double volume = PI * radius * radius * height;
		System.out.println("Volume of cylinder: " + volume);
	}

	private static void simpleInterest(Scanner scanner) {
		System.out.print("Enter principal: ");
		double principal = scanner.nextDouble();
		System.out.print("Enter rate: ");
		double rate = scanner.nextDouble();
		System.out.print("Enter time: ");
		double time = scanner.nextDouble();
		double simpleInterest = (principal * rate * time) / 100;
		System.out.println("Simple Interest: " + simpleInterest);
	}

	private static void perimeterOfRectangle(Scanner scanner) {
		System.out.print("Enter length: ");
		double length = scanner.nextDouble();
		System.out.print("Enter width: ");
		double width = scanner.nextDouble();
		double perimeter = 2 * (length + width);
		System.out.println("Perimeter of rectangle: " + perimeter);
	}

	private static void powerCalculation(Scanner scanner) {
		System.out.print("Enter base: ");
		double base = scanner.nextDouble();
		System.out.print("Enter exponent: ");
		double exponent = scanner.nextDouble();
		double result = Math.pow(base, exponent);
		System.out.println("Result: " + result);
	}

	private static void averageOfThreeNumbers(Scanner scanner) {
		System.out.print("Enter first number: ");
		double firstNumber = scanner.nextDouble();
		System.out.print("Enter second number: ");
		double secondNumber = scanner.nextDouble();
		System.out.print("Enter third number: ");
		double thirdNumber = scanner.nextDouble();
		double average = (firstNumber + secondNumber + thirdNumber) / 3;
		System.out.println("Average: " + average);
	}

	private static void kilometersToMiles(Scanner scanner) {
		System.out.print("Enter distance in kilometers: ");
		double kilometers = scanner.nextDouble();
		double miles = kilometers * 0.621371;
		System.out.println("Distance in miles: " + miles);
	}
}
