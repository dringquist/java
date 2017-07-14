import java.util.Scanner;

class integer{
    public static void main (String args[]){
        Scanner input = new Scanner(System.in);
        
        int girls, boys, people;
        System.out.println("How many girls are in the class?: ");
        girls = input.nextInt();
        System.out.println("How many boys are in the class?: ");
        boys = input.nextInt();
        people = girls + boys;
        System.out.println(people); //when providing input, it would round to the closest answer possible. So 11/3 = 9. Not 3.something.
    }                              //it's a whole number and not a decimal because it's not declared as a double.
}
//Bucky talks about all the math operators we could use. Such as multiplication, addition, subtraction, and modulus.
//Modulus is dividing a number and using the remainder instead. 11/3 = 2