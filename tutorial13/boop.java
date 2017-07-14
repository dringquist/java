import java.util.Scanner;

class boop
{
    public static void main(String args[])
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Give me a number less than 10!: "); //ask for user input
        int counter = input.nextInt();
        
        while (counter < 10) //while the variable counter is less than 0, it would continue. If it equals 10, then it would stop. 
        {
            System.out.println(counter);
            counter++;
        }
    }
}