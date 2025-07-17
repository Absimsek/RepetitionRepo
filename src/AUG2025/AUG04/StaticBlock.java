package AUG2025.AUG04;

public class StaticBlock {
    //when we press run compiler first goes to main method and execute it
    // but if there are any static blocks within a class, and we press run
    // static block will be executed first and when it is done, time for main method to execute begins
    // so if we need to execute some methods, some variables or other things before everything starts to working
    // we use those we want to access fast inside a static block and it is done

    public static void main(String[] args) {// will be executed last
        System.out.println("this is inside main method");
    }
    static {// even main method is above, this block will be executed first
        System.out.println("this is inside static block 1");
    }

    static {// this method will be executed second due to another static block above it
        System.out.println("this is inside static block 2");
    }

}