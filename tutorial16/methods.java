import java.util.Scanner;

class methods
{
    public static void main (String args[])
    {
        Scanner input = new Scanner(System.in);
        boop boopObject = new boop();
        System.out.println("Enter the name of your first girlfriend here!");
        String temp = input.nextLine(); //assigns user's input into temp
        boopObject.setName(temp); //assigns the variable temp to setName. 
        boopObject.saying(); //prints out a sentence from boop.java.
    }
}