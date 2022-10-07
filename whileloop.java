import java.util.Scanner;
class Main {
 public static void main(String[] args) {
int sum  = 0;
   // create an object of scanner class 
   Scanner input = new Scanner (System.in);
   // take integer input from user 
   int number = input.nextInt();
   // while loop continues
   // until entered number is positive 
   while(number>=0)
     {
       sum =sum+number;
         System.out.println("Enter a number");
      number = input.nextInt();

     }
     System.out.println("Sum = " + sum);
    input.close();
 }
}