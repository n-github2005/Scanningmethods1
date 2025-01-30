import java.util.*;//(astrick) is used to import all the packages
public class Scaningmethods1 {
    //nextLine method of integer data types
    public static void main (String[] args){
        Scanner input = new Scanner (System.in);//creating an object instance
        System.out.println("enter an integer");
        int data = input.nextInt();// for integer data type
        System.out.println("using nextInt():" + data);
        input.close();//close the scanner
    }
}
