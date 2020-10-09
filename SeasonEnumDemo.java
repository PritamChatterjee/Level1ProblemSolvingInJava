package enumdemo;
enum Season{WINTER,SPRING,SUMMER,AUTUMN};
public class SeasonEnumDemo {
    public static void main(String[] args) {
        Season s1 = Season.SUMMER;
        System.out.println(s1.name());
        Season s2 = Season.valueOf("SUMMER");
        System.out.println(s2);
        if(s1==s2)
            System.out.println("true");
        else
            System.out.println("false");
        for(Season s : Season.values()){
            System.out.println(s + ":" + s.name());
        }
    }
}