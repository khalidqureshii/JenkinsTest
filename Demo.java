package PascalTriangle;

import java.util.Scanner;
class Demo {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter Number: ");
        int num = s.nextInt();

        boolean quit = false;
        while (!quit) {
            System.out.println("Enter a choice: \n1. Factorial\n2. Test If Armstrong\n"
                    + "3. Test if Palindrome\n4. Test if Prime\n5. Test if in fibonacci series\n6. Print "+ num+
                    " Numbers in Fibonnaci Series\n7. Quit");

            int choice = s.nextInt();

            switch (choice) {
                case 1:
                    factorial(num);
                    break;

                case 2:
                    testArmstrong(num);
                    break;

                case 3:
                    testPalindrome(num);
                    break;

                case 4:
                    testPrime(num);
                    break;

                case 5:
                    testFibonacci(num);
                    break;

                case 6:
                    printFibonacciSeries(num);
                    break;

                default:
                    quit = true;
                    break;
            }
        }
    }

    public static void factorial(int n) {
        if (n<0) {
            System.out.println("Invalid Number");
        }

        else if (n == 0 || n==1) {
            System.out.println("Factorial of " + n + " is 1");
        }

        else {
            int ans = 1;
            for (int i = 2; i<= n; i++) {
                ans = ans * i;
            }
            System.out.println("Factorial of " + n + " is " + ans);
        }
    }

    public static void testArmstrong(int n) {
        int rem,num, sum = 0;
        num = n;
        while (num != 0) {
            rem = num%10;
            num /= 10;
            sum += rem*rem*rem;
        }

        if (sum == n) {
            System.out.println(n + " is an Armstrong Number");
        }

        else {
            System.out.println(n + " is not an Armstrong Number");
        }
    }

    public static void testPalindrome(int n) {
        int rem,num, newNum = 0;
        num = n;

        while (num != 0) {
            rem = num%10;
            num /= 10;

            if (newNum == 0) {
                newNum = rem;
            }
            else {
                newNum *= 10;
                newNum += rem;
            }
        }

        if (newNum == n) {
            System.out.println(n +" is a Palindrome");
        }
        else {
            System.out.println(n +" is not a Palindrome");
        }


    }

    public static void testPrime(int n) {
        boolean prime = true;
        for (int i = 2; i<=n/2; i++) {
            if (n%i == 0) {
                prime = false;
                break;
            }
        }

        if (prime) {
            System.out.println(n + " is a Prime Number");
        }
        else {
            System.out.println(n + " is not a Prime Number");
        }
    }

    public static void printFibonacciSeries(int n) {
        int num1=0, num2=1, num3;

        System.out.println();

        if (n == 0) {
            System.out.print(0 + " ");
        }

        if (n==1) {

        }

        else {
            System.out.print(0 + " ");
            System.out.print(1 + " ");

            for (int i = 1; i<=n-2; i++) {
                num3 = num1 + num2;
                num1 = num2;
                num2 = num3;
                System.out.print(num3 + " ");
            }
        }
        System.out.println(" ");

    }

    public static void testFibonacci(int n) {
        int num1=0, num2=1, num3;
        boolean found = false;

        while (num1 <= n) {
            if (num1 == n || num2 == n) {
                found = true;
                break;
            }
            num3 = num1 + num2;
            num1 = num2;
            num2 = num3;
        }

        if (found) {
            System.out.println("The number " + n + " is a fibonacci number");
        }
        else {
            System.out.println("The number " + n + " is not a fibonacci number");
        }
    }

}
