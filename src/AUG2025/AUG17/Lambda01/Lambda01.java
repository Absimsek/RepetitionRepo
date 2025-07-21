package AUG2025.AUG17.Lambda01;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Lambda01 {
    public static void main(String[] args) {
        /*
        1)Lambda is "Functional Programming", other is "Structured Programming"
        2) Functional Programming focuses on "what to do" .
           "Structured Programming" focuses on "how to do" .
        4)  Functional Programming used on Collections, and Arrays.
         */

        List<Integer> nums = new ArrayList<Integer>();
        nums.add(12);
        nums.add(9);
        nums.add(131);
        nums.add(14);
        nums.add(9);
        nums.add(10);
        nums.add(4);
        nums.add(12);
        nums.add(15);

        printElements1(nums);
        System.out.println();
        printElements2(nums);
        System.out.println();
        printEvenElements1(nums);
        System.out.println();
        printEvenElements2(nums);
        System.out.println();
        printSquareOfOddElements(nums);
        System.out.println();
        printCubeOfDistinctOddElements(nums);
        System.out.println();
        printSumOfSquaresOfDistinctEvenElements(nums);
        System.out.println();

        getMaxValue1(nums);
        getMaxValue2(nums);
        getMaxValue3(nums);
        getMaxValue4(nums);
        getMinValue1(nums);
        getMinValue2(nums);
        getMinValue3(nums);
        getMinValue4(nums);
        getMinGreaterThanSevenEven(nums);
    }

    //1) print list elements with space between each element(structured)
    public static void printElements1(List<Integer> nums) {
        for (Integer w : nums) {
            System.out.print(w + " ");
        }
    }

    //2)  print list elements with space between each element(functional)
    public static void printElements2(List<Integer> nums) {
        nums.
                stream()// functional programming begins
                .forEach(t -> System.out.print(t + " "));
    }


    //3) print even elements with space(structured)
    public static void printEvenElements1(List<Integer> nums) {
        for (Integer w : nums) {
            if (w % 2 == 0) {
                System.out.print(w + " ");
            }
        }
    }


    //4) print even elements with space(functional)

    public static void printEvenElements2(List<Integer> nums) {
        System.out.println("even with space");
        nums.
                stream().
                filter(t -> t % 2 == 0).// used for giving conditions
                forEach(t -> System.out.print(t + " "));
    }

    //5) print odd numbers squares with space (Functional)
    public static void printSquareOfOddElements(List<Integer> nums) {
        System.out.println("odd square with space");
        nums.
                stream().
                filter(t -> t % 2 != 0).
                map(t -> t * t).//used for updating the list
                forEach(t -> System.out.print(t + " "));
    }

    //6) print odd numbers cube and no multiplication of same element is allowed(Functional)
    public static void printCubeOfDistinctOddElements(List<Integer> nums) {
        System.out.println("odd cube with space no multiple element");
        nums.
                stream().
                distinct().//used to take different elements only
                filter(t -> t % 2 != 0).
                map(t -> t * t * t).
                forEach(t -> System.out.print(t + " "));

    }

    //7)print distinct, even numbers squares summation

    public static void printSumOfSquaresOfDistinctEvenElements(List<Integer> nums) {
        System.out.println(" distinct, even numbers squares summation");
        Integer sum =
                nums.
                        stream().
                        distinct().
                        filter(t -> t % 2 == 0).
                        map(t -> t * t).
                        reduce(0, (t, u) -> t + u);//merges all elements of stream into one by specified binary operation
        System.out.println(sum);
        // reduce initializes t as identity (0 here), then assign new values through stream.
    }



    //9)find max value in list
    //1.way
    public static void getMaxValue1(List<Integer> nums) {
        System.out.println("max value");
        Integer max =
                nums.
                        stream().
                        distinct().
                        reduce(Integer.MIN_VALUE, (t, u) -> t > u ? t : u);
        System.out.println(max);//131

    }

    //2.way
    public static void getMaxValue2(List<Integer> nums) {
        Integer max =
                nums.
                        stream().
                        distinct().
                        reduce(nums.getFirst(), (t, u) -> t > u ? t : u);
        System.out.println(max);//131
    }

    //3.way
    public static void getMaxValue3(List<Integer> nums) {
        Integer max =
                nums.
                        stream().
                        distinct().
                        sorted().//sorts
                        reduce((t, u) -> u)// goes to last element
                        .get();

        System.out.println(max);
    }

    //4.way
    public static void getMaxValue4(List<Integer> nums) {
        Integer max =
                nums.
                        stream().
                        distinct().
                        reduce(Math::max).get();
        System.out.println(max);
    }

    //10)find min
    //1.way
    public static void getMinValue1(List<Integer> nums) {
        System.out.println("min value");
        Integer min =
                nums.
                        stream().
                        distinct().
                        reduce((t, u) -> t > u ? u : t).
                        get();
        System.out.println(min);
    }

    //2.way
    public static void getMinValue2(List<Integer> nums) {
        Integer min =
                nums.
                        stream().
                        distinct().
                        sorted(Comparator.reverseOrder()).
                        reduce((t, u) -> u).
                        get();
        System.out.println(min);
    }

    //3.way
    public static void getMinValue3(List<Integer> nums) {
        Integer min =
                nums.
                        stream().
                        distinct().
                        sorted().
                        reduce((t, u) -> t).
                        get();
        System.out.println(min);
    }

    //4.way
    public static void getMinValue4(List<Integer> nums) {
        Integer min =
                nums.
                        stream().
                        distinct().
                        sorted().
                        reduce((t, u) -> Math.min(t, u)).
                        get();
        System.out.println(min);
    }

//11)find the smallest even number that is bigger than 7
    public static void getMinGreaterThanSevenEven(List<Integer> nums){
        System.out.println("find the smallest even number that is bigger than 7");
       Integer min =
               nums.
                       stream().
                       filter(t->t>7 && t%2==0 ).
                       sorted().//10,12,12,14
                       reduce((t,u)->t).// gets first element
                       get();

        System.out.println(min);//10

    }



}
