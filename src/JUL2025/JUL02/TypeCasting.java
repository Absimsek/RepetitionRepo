package JUL2025.JUL02;

public class TypeCasting {
    // type casting is used for converting  numeric data types to each other
    // from int to double , double to float, and so on
    // numeric data types are byte - short - int - double - float
    // if bit of first data type is lower than second one than java automatically converts it.
    //which is called as AutoWidening
    // for the opposite way, So from bigger data to smaller one it should be done by coders
    //which is called as ExplicitNarrowing and too risky

    byte age =13;
    int ageInt=age;//AutoWidening from byte to int data

int weight=90;
// short weightSrt=weight; not working because java cant risk it automatically to specify it and make it we use keywords
short weightSrt=(short)weight; // AutoNarrowing
}
