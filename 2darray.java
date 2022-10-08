class Main {
  public static void main(String[] args) {

    // java multi dimensional arrays

    // creating 2d arrays
    int[][] a = {
        { 1, 2, 3 },
        { 4, 6, 7, 8 },
        { 7 }, };
    // calculate the length of each row
    /*
     * System.out.println("Length of row 1: " + a[0].length);
     * System.out.println("Length of row 2: " + a[1].length);
     * System.out.println("Length of row 3: " + a[2].length);
     */

    for (int i = 0; i < a.length; i++) {
      for (int j = 0; j < a.length; j++) {
        System.out.println(a[i][j]);
      }
    }

    // accessing arrays using for-each loop
    for (int[] outer : a) {
      for (int data : outer) {
        System.out.println(data);
      }
    }
  }
}