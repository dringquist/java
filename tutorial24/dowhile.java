class dowhile
{
    public static void main (String args[])
    {
        int counter = 0;
        
        do
        {
            counter++; //these go first then conditions
            System.out.println(counter);
        }
        while(counter <= 10); //checks condition after going through loop
    } 
}