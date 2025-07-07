package Temmuz2025.t7;

public class StringBuilder01 {
    // assigning strings to new values usually end up by creating a new container and leaving old one
    //instead of that stringbuilders are used so that no need to leave old ones to garbage collector and consume additional memory
    // so that when ur in need of change string a lot than we use stringbuilders to progress faster,


    public static void main(String[] args) {
        StringBuilder strbld01=new StringBuilder();//starts an empty string
        strbld01.append("full");
        System.out.println(strbld01);

        //string builders are fixed size so that they are dynamiv
        //starts with 1-16 bit memo, when cap is passed cap will be 2x amount and also summed by 2
        //cap= 2cap+2
        // capacity and length difference is that length shows how much of capacity is used
        //while capacity shows how much it can be as most

        System.out.println(strbld01.capacity());// cap is 16 as length is not reached top
        strbld01.append(" of characters");
        System.out.println(strbld01.capacity());// cap is increased since length needs more space

        // default cap is 16 but we can change it as follows
        StringBuilder sb3= new StringBuilder(3);
        System.out.println(sb3.capacity());//cap is 3
        sb3.append("full");
        System.out.println(sb3.capacity());//cap is 8 so that 2*cap+2 ==> 3*2+2=8

        //we can reverse the strings in string builder
        StringBuilder sb1=new StringBuilder("this string will be reversed");
        System.out.println(sb1);
        System.out.println(sb1.reverse());//prints reversed version
        sb1.reverse();//back to normal again

        // we can delete characters by index
        System.out.println(sb1.deleteCharAt(10));

        // or by substring deletion
        System.out.println(sb1.delete(4, 8));//deleted all characters at indexes between 4-8 8 not included,

        // we can add new strings by replace methods as in string manipulation
        System.out.println(sb1.replace(1, 4, "samet"));

        //or bby insert method using index to insert new string
        System.out.println(sb1.insert(7, "XXX"));

        //using compareTo method we can compare alphabetical order of strings
        // -1 means 2nd to compare is before
        // 1 means 1st to compare is before
        StringBuilder sb2=new StringBuilder("defense");
        StringBuilder sb4=new StringBuilder("tower");
        int c1=sb2.compareTo(sb4);
        System.out.println(c1);

        if (c1<0){
            System.out.println("second letter is "+Math.abs(c1)+" characters before than first letter in alphabet\n");
        } else if (c1>0) {
            System.out.println("first letter is "+c1+" characters before than second letter in alphabet\n");
        }else{
            System.out.println("characters equal");
        }

        //note that string builders dont have all string manipulation methods such as upper or lower letters
        //to use the methods we should convert between these 2 data type

        //converting strbuilder to str
        String str =sb2.toString().toUpperCase();//made all characters uppercase
        System.out.println(str);

        //converting str into strbuilder
        StringBuilder newSb2=new StringBuilder(str);//now back to str builder so that we can use its methods
        newSb2.append("haha");
        System.out.println(newSb2);

        // from here we can understand that we can convert both when needed to other ones methods
    }

}
