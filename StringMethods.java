package stringdemo;
public class StringMethods {
    public static void main(String[] args) {
        String str = "newstring";
        int len = str.length();
        System.out.println(len);
        char ch = str.charAt(0);
        System.out.println(ch);
        str = "Welcome to Java";
        char[] array = new char[6];
        str.getChars(8, 10, array, 0);
        System.out.println(array);
        String str1 = "fruits";
        String str2 = "fruits are good";
        int result = str1.compareTo(str2);
        System.out.println(result);
        
    }
}
