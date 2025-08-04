package JUL2025.JUL21;

import java.util.stream.IntStream;

public class Lambda03 {
    public static void main(String[] args) {
        int sum = getSumFromSevenToSeventy();
        System.out.println(sum);//2464

        int multiplication = getMultiplicationFromThreeToNine();
        System.out.println(multiplication);//181440

        System.out.println(getMultiplicationFromThreeToNine2());//181440



        System.out.println(getSumOfEvensBetweenTwoInt(13, 7));

    }

    //1 ) create a method that sums the integers between 7-70
    public static int getSumFromSevenToSeventy() {
        return IntStream.
                rangeClosed(7, 70).//range is specified so it strats from 7 and ends at 70
                reduce(Math::addExact).//Returns the sum of its arguments and reduce method combines all in one
                getAsInt();
    }

    //2 ) create a method that  products the integers between 3-9
    public static int getMultiplicationFromThreeToNine() {
        return IntStream.
                rangeClosed(3, 9).
                reduce(Math::multiplyExact).//Returns the product of its arguments and reduce method combines all in one
                getAsInt();
    }

    //2nd way
    public static int getMultiplicationFromThreeToNine2() {
        return IntStream.
                range(3, 10).//not includes 10 due to not range closed declaration
                reduce(Math::multiplyExact).
                getAsInt();
    }


    //3) create a method that prints the even numbers between two integers taken by user
    public static int getSumOfEvensBetweenTwoInt(int a, int b){
        if(a>b){//this is for making the smaller one a
            int temp = a;
            a=b;
            b=temp;
        }

        return IntStream.
                range(a+1,b).// from smaller to bigger now, that's why value exchange done above
                filter(Utils::isNumberEven).
                sum();
    }









}
