package stringdemo;
public class StringTest {
    public static void main(String[] args) {
        String s1 = "Cat";
        String s2 = "Cat";
        if(s1==s2)
            System.out.println("S1 and S2 addresses are same");
        else
            System.out.println("S1 and S2 addresses are not same");
        if(s1.equals(s2))
            System.out.println("S1 and S2 have same contents");
        else
            System.out.println("S1 and S2 have different contents");
        String s3 = new String("Cat");
        if(s1==s3)
            System.out.println("S1 and S3 addresses are same");
        else
            System.out.println("S1 and S3 addresses are not same");
        if(s1.equals(s3))
            System.out.println("S1 and S3 have same contents");
        else
            System.out.println("S1 and S3 have different contents");
    }
}
