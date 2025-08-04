package JUL2025.JUL16.Exceptions01;

public class E03 {
    public static void main(String[] args) {
        String s = "Java";
        getCharFromString(s,2);//v

        String t = "Java";
        getCharFromString(t,4);//



    }

    //when code try to access an index that is not exist, StringIndexOutOfBoundsException occurs
    public static void getCharFromString(String s, int idx) {


        try {
            char ch = s.charAt(idx);
            System.out.println(ch);
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("index doesn't exist.. "+e.getMessage());//String index out of range: 4
            System.out.println(e.getCause());//null
            e.printStackTrace();
            /*
            java.lang.StringIndexOutOfBoundsException: String index out of range: 4
            at java.base/java.lang.StringLatin1.charAt(StringLatin1.java:47)
            at java.base/java.lang.String.charAt(String.java:693)
            at day31mapsexceptions.E03.getCharFromString(E03.java:20)
            at day31mapsexceptions.E03.main(E03.java:9)
             */


        }


    }


}
