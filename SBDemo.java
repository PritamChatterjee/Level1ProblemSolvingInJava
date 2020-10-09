package stringbuilderdemo;
public class SBDemo {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        System.out.println(sb.toString());
        System.out.println(sb.capacity());
        System.out.println(sb.length());
        StringBuilder sb1 = new StringBuilder(50);
        System.out.println(sb1.toString());
        System.out.println(sb1.capacity());
        StringBuilder sb2 = new StringBuilder("Hello Friends.");
        System.out.println(sb2.toString());
        System.out.println(sb2.capacity());
        System.out.println(sb2.length());
        sb2.append(" We are friends.");
        System.out.println(sb2.toString());
        System.out.println(sb2.capacity());
        sb2.append(" We are the best.");
        System.out.println(sb2.toString());
        System.out.println(sb2.capacity());
        sb2.delete(0, 15);
        System.out.println(sb2.toString());
    }
}
