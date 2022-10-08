class lamp{
  //stores the values of light
  // true if light is on 
  //false if light is off
  boolean ison;

  // method to turn on the light
  void turnon()
  {
    ison=true;
    System.out.println("Light on? " + ison);
  }
  // method to turnoff the light
  void turnoff()
  {
    ison = false;
    System.out.println("Light on? " + ison);
  }
}
class Main {
  public static void main(String[] args) {

    // create objects led and helogen
    lamp led = new lamp();
    lamp helogen = new  lamp();

    //turning on the light
      // by calling turnon method
    led.turnon();
    
    // turn off the light by
    // calling method turnOff()
    helogen.turnoff();
    System.out.println("Hello world!");
  }
}