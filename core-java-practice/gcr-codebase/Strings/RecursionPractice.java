/*Problem 1: Print Numbers from N to 1
Write a recursive function to print numbers from N to 1.
Input: 
N = 5
Output: 
5 4 3 2 1
 */
public class RecursionPractice {
      static void printNumbers(int n) {

        // Base Case
        if (n == 0) {
            return;
        }

        System.out.print(n + " ");

        // Recursive Call
        printNumbers(n - 1);
    }

    public static void main(String[] args) {
        printNumbers(5);
    }
}
