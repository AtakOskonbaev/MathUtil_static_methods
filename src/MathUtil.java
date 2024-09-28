import java.lang.reflect.Array;

public class MathUtil {

    //five static methods
    public static boolean isPrime(int n)
    {
        if(n == 1) //check if n = 1
        {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false; // n is divisible by i, so it is not prime
            }
        }
        return true;
    }

    public static int gcd(int a, int b)
    {
        int result;
        if(a == 0 || b == 0) //check for a or b = 0
        {
            return 0;
        }
        //find the min of a and b
        result = Math.min(a, b);
        for(int i = result; i > 0; i--)
        {
            if(a % result == 0 && b % result == 0) //break if both are dividable
            {
                break;
            }
            result--;
        }
        return result;
    }

    public static int lcm(int a, int b)
    {
        int result;
        if (a > b) //find the largest
        {
            result = a;
        }
        else
        {
            result = b;
        }
        for (int i = result; i > 0; i++)
        {
            if (result % a == 0 & result % b == 0) //if the largest dividable by both, return largest
            {
                break;
            }
            result++; //if not, make it +1
        }
        return result;
    }

    public static void fibonacci(int n)
    {
        int a = 0, b = 1; // starting values for Fibonacci

        for (int i = 1; i <= n; i++) {
            System.out.print(a + " ");
            int next = a + b; // calculate the next term
            a = b; // update a to the next term
            b = next; // update b to the next term
        }
        System.out.println();
    }

    public static int factorial(int n)
    {
        int result = 1;
        for (int i = 1; i <= n; i++) //multiply all numbers from 1 to n
        {
            result *= i;
        }
        return result;
    }

    //five non-static methods
    public boolean isPerfectNumber(int n)
    {
        int result = 0;
        for (int i = 1; i <= n/2; i++) //check divisors from 1 to n/2
        {
            if (n % i == 0)
            {
                result += i; //add to the result
            }
        }
        return result == n;
    }

    public int sumOfDigits(int n)
    {
        int result = 0;
        while(n >= 10) //add till the last digit
        {
            result += n % 10;
            n /= 10;
        }

        return result + n; //add the last digit
    }

    public int reverseNumber(int n)
    {
        int reversed = 0;
        while (n != 0) {
            int digit = n % 10;          // get the last digit
            reversed = reversed * 10 + digit; // add it to the reversed number
            n /= 10;
        }
        return reversed;
    }

    public boolean isArmstrongNumber(int n)
    {
        int originalNumber = n;
        int sum = 0;
        int digits = String.valueOf(n).length(); // count the number of digits

        while (n > 0) {
            int digit = n % 10;
            sum += (int) Math.pow(digit, digits); // raise it to the power of digits and add to sum
            n /= 10;
        }

        return sum == originalNumber;
    }

    public int nextPrime(int n)
    {
        n++;

        while (!isPrime(n)) {
            n++;
        }

        return n;
    }
}
