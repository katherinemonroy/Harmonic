// Katherine Monroy
// 2368029
// kmonroy@chapman.edu
// CPSC 231-02
// MP1: Recursion and Intro to Classes

public class Harmonic{

  public static double calcIterativeHarmonic(int n){ // the parameter is int n which is stated in the command line after : java Harmoic
//that returns the value of the nth harmonic using iteration (a loop).
    double harmonicSum = 0.0; // initilize harmonicSum
        for (int i = 1; i <= n; i++) { //loops b/w the numbers under whatever n is. ex. if n = 5, runs through 0,1,2,3,4,5
            harmonicSum += 1.0 / i; // calculates what the harmoic sum is for each int n
        }
       return harmonicSum; //returns a the  harmonic number (a double) example : when n = 1 ... harmonicSum = 1.0
}
  public static double calcRecursiveHarmonic(int n){
//that returns the value of the nth harmonic using recursion.
  double harmonicRsum = 0.0;// initilize harmonicRSum
   if (n== 0.0){

     return 0.0; //returns the base recursion for when n = 0
   }
   if(n == 1.0) {
      return 1.0; //returns the base recursion for when n = 0
  }
  else {
      return (1.0 / n) + calcRecursiveHarmonic(n - 1); //returns a the nth harmonic number recursion(a double) example : when n = 1 or 1.0 ... harmonicSum = 1.0
  }
}
public static void main(String[] args) {
    int arg = Integer.parseInt(args[0]); // this gets the int n input directly from the terminal command line and stores it in variable arg

    System.out.println("iteratively: "); // // starts to print the harmonic numbers iteravly after here

    for (int i = 0; i <= arg; ++i){
      System.out.println(calcIterativeHarmonic(i)); //calls the iterative method 20 times
    }
    System.out.println(); // prints empty line
    System.out.println("recursively: "); // starts to print the harmonic numbers recursively after here

    for (int i = 0; i <= arg; ++i){
      System.out.println(calcRecursiveHarmonic(i)); //calls the recursive method 20 times
    }

  }

}
