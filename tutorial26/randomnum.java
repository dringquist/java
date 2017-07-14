import java.util.Random;

class randomnum
{
    public static void main (String args[])
    {
        Random dice = new Random();
        int number, counter;
        
        for (counter = 1 ; counter <= 10 ; counter++)
        {
            number = 1+dice.nextInt(6); //the 1+ makes it 1-6 instead of 0-5
            System.out.println(number); //prints out numbers outputted by the dice
        }
    }
}