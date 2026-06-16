package Methods;

class MathWizard {

    // Instance variable
    int wizardLevel = 100;

    // Check Prime Number
    public boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }

        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }

        return true;
    }

    // Factorial using iteration
    public long factorial(int n) {
        long fact = 1;

        for (int i = 1; i <= n; i++) {
            fact *= i;
        }

        return fact;
    }

    // Overloaded factorial for double
    public double factorial(double n) {
        double fact = 1;

        for (int i = 1; i <= (int) n; i++) {
            fact *= i;
        }

        return fact;
    }

    // Fibonacci
    public int fibonacci(int n) {
        if (n == 0) return 0;
        if (n == 1) return 1;

        int first = 0;
        int second = 1;

        for (int i = 2; i <= n; i++) {
            int next = first + second;
            first = second;
            second = next;
        }

        return second;
    }

    // GCD using Euclidean Algorithm
    public int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    // LCM
    public int lcm(int a, int b) {
        return (a * b) / gcd(a, b);
    }

    // Power Function
    public long power(int base, int exp) {
        long result = 1;

        for (int i = 1; i <= exp; i++) {
            result *= base;
        }

        return result;
    }

    // Scope Demonstration
    public void showScope() {
        int wizardLevel = 50; // local variable

        System.out.println("Local Variable = " + wizardLevel);
        System.out.println("Instance Variable = " + this.wizardLevel);
    }
}

public class Functions {

    public static void main(String[] args) {
        MathWizard wizard = new MathWizard();

        System.out.println("Prime Check: " + wizard.isPrime(17));
        System.out.println("Factorial(int): " + wizard.factorial(5));
        System.out.println("Factorial(double): " + wizard.factorial(5.0));
        System.out.println("Fibonacci: " + wizard.fibonacci(8));
        System.out.println("GCD: " + wizard.gcd(12, 18));
        System.out.println("LCM: " + wizard.lcm(12, 18));
        System.out.println("Power: " + wizard.power(2, 5));

        wizard.showScope();
    }
}