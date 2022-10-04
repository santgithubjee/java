//this is my first program in java 
class Main1 {
  public static void main(String[] args) {
    int sped;
    sped =90;
    sped =98;
    //rule for naming the variable 
    int AGE= 23;
    int age=34;
    int _age=45;
    int $age=35;
   // all are right 

   //  we can not do like that 
   //  int age my=23;
   // int 1age=56;
    
    
      
    System.out.println(sped);
    System.out.println(age);
    int a=1;
   // doble b= 2.5;
    char c= 'g';
    System.out.println(a);
  //  System.out.print(b);

    System.out.println(c);  // here a ,b and c 
    //are literals 
    // boolean literals 
    boolean flag1=true;
    boolean flag2=false;
    System.out.println(flag1);

    // integer literals
    
    // 1. binary base 2
    // 2. decimal base 10
    // 3. octal base 8
    // 4. hexa decimals base 16

    // binary
    int binaryNumber = 0b101011;
    // octal 
    int octalNumber = 0345;
    // decimal
    int deciNimber = 34;
    // hexa
    int hexNumber = 0x2F;
    System.out.println(binaryNumber);   
    System.out.println(octalNumber);   
    System.out.println(deciNimber);
    System.out.println(hexNumber);

    // in java , binary starts with ob, octal start with o, and hexadecimal start with 0x

     // floating poitn literals 
    double mydouble =3.4;
    float myfloat =3.5F;

    //3.45*10^2
    double mydou =3.45e2;
    System.out.println(mydouble);
    System.out.println(myfloat);
    System.out.println(mydou);

    //character literals 

    char letter  = 'a';
    char newline = '\n';
    System.out.println(letter);
    System.out.println(newline);

    //string literal
    String str1= "my frist java program";
    System.out.println(str1);
  }
}