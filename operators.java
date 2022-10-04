// different types of operators in java 

class Main {
  public static void main(String[] args) {

    //1. arithemetic operator 
    // declare variable 
    int a=10,b=20;

    // addition 
    System.out.println("a+b = " + (a+b));

    // subtraction 
    System.out.println("a-b = " + (a-b));

    // multiplication 
    System.out.println("a*b = " + (a*b));

    // division
    System.out.println("b/a = " + (b/a));

    //modulo to finr remainder 
    System.out.println("a%b = " + (a%b));


    //2. asignment operator in java 

    // creating variable
    int c=2;
     int var;
    //assign value using =
    var =c;
    System.out.println("var usin =: " + var);

    // assign value using +=
    var+=c;
    System.out.println("var using += : " + var);

    //assign value using *=
    var*=c;
    System.out.println("var using *= : " + var);

    //assign value using -=
    var-=c;
    System.out.println("var using -=: " + var);
    
    //3. java relational operator  

    //creating variable 
    int d=7,e=11;

    // value of d and e is 
    System.out.println(" d is  = " + d + " and e is "+ e);

    //== operator
    System.out.println(" == " + (d==e));

    //!= operator
    System.out.println("!= " + (d!=e));

    //<= operator
    System.out.println("<= " + (d<=e));

    //>= operator
    System.out.println("> = " + (d>=e));

    //4.java logical operator  

    //&& operator
    System.out.println((5>3) && (8>5));
    System.out.println((5>3) && (8<5));

    // || or operator
    System.out.println((5>3) || (8>5));
    System.out.println((5>3) || (8<5));

    //!operator
    System.out.println( !(5>3) );

    //5. java unary operator 
    int f=4;

    // pre inc
    System.out.println(++f);

    // pre dec
    System.out.println(--f);

    // post inc
    System.out.println(f++);

    // post dec
    System.out.println(f--);

   // logical complement opertor
    boolean  b1= true;
    // pre dec
    System.out.println(!b1);

    //6. java bitwise operator

    int x= 3;
    int y= 4;

    // bitwise or
    
    System.out.println("x|y = "+ (x|y));

    // bitwise and
    System.out.println("x&y = "+ (x&y));

    // left shifr
    System.out.println("x<<1 = "+ (x<<1));
     System.out.println("x<<2 = "+ (x<<3));

    // right shift
     System.out.println("x>>1 = "+ (x>>1));
     System.out.println("x>>2 = "+ (x>>2));

    // bitwise complement
     System.out.println("~x = "+ (~x));
    

    //other operator in java 
    String str = " santosh";
    boolean result;

    //check if str is instance of the str class
    result = str instanceof String;
      System.out.println("Is str an object of String? " + result);


    //ternary operator
    // it is an conditional operator

    int febday=28;
   String m;
    // ternary opt
    m = (febday==29) ? "not a leap year" : "leap year ";
    System.out.println(m);
    
    


    
    System.out.println("everything is fine ");
  }
}