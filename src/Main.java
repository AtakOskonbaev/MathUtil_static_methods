public class Main {
    public static void main(String[] args) {

        //five static methods
        //isPrime()
        System.out.println(MathUtil.isPrime(23));  //true
        System.out.println(MathUtil.isPrime(11));  //true
        System.out.println(MathUtil.isPrime(100));  //false

        //gcd()
        System.out.println((MathUtil.gcd(21, 7))); //7
        System.out.println((MathUtil.gcd(98, 56)));  //14
        System.out.println((MathUtil.gcd(0, 100)));  //0

        //lcm()
        System.out.println(MathUtil.lcm(15, 25));  //75
        System.out.println(MathUtil.lcm(10, 3));  //30
        System.out.println(MathUtil.lcm(17, 15));  //255

        //fibonacci()
        MathUtil.fibonacci(2);  //0 1
        MathUtil.fibonacci(5);  //0 1 1 2 3
        MathUtil.fibonacci(7);  //0 1 1 2 3 5 8


        //factorial()
        System.out.println(MathUtil.factorial(3));  //6
        System.out.println(MathUtil.factorial(8));  //40320
        System.out.println(MathUtil.factorial(10));  //3628800


        //five non-static methods
        MathUtil mathUtil = new MathUtil();

        //isPerfectNumber()
        System.out.println(mathUtil.isPerfectNumber(6));  //true
        System.out.println(mathUtil.isPerfectNumber(28));  //true
        System.out.println(mathUtil.isPerfectNumber(23));  //false

        //sumOfDigits()
        System.out.println(mathUtil.sumOfDigits(123));  //6
        System.out.println(mathUtil.sumOfDigits(5123));  //11
        System.out.println(mathUtil.sumOfDigits(64));  //10

        //reverseNumber()
        System.out.println(mathUtil.reverseNumber(64));  //46
        System.out.println(mathUtil.reverseNumber(6479));  //6479
        System.out.println(mathUtil.reverseNumber(34));  //43

        //isArmstrongNumber()
        System.out.println(mathUtil.isArmstrongNumber(153));  //true
        System.out.println(mathUtil.isArmstrongNumber(123));  //false
        System.out.println(mathUtil.isArmstrongNumber(5));  //true

        //nextPrime()
        System.out.println(mathUtil.nextPrime(11));  //13
        System.out.println(mathUtil.nextPrime(560));  //563
        System.out.println(mathUtil.nextPrime(34));  //37

    }
}