package enumdemo;
enum Day{
    MON, TUE, WED, THU, FRI, SAT, SUN
};
public class WeekDayDemo{
    public static void main(String[] args) {
        Day firstDay = Day.MON;
        System.out.println(firstDay);
        Day lastDay = Day.SUN;
        System.out.println(lastDay);
        for(Day d : Day.values()){
            System.out.println(d.name());
        }
    }
}
