package arraydemo;
public class StudentDetails2 {
    public static void main(String[] args){
        String[][] students = new String[3][2];
        students[0][0]="S001";
        students[0][1]="John";
        students[1][0]="S002";
        students[1][1]="Bob";
        students[2][0]="S003";
        students[2][1]="Sam";
        System.out.println("Std ID\tName");
        for(int row=0 ; row < students.length; row++){ //returns the number of rows
            for(int col=0 ;col < students[row].length; col++){//returns the number of cols
                System.out.print(students[row][col]+"\t");
            }
            System.out.println("");
        }
        for(String[] row : students){
            for(String col : row){
                System.out.print(col+"\t");
            }
            System.out.println("");
        }
    }
}
