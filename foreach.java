class Main {
  public static void main(String[] args) {
     // create an array
    int[] numbers = {3, 4, 5, -5, 0, 12};
    int sum =0;
    
    // for each loop 
    for (int number: numbers) {
     sum = sum +number;
    }
     System.out.println(sum);
  }
}