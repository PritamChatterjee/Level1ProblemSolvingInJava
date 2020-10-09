package enumdemo;
enum Compass{ //enum is like a class and it inherits from java.lang.Enum
    NORTH(1,5),SOUTH(2,10),EAST(3,15),WEST(4,20);
    private int seqNo;
    private int value;
    private Compass(int s,int v){
        this.seqNo=s;
        this.value=v;
    }
    public int getSeqNo(){
        return seqNo;
    }
    public int getValue(){
        return value;
    }
}
public class CompassDemo {
    public static void main(String[] args) {
        for(Compass c : Compass.values()){
            System.out.println(c.name()+":"+c.getSeqNo()+":"+c.getValue());
        }
    }
}
