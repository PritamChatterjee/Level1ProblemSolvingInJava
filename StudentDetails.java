package arraydemo;
public class StudentDetails {
    public static void main(String[] args) {
        int[] stdid = {1,2,3,4,5};
        int[] marks = {90,85,96,82,78};
        String[] names = {"John","Sam","Rose","William","Max"};
        for(int i=0; i < names.length; i++){
            System.out.println("Student ID:"+ stdid[i]+"\tName:"+names[i]+"\tScore:"+marks[i]);
        }
    }
}
