class class1
{
    public static void main (String args[])
    {
        class2 class2Object = new class2(); //calls other classes into this one.
        class2Object.simpleMessage(); //chooses which body it wants to use and it needs the name. 
    }
}