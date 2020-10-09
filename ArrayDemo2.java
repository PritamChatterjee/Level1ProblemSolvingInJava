package arraydemo;
public class ArrayDemo2 {
    public static void main(String[] args) {
        java.util.Scanner input = new java.util.Scanner(System.in);
        /*int[] array = {10,20,30,40,50};
        for(int i=0; i < array.length; i++) //length is the property
            System.out.println(array[i]);*/
        int myarray[] = new int[5];
        for(int i=0; i <myarray.length; i++){
            myarray[i] = input.nextInt();
        }
        for(int i : myarray){
            System.out.println(i);
        }
    }
}
