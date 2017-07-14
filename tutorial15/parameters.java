import java.util.Scanner;

class parameters
{
    public static void main (String args[])
    {
        Scanner input = new Scanner(System.in);
        tuna tunaObject = new tuna();
        System.out.println("What is your name?"); //asks for the user's name
        String name = input.nextLine(); //takes the users name
        tunaObject.simpleMessage(name); // then gives it to the tuna file and into the argument 'name'
    }
}