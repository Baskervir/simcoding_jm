package Chapter2;

public class StringTester {
    public static void main(String[] args) {
        String s1 = "ABC";
        String s2 = "XYZ";

        System.out.println("s1 is " + s1);
        System.out.println("s2 is " + s2);

        System.out.println("modify s1 : ABC -> FBI");
        s1 = "FBI";
        System.out.println("s1 is " + s1);
        System.out.println("s2 is " + s2);
    }
}
