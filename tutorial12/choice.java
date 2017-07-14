import java.util.Scanner;

class choice
{
    public static void main(String args[])
    {
        Scanner input = new Scanner(System.in);
        int age = input.nextInt();
        switch (age) //takes variable and tests it against the case. if it has the value it will run whatever is inside the case. unless it's default. 
        {
            case 1: //this pretty much means "if (age == 1)"
                System.out.println("You can crawl!");
                break; //exits the loop once done.
            case 2: //if (age == 2)
                System.out.println("You can talk!");
                break;
            case 3: // if (age == 3)
                System.out.println("You can get in trouble!");
                break;
            default: //if age doesn't equal any of there, then this would what it would go to. 
                System.out.println("I do not know how old you are.");
                break;
        }
    }
}