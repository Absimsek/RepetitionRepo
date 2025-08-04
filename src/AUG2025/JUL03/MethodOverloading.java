package AUG2025.JUL03;

public class MethodOverloading {
    // method overloading is using the same method name but changing the parameters of it
    // if both names and parameters of 2 methods are same than these methods are exact same methods so no need to duplication
    // except from parameters nothing is cause a method overloading even changing return type or making it static doesn't affect it

    int sum(int a,int b,int c){
         return a+b+c;
     }

     int sum(int a,int b){// method overloaded coder can choose which to use by entering 2 or 3 data
         return a+b;
     }
     // if sum(2,3) used second method is called if sum(2,3,1) used than first method is called

}
