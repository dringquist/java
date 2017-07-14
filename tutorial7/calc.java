import java.util.Scanner; //imports scanner code

class calc {
    static public void main (String args[]){ //main
        Scanner input = new Scanner(System.in); 
        double fnum, snum, answer; //declares variables
        System.out.println("Enter your first number: ");
        fnum = input.nextDouble(); //asks for first number and goes into variable
        System.out.println("Enter your second number: ");
        snum = input.nextDouble(); 
        answer = fnum + snum; //adds up the two variables into an answer
        System.out.println(answer); //displays answer
    }
}