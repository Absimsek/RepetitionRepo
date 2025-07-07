package Temmuz2025.t7;

public class VarArgs01 {
    // var args is used to assign unknown number of parameters to a method so that user can give lots of parameters
    // there cannot be 2 varargs in one method
    // if there are also certain parameters than varargs will be added to the end

    public static int add(int... a) {// method for summing parameters given regardless of their count

        int sum = 0;

        for (int w : a) {
            sum = sum + w;

        }
        return sum;
    }

    public static int add(int a, int b){// method for summing 2 parameter
        return a+b;
    }

    public static int add(int a, int b, int c){//method for summing 3 parameters
        return a+b+c;
    }

    public static void main(String[] args) {
        System.out.println(add(1));//varargs
        System.out.println(add(1,2));//2 parameter method
        System.out.println(add(1,2,3));//3 parameter method
        System.out.println(add(1,2,3,4));//varargs can sum all the parameters so  it is very usefull
        //when varargs used no need to create a lot of same method and method overloading

    }
}
