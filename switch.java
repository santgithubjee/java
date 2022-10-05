
import java.util.Scanner;
class Main {
  public static void main(String[] args) {
   /* int number =44;
    String size;

    // switch statements to check the size
    switch(number)
      {
        case 23:
          size=" small";
            break;
        case 34 :
          size=" medium";
          break;

        case 44:
          size="large";
          break;

        case 56:
          size= " extra large";
          break;

        default :
          size ="unknown";
          break;
      
          
          
      }
     System.out.println("Size: " + size);*/
    // using calculator using switch case in java
        Scanner input = new Scanner(System.in);
    	  
        System.out.print("Enter an number1 : ");
        int number1 = input.nextInt();
    System.out.print("Enter an number2 : ");
        int number2 = input.nextInt();
    System.out.print("Enter enter operatiion that you want to perform: ");
        String op = input.next();
int result;
      switch(op)
        {
          case "+":
            result = (number1+number2);
            System.out.println(result);
            break;

          case "-":
            result=(number1-number2);
            System.out.println(result);
            
            break;

          case "*":
            result=(number1*number2);
            System.out.println(result);
            
            break;

          case "/":
            result=(number1/number2);
            System.out.println(result);
            
            break;

          case "%":
            result=(number1%number2);
            System.out.println(result);
            
            break;

          default :
            System.out.println("enter valid operation");
         
            break;
            
         //
        }
  
        // closing the scanner object
        input.close();
  }
}