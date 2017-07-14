import java.util.Scanner;

class condition
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("How old are you?");
        int age = input.nextInt();
                                        //true          false
        System.out.println(age >= 50 ? "You are old!" : "You are young");//question mark is boolean.
    }
}