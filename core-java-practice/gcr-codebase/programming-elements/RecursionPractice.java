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


/*Problem 2: Calculate Factorial
Write a recursive function to calculate the factorial of a number.
Input:
5

Output:
120

 */

public class RecursionPractice {
    static int factorial(int n) {
        // Base Case
        if (n == 0 || n == 1) {
            return 1;
        }

        // Recursive Call
        return n * factorial(n - 1);
    }

    public static void main(String[] args) {
        int result = factorial(5);
        System.out.println("Factorial of 5 is: " + result);
    }
}

/*Problem 3: Sum of First N Natural Numbers
Find the sum of first N natural numbers using recursion.
Input:
N = 5

Output:
15


 */
public class RecursionPractice {
    static int sumOfNaturalNumbers(int n) {
        // Base Case
        if (n == 0) {
            return 0;
        }

        // Recursive Call
        return n + sumOfNaturalNumbers(n - 1);
    }

    public static void main(String[] args) {
        int result = sumOfNaturalNumbers(5);
        System.out.println("Sum of first 5 natural numbers is: " + result);
    }   
}

/* Problem 4: Reverse a String Using Recursion
Write a recursive function to reverse a given string.
Input:
hello

Output:
olleh


*/  
public class RecursionPractice {
    static String reverseString(String str) {
        // Base Case
        if (str.isEmpty()) {
            return str;
        }

        // Recursive Call
        return reverseString(str.substring(1)) + str.charAt(0);
    }

    public static void main(String[] args) {
        String result = reverseString("hello");
        System.out.println("Reversed string is: " + result);
    }
}

/*Problem 5: Check Palindrome Using Recursion
Determine whether a string is palindrome using recursion.
Input:
madam

Output:
Palindrome*/

public class RecursionPractice {
    static boolean isPalindrome(String str) {
        // Base Case
        if (str.length() <= 1) {
            return true;
        }

        // Check first and last characters
        if (str.charAt(0) != str.charAt(str.length() - 1)) {
            return false;
        }

        // Recursive Call
        return isPalindrome(str.substring(1, str.length() - 1));
    }

    public static void main(String[] args) {
        String input = "madam";
        boolean result = isPalindrome(input);
        if (result) {
            System.out.println(input + " is a palindrome.");
        } else {
            System.out.println(input + " is not a palindrome.");
        }
    }
}

/* Problem 6: Find nth Fibonacci Number
Return the nth Fibonacci number using recursion.
Input:
6

Output:
8

*/
public class RecursionPractice {
    static int fibonacci(int n) {
        // Base Cases
        if (n == 0) {
            return 0;
        }
        if (n == 1) {
            return 1;
        }

        // Recursive Call
        return fibonacci(n - 1) + fibonacci(n - 2);
    }

    public static void main(String[] args) {
        int result = fibonacci(6);
        System.out.println("The 6th Fibonacci number is: " + result);
    }
}
/*Problem 7: Calculate Power(x,n)
Compute xⁿ using recursion.
Input:
x = 2
n = 5

Output:
32 */
public class RecursionPractice {
    static double power(double x, int n) {
        // Base Case
        if (n == 0) {
            return 1;
        }

        // Recursive Call
        return x * power(x, n - 1);
    }

public static void main(String[] args) {
        double result = power(2, 5);
        System.out.println("2 raised to the power of 5 is: " + result);
    }
}

/*Problem 8: Generate All Subsets of an Array
Given an array, generate all possible subsets recursively.
Input:
[1,2]

Output:
[]
[1]
[2]
[1,2]


 */

public class RecursionPractice {

    static void subset(int[] arr,
                       int index,
                       ArrayList<Integer> list) {

        if (index == arr.length) {

            System.out.println(list);
            return;
        }

        // Include
        list.add(arr[index]);

        subset(arr, index + 1, list);

        // Backtrack
        list.remove(list.size() - 1);

        // Exclude
        subset(arr, index + 1, list);
    }

    public static void main(String[] args) {

        int[] arr = {1, 2};

        subset(arr, 0, new ArrayList<>());
    }
}

/*Problem 9: Solve Tower of Hanoi
Print all steps required to move N disks from Source to Destination.
Input:
N = 3

Output:
Move disk 1 from A to C
Move disk 2 from A to B
Move disk 1 from C to B
...

 */
public class RecursionPractice {

    static void towerOfHanoi(int n, char source, char destination, char auxiliary) {
        // Base Case
        if (n == 1) {
            System.out.println("Move disk 1 from " + source + " to " + destination);
            return;
        }

        // Move n-1 disks from source to auxiliary
        towerOfHanoi(n - 1, source, auxiliary, destination);

        // Move the nth disk from source to destination
        System.out.println("Move disk " + n + " from " + source + " to " + destination);

        // Move n-1 disks from auxiliary to destination
        towerOfHanoi(n - 1, auxiliary, destination, source);
    }

    public static void main(String[] args) {
        int N = 3;
        towerOfHanoi(N, 'A', 'C', 'B');
    }
}

/*Problem 10: Generate All Permutations of a String
Generate all possible permutations of a string recursively.
Input:
ABC

Output:
ABC
ACB
BAC
BCA5
CAB
CBA

*/
public class RecursionPractice {

    static void permute(String str, String ans) {
        // Base Case
        if (str.length() == 0) {
            System.out.println(ans);
            return;
        }

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            String ros = str.substring(0, i) + str.substring(i + 1);
            permute(ros, ans + ch);
        }
    }

    public static void main(String[] args) {
        String input = "ABC";
        permute(input, "");
    }
}

 


