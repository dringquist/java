import java.util.Scanner;

class nest //tells us about nesting
//ez peasy
{
    public static void main (String args[])
    {
        Scanner input = new Scanner(System.in);
        System.out.println("How old are you?");
        int age = input.nextInt();
        
        if (age < 50)
        {
            System.out.println("You are young!");
        }
        else
        {
            if(age > 75)
            {
                System.out.println("You are really old!");
            }
            else
            {
                System.out.println("You are old!");
            }
        }
    }
}