import java.util.Scanner;

class compound  //A=P(1+R)^n
{
    public static void main (String args[])
    {
        double amount;
        double principle = 10000;
        double rate = .01;
        
        for(int day = 1 ; day <= 20 ; day++)
        {                                   //(1+R)^n
            amount = principle * Math.pow(1 + rate, day); //exponent multiplies whatever the rate + 1 to the power of day is and times it by prinicple
            System.out.println(day + "   " + amount); 
        }
    }
}