import java.util.Scanner; //similar to a library in C. Gets the scanner to get an input.

class input {
    public static void main (String args[]){
        Scanner input = new Scanner (System.in); //when prompted, whatever the computer is given as a variable from the user, it will be considered the variable input.
        System.out.println(input.nextLine()); //this prints out whatever is inputted into the variable. Since it says "input.nextLine"
    }
}