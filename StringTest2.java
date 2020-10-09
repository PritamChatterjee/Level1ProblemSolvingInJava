package stringdemo;
public class StringTest2 {
    public static void main(String[] args) {
        String s1 = "Hello";
        String s2 = s1;
        if(s1 == s2)
            System.out.println("S1 and S2 addresses are same");
        else
            System.out.println("S1 and S2 addresses are not same");
        s1 = s1 + " World";
        if(s1 == s2)
            System.out.println("S1 and S2 addresses are same");
        else
            System.out.println("S1 and S2 addresses are not same");
    }
}
