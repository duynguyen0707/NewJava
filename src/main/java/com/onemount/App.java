package com.onemount;

import java.util.Scanner;

/**
* Hello world!
*
*/
public class App
{
public static void main( String[] args )
{
    Scanner scanner = new Scanner(System.in);

//    System.out.println( "n= " );
//    int n = scanner.nextInt();
//    switch (n){
//        case 1:
//            System.out.println( "Một" );
//            break;
//        case 2:
//            System.out.println("Hai");
//            break;
//        default:
//            System.out.println("Không xử lí đc");
//            break;
//    }

//    Scanner scanner2 = new Scanner(System.in);
//    System.out.println("Enter number");
//    int n = scanner.nextInt();
//    int result = sum2a(n);
//
//    System.out.format("The sum of two numbers is: %d\n", result);
//
//    boolean resultIsPrime = isPrime(n);
//    System.out.format("The prime number is: %b\n", resultIsPrime);
//
//    if (isPrime(n)) {
//        System.out.format("%d is a prime number", n);
//    }
//    else
//    {
//        System.out.format("%d is not a prime number", n);
//    }


    Scanner scanner1 = new Scanner(System.in);
    System.out.println("Enter number a: ");

    int a = scanner.nextInt();

//    System.out.println("Enter number b: ");
//
//    int b = scanner.nextInt();
//
//    System.out.println("Enter number n: ");
//
//    int n = scanner.nextInt();

//if (isSimmetry1(number)) {
//    System.out.format("%d is a Simitry number\n", number);
//}
//else {System.out.println(number + " is not a Simitry number");}
//
//if (isSquareNumber(number)) {
//    System.out.format("%d is a square number\n", number);
//}
//else {System.out.println(number + " is not a square number");}
//
//
//long result = factorial(number);
//System.out.format("Factorial of %d is %d\n", number, result);
//
//long result1 = sumFactorial(number);
//System.out.format("Sum of %d is %d\n", number, result1);

//int result = sumNumber(a,b,n);
//System.out.format("Tong cac so nho hon n, chia het cho a nhung khong chia het cho b la %d", result);

//    int result = sumPrime(a);
//    System.out.println("Tong so nguyen to: " + result);

    long result = reverseNumber(a);
    System.out.format("Reverse number of %d is %d", a,result);

}



    public static

// Nhap vao 1 so nguyen duong, xuat ra so dao nguoc

    public static long reverseNumber(long number) {
    long result = 0;
    int digit = 0;
    while (number != 0) {
        digit = (int) (number%10);
        result = result * 10 + digit;
        number = number /10;
    }
    return result;
    }

// Tinh tong cac so nguyen to nho hon n (0<n<50)
    public static int sumPrime (int n) {
    int result = 0;

        for (int i = 2; i < n; i++) {
      boolean isP = isPrime(i);
      System.out.println(isP ? "Prime" : "Not Prime");
      if (isP) {
          result+=i;
      }
      else continue;

        }
        return result;


    }


// nhap 3 so a,b va n. Tinh tong cac so nguyen duong nho hon n chia het cho a nhung khong chia het cho b
    public static int sumNumber (int a, int b, int n) {
    int result = 0;

    if (a<n && b<n) {
        for (int i=0; i<n; i++) {
            if (i%a==0 && i%b!=0) {
                result += i;
            }
        }
        return result;
    }
   else return -1;
}


// tinh s = 1! + 2! +...+n!
    public static long sumFactorial(long number) {

    long result = 0;

        long factorial = 1;
    for (int i = 1; i <= number; i++) {
        for (int j = 1; j <= i; j++) {
        factorial =factorial * j;
//        System.out.println(factorial);
        }
        result += factorial;
        factorial = 1;
//        System.out.println(result);

    }
    return result;

    }



// tinhs giai thua s = 1*2*3....*n = n!

    public static long factorial (int n) {
    long result= 1;
    for (int i = 1; i <= n; i++) {
        result= result*i;
    }
    return result;

    }


public static boolean isSquareNumber (int n) {
    boolean result = false;

    double square = Math.sqrt(n);

    int squareFloor = (int)Math.floor(square);
    if (squareFloor - square ==0) {
        result = true;
        return result;
    }
    else {
    return false;
    }
}

public static boolean isSimmetry (int n) {
    boolean result = false;
    String str = Integer.toString(n);
    int length = str.length();
    for (int i = 0, j = length-1; i < j; i++, j--) {
        if (str.charAt(i) != str.charAt(j)) {
            return false;
        }
    }

    return true;
}


public static boolean isSimmetry1 (int n) {
    boolean result = false;
    int original = n;
    int numberSim =0;

while ( n>0) {
    int digit = n%10;
    numberSim = numberSim*10+digit;
    n = n/10;

}
    if (numberSim == original) {
        result = true;
        return result;
    }
    else return false;
}


public static  int sum2a(int n) {
    int sum = 0;
    for (int i = 1; i <= n; i++) {
        sum += i;
    }
    return sum;
}

public static boolean isPrime(int n) {
    for (int i = 2; i <= n/2; i++) {
        if (n % i == 0) {
            return false;
        }

    } return  true;
}
}
