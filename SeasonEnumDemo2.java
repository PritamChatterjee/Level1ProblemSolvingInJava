package enumdemo;
enum Season1{
    WINTER(5),SPRING(10),SUMMER(15),AUTUMN(20);
    private int value;
    private Season1(int value){ //constructor is special function, it's name is same as enums
        this.value=value;
    }
    public int getValue(){
        return value;
    }
}
public class SeasonEnumDemo2 {
    public static void main(String[] args) {
        for(Season1 s : Season1.values())
            System.out.println(s + ":" + s.getValue());
    }
}
