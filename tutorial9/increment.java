import java.util.Scanner;

class increment{
    public static void main (String args[]){
        Scanner boop = new Scanner(System.in);
        
        int tuna = 5;
        int bass = 18;
        //ADDITION
        ++tuna; //increments 1 to variable tuna.
        System.out.println(tuna);
        System.out.println(++tuna); //can also be applied in this print statement.
        System.out.println(tuna++); //1 is added after it's printed.
        System.out.println(tuna); //next print statement gets the 1 from the previous one. 
        //SUBTRACTION
        tuna = 5;
        System.out.println(--tuna); //similar to above, just subtraction instead.
        System.out.println(tuna--);
        System.out.println(tuna);
        
        tuna = 5;
        tuna = tuna + 5;        //adds 5 to tuna, making it 10.
        System.out.println(tuna);
        tuna +=8;               //since tuna is 10, it adds 8 to the 10, making it 18. 
        System.out.println(tuna);
        tuna -=8;               //subtracts instead of adding.
        System.out.println(tuna); 
        tuna *=8;               //multiplies 
        System.out.println(tuna);
        tuna /=8;               //divides
        System.out.println(tuna);
        tuna %=8;               //modulus
        System.out.println(tuna);
    }
}