/** This program is a simple calculator that allows me to understand how to create a class. How to create a constructor of that class which enables us to create an object. I was able to create methods that a common calculator performs. In the main method I practice printing out methods on an object.
*/

//Calculator class
public class Calculator{
  //Calculator constructor
  public Calculator(){

  }
  //add method
  public int add(int a, int b){
    return a + b;
  }

  //subtract method
  public int subtract(int a, int b){
    return a - b;
  }

  //multiplication method
  public int multiply(int a, int b){
    return a * b;
  }

  // division method
  public int dividie(int a, int b){
    return a / b;
  }

  // modulo method
  public int modulo(int a, int b){
    return a % b;
  }
  //main method
  //necessary for the program to run
  public static void main(String [] args){
      Calculator myCalculator = new Calculator();
      System.out.println(myCalculator.add(5, 7));
      System.out.println(myCalculator.subtract(45, 11));
  }
}
