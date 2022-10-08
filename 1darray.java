class Main {
  public static void main(String[] args) {
    // creating an array
    int[] age = { 12, 3 , 4, 5 ,6 };
    int[] roll = { 14, 53 , 45, 55 ,56 };
    // access each element of the above array 
   /* System.out.println("accessing elements of an array");
     System.out.println("first element : " + age[0]);
     System.out.println("second : " + age[2]);
    System.out.println("Second Element: " + age[1]);
   System.out.println("Third Element: " + age[2]);
   System.out.println("Fourth Element: " + age[3]);
   System.out.println("Fifth Element: " + age[4]);*/
    System.out.println("accessing elements of an array using for  loop");
     for(int i =0; i<age.length; i++)
       {
          System.out.println(" index of the array : " + age[i]);
       }


  // iterate the elements of the array using for - each loop
    System.out.println("Using for-each Loop:");
    for(int a : roll)
      {
         System.out.println(a);
      }

    // compute sum and average of the array elements
    int [] numbers ={ 2, -9, 0 ,5, 12, -25, 22, 9, 8, 12};
    int sum =0;
    Double avg;

    // access all elements using for each loop
    // add each element in sum
    for(int a : numbers)
      {
        sum = sum+a;
        
      }

    // get the total number of elements
    int  arraylength= numbers.length;
     avg = ((double)sum)/((double)arraylength);
     System.out.println("Sum = " + sum);
    System.out.println("Average = " + avg);
  }
}