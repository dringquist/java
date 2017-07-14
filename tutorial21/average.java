import java.util.Scanner;

class average
{
    public static void main (String args[])
    {
        Scanner input = new Scanner(System.in);
        System.out.println("How many numbers are there?"); //asks for user input, how many there is
        double totalnumber = input.nextDouble();
        double total = 0;
        double average;
        int counter = 0;
        double grade = 0;
        System.out.print("Enter the ");
        System.out.print(totalnumber);
        System.out.println(" numbers!");
        while (counter < totalnumber)
        {
            grade = input.nextDouble(); //magic happens here
            total = total + grade;
            counter++;  //counter
        }
        average = total / totalnumber;    //adds up the grades then divides it by the number there are
        System.out.println(average);
    }
}