//java basic input and output 
import java.util.Scanner;
class Main {
  public static void main(String[] args) {


      // java output

    
        System.out.println("1. println ");
        System.out.println("2. println ");
    	
        System.out.print("1. print ");
        System.out.print("2. print"); 


       // printing vadiables and literals
        Double number = -10.6;
    	
        System.out.println(5);
        System.out.println(number);


    // print concatenated string 
    Double num = -11.3;
    System.out.println("I am " + "awesome.");
    System.out.println("Number = " + num);


    // java input

    Scanner input = new Scanner(System.in);
    System.out.print("enter the integer: ");
    int number1 = input.nextInt();
    System.out.println("You entered " + number1);
    input.close();

    
    System.out.println("everything is fine ");
  }
}