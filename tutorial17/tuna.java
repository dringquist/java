public class tuna
{
    private String girlName;
    
    public tuna(String name) //constructor class has to be the same name as class
    {
        girlName = name;
    }
    
    public void setName(String name) //assigns girlName name.
    {
        girlName = name;
    }
    
    public String getName() //returns a string
    {
        return girlName;
    }
    
    public void saying(){
        System.out.printf("Your first girlfriend was %s.", getName()); //takes the variable girlName and puts it into there. 
    }
}