public class boop
{
    private String girlName;
    public void setName(String name) //assigns girlName name.
    {
        girlName = name;
    }
    public String getName() //returns a string
    {
        return girlName;
    }
    public void saying(){
        System.out.printf("Your first girlfriend was %s.", getName(); //takes the variable girlName and puts it into there. 
    }
}