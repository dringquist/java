class logical 
{
    public static void main (String args[])
    {
        int MAN, WOMAN;
        MAN = 18;
        WOMAN = 68; //double amphersans can be replaced with or (||). 
        if (MAN > 18 && WOMAN < 60)
        {
            System.out.println("You can enter.");
        }
        else //if not true, then it goes to this one. it means false. 
        {
            System.out.println("You cannot enter. ");
        }
    }
}