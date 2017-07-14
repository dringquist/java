import java.util.Scanner;

class elseif
{
    public static void main (String args[])
    {
        Scanner input = new Scanner(System.in);
        System.out.println("How old are you?");
        int age = input.nextInt();
        
        if (age >= 60)
        {
            System.out.println("You are considered a Senior Citizen!");
        }
        else if (age >= 50) //introduces else if
        {
            System.out.println("You are in yor 50's!");
        }
        else if(age < 50)
        {
            System.out.println("You are younger than 50!");
        }
        
    }
}