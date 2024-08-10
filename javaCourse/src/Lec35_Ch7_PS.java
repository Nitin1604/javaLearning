public class Lec35_Ch7_PS {
    // Question 1 Solution
    static void multiplication(int n) {
        for (int i = 1; i <= 10; i++) {
            System.out.format("%d X %d = %d\n", n, i, n * i);
        }
    }

    // Question 2 Solution
    static void patternStar(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i + 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    // Question 3 Solution
    static int sumRec(int n) {
        // Base condition
        if (n == 1) {
            return 1;
        }
        return n + sumRec(n - 1);
    }

    // Question 4 Solution
    static void patternReverseStar(int n){
        for (int i = 0; i<n ; i++){
            for(int j=n;j>i;j--){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    // Question 5 Solution
    static int fib(int n) {
        /* if(n==1){
            return 0;
        }
        else if(n==2){
            return 1;
        } */
        if (n == 1 || n == 2) {
            return n - 1;
        } else {
            return fib(n - 1) + fib(n - 2);
        }
    }

    // Question 6 Solution

    // Function to calculate the average of numbers
    public static float calculateAverage(float... numbers) {
        float sum = 0f;

        // Check if numbers are provided
        if (numbers.length == 0) {
            throw new IllegalArgumentException("At least one number must be provided");
        }

        // Sum up all the numbers
        for (float number : numbers) {
            sum += number;
        }

        // Calculate the average
        return sum / numbers.length;
    }

    // Question 7 Solution

    // Method to print a single line with n stars
    public static void printStars(int n) {
        if (n == 0) {
            return;
        }
        System.out.print("* ");
        printStars(n - 1); // recursive call
    }

    // Method to print the pattern
    public static void printPattern(int n) {
        if (n == 0) {
            return;
        }
        printStars(n); // prints n stars
        System.out.println(); // moves to the next line
        printPattern(n - 1); // recursive call for the next line
    }

    // Question 8 Solution
    static void pattern_rec(int n) {
        if (n > 0) {
            pattern_rec(n - 1);
            for (int i = 0; i < n; i++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    // Question 9 Solution
       // Method to convert Celsius to Fahrenheit
       public static float celsiusToFahrenheit(float celsius) {
        
        return (celsius * 9/5) + 32;

       }

       // Question 10 Solution

       // Method to calculate the sum of first n natural numbers
       public static int calculateSum(int n) {
           int sum = 0;
           for (int i = 1; i <= n; i++) {
               sum += i;
           }
           return sum;
       }

    public static void main(String[] args) {
        // Question 1 : Write a Java method to print the multiplication table of a number n.
         multiplication(7);

        /*
        Question 2 : Write a program using functions to print the following pattern
                    *
                    * *
                    * * *
                    * * * *
         */
         patternStar(4);

        // Question 3 : Write a recursive function to calculate the sum of first n natural numbers.
         int c = sumRec(4);
         System.out.println(c);

         /*
            Question 4 : Write a function to print the following pattern
                         * * * *
                         * * *
                         * *
                         *
          */
            patternReverseStar(4);

        // Question 5 : Write a function to print the nth term of the Fibonacci series using recursion.
         int result = fib(7);
         System.out.println(result);


         // Question 6 : Write a function to find the average of a set of numbers passed as arguments.
        float avg = calculateAverage(10.5f, 20.02f, 30.5f, 40.02f);
        System.out.println("The average is: " + avg);

        // Question 7 : Repeat problem 4 using Recursion.

        int n = 4; // Number of lines in the pattern
        printPattern(n);

        // Question 8 : Repeat problem 2 using Recursion.
        pattern_rec(4);

        // Question 9 : Write a function to convert Celsius temperature into Fahrenheit.
        float celsius = 25.2f;
        float fahrenheit = celsiusToFahrenheit(celsius);
        System.out.println(celsius + "°C is equal to " + fahrenheit + "°F");

        // Question 10 : Repeat problem 3 using an iterative approach.
        int iterativeNum = 10;
        int Result = calculateSum(iterativeNum);
        System.out.println("The sum of the first " + n + " natural numbers is: " + Result);

    }
}
