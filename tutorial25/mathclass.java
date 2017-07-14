import java.util.Scanner;

class mathclass
{
    public static void main  (String args[])
    {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter a NEGATIVE number");
        int absolute = input.nextInt();
        System.out.println(Math.abs(absolute)); //any number will be POSITIVE
        
        System.out.println("Enter a number that can be ROUNDED");
        double ceil = input.nextDouble();
        System.out.println(Math.ceil(ceil)); //rounds a number
        
        System.out.println("Enter a number that can be ROUNDED");
        double floor = input.nextDouble();
        System.out.println(Math.floor(floor)); //rounds DOWN a number
        
        System.out.println("Enter TWO numbers");
        double fnum = input.nextDouble();
        double snum = input.nextDouble();
        System.out.println(Math.max(fnum, snum)); //takes multiple parameters in one method. gives maximum of a number
        
        System.out.println("Enter TWO numbers");
        double fnum2 = input.nextDouble();
        double snum2 = input.nextDouble();
        System.out.println(Math.min(fnum2, snum2)); //takes multiple parameters. instead of max, it takes the min.
        
        System.out.println("Enter TWO numbers");
        double fnum3 = input.nextDouble();
        double snum3 = input.nextDouble();
        System.out.println(Math.pow(fnum3, snum3)); //exponent. ex. 5^3  <---- in this order 
        
        System.out.println("Enter a number that can be SQUARED");
        int sqrt = input.nextInt();
        System.out.println(Math.sqrt(sqrt)); //square roots a number. ex.9
    } 
}